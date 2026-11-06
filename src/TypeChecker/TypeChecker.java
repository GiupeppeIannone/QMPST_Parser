package TypeChecker;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;

import GlobalType.GlobalType;
import LocalType.LEnd;
import LocalType.LRecursion;
import LocalType.LocalType;
import LocalType.Receive;
import LocalType.Send;
import ProgramType.Branching;
import ProgramType.Call;
import ProgramType.Conditional;
import ProgramType.Definition;
import ProgramType.Generation;
import ProgramType.Inaction;
import ProgramType.Measurement;
import ProgramType.ProgramType;
import ProgramType.Selection;
import ProgramType.UnitOp;
import ProjectionAlgorithm.ASTParticipantVisitor;
import ProjectionAlgorithm.ProjectionVisitor;

record ThetaEntry(List<String> types, LocalType returnType) {
}

public class TypeChecker {
    public GlobalType globalType;
    public Map<String, ProgramType> programTypeMap;
    public Map<String, LocalType> localTypesMap;

    /*
     * private Map<String, String> Gamma = new HashMap<>();
     * private Map<String, String> Delta = new HashMap<>();
     * private Map<String, String[]> Theta = new HashMap<>();
     */

    public TypeChecker(GlobalType globalType, Map<String, ProgramType> programTypeMap) {
        // TODO: mettere delle guard condition;
        this.globalType = globalType;
        this.programTypeMap = new HashMap<>();
        this.programTypeMap.putAll(programTypeMap);
        ASTParticipantVisitor pt = new ASTParticipantVisitor();
        Set<String> participants = globalType.accept(pt);
        if (!participants.isEmpty()) {
            localTypesMap = new HashMap<>();
            for (String string : participants) {
                ProjectionVisitor projectionVisitor = new ProjectionVisitor(string);
                LocalType projectedType = globalType.accept(projectionVisitor);
                localTypesMap.put(string, projectedType);
            }
        }
    }

    public boolean check() {
        boolean ret = true;
        if (localTypesMap.size() != programTypeMap.size()) {
            // TODO: print momentaneo, sostituire con il lancio di un eccezzione, da
            // catturare nel frame
            System.err.println("numero di partecipanti non combacia");
            return false;
        }
        for (String participantString : localTypesMap.keySet()) {
            if (participantString.equals("Env")) continue;
            ret = ret && this.checkParticipant(localTypesMap.get(participantString),
                    programTypeMap.get(participantString), new HashMap<>(), new HashMap<>(), new HashMap<>());
            if (!ret) {
                System.err.println("Errore in tipaggio di: " + participantString);
            }
        }
        return ret;
    }

    private boolean checkParticipant(LocalType localType, ProgramType programType, Map<String, String> gamma,
            Map<String, String> delta, Map<String, ThetaEntry> theta) {

        // Regola T-end
        if (localType instanceof LEnd && programType instanceof Inaction r1) {
            if (Arrays.asList(r1.ownedqbits).isEmpty()) {
                return delta.isEmpty();
            } else {
                Set<String> ownedSet = new HashSet<>(Arrays.asList(r1.ownedqbits));
                return delta.keySet().containsAll(ownedSet) && ownedSet.containsAll(delta.keySet());
            }
        }

        // Regola T-U
        if (programType instanceof UnitOp r1) {
            return delta.keySet().containsAll(Arrays.asList(r1.vars))
                    && checkParticipant(localType, r1.continuation, gamma, delta, theta);
        }

        // Regola T-qbit
        if (programType instanceof Generation r1) {
            delta.put(r1.variable, "qbit");
            return checkParticipant(localType, r1.continuation, gamma, delta, theta);
        }

        // Regola T-meas
        if (programType instanceof Measurement r1) { //TODO: come da altre parti, modificare la gestione di measurement con più variabili misurate
            boolean ret = true;
            ret = ret && checkVar("qbit", r1.measuredVars[0], gamma, delta);
            gamma.put(r1.variable, "bit");
            delta.keySet().removeAll(Arrays.asList(r1.measuredVars));
            ret = ret && checkParticipant(localType, r1.continuation, gamma, delta, theta);
            return ret;
        }

        // Regola T-Send
        // TODO: cerca un modo migliore di memorizzare expression in Selection
        if (localType instanceof Send r1 && programType instanceof Selection r2) {
            boolean ret;
            if (r1.participant.equals(r2.participant)) {
                if (r1.branches.keySet().contains(r2.label)) {
                    ret = checkVar(r1.branches.get(r2.label).type, r2.expression[0], gamma, delta);
                    if (r1.branches.get(r2.label).type.equals("qbit"))
                        delta.remove(r2.expression[0]);
                    ret = ret
                            && checkParticipant(r1.branches.get(r2.label).continuation, r2.continuation, gamma, delta,
                                    theta);
                    return ret;
                } else {
                    System.err.println("in selection, label not present in relative localType");
                    return false;
                }
            } else {
                System.err.println("in selection, participant not matching between localType and program");
                return false;
            }
        }

        // Regola T-if
        if (programType instanceof Conditional r1) {
            boolean ret = checkVar("bit", r1.expression, gamma, new HashMap<>());
            if(ret) ret = ret && checkParticipant(localType, r1.optionA, gamma, delta, theta);
            if(ret) ret = ret && checkParticipant(localType, r1.optionB, gamma, delta, theta);
            return ret;
        }

        // Regola T-Receive
        if (localType instanceof Receive r1 && programType instanceof Branching r2) {
            if (!r1.participant.equals(r2.participant)) {
                System.err.println("mittente diverso tra tipo locale e sistema");
                return false;
            }
            if (!r1.branches.keySet().containsAll(r2.branches.keySet())) {
                System.err.println("label set di branching diverso tra localType e programma");
                return false;
            }
            if (r1.branches.entrySet().isEmpty()) {
                System.err.println("label set vuoto in receive");
                return false;
            }
            boolean ret = true;
            for (String keyString : r1.branches.keySet()) {
                if (r1.branches.get(keyString).type.equals("qbit")) {
                    delta.put(r2.branches.get(keyString).vars[0], r1.branches.get(keyString).type);
                    ret = ret && checkParticipant(r1.branches.get(keyString).continuation,
                            r2.branches.get(keyString).continuation, gamma, delta, theta);
                } else {
                    gamma.put(r2.branches.get(keyString).vars[0], r1.branches.get(keyString).type);
                    ret = ret && checkParticipant(r1.branches.get(keyString).continuation,
                            r2.branches.get(keyString).continuation, gamma, delta, theta);
                }
            }
            return ret;

        }

        // Regola T-Send-if --- Rimossa
        /*
         * if (localType instanceof Send r1 && programType instanceof Conditional r2) {
         * boolean ret = true;
         * ret = ret && checkVar("bit", r2.expression, gamma, delta)
         * //FIXME: dividere r1 in due localtype diversi da checkare
         * && checkParticipant(r1, r2.optionA, gamma, delta, theta)
         * && checkParticipant(r1, r2.optionB, gamma, delta, theta);
         * return ret;
         * }
         */

        // TODO: Implementare le regole T-def, T-Call
        // Regola T-def
        if (localType instanceof LRecursion r1 && programType instanceof Definition r2) {

        }

        // Regola T-CALL
        if (programType instanceof Call r1) {
            if (!theta.containsKey(r1.procName)) {
                System.err.println(r1.procName + "non è definito");
            }
            if (!theta.get(r1.procName).returnType().equals(localType)) { // FIXME: non basta equals, placeholder
                                                                          // momentaneo

            }
        }

        return false;
    }

    // TODO: Implementare tutte le regole per le variabili
    private boolean checkVar(String basicType, String varString, Map<String, String> gamma, Map<String, String> delta) {
        if ((varString.equals("0") || varString.equals("1")) && basicType.equals("bit"))
            return true;
        if (basicType.equals("qbit") && delta.containsKey(varString))
            return true;
        if (!basicType.equals("qbit") && gamma.containsKey(varString)) {
            if (gamma.get(varString).equals(basicType)) {
                return true;
            }
        }
        return false;
    }
}
