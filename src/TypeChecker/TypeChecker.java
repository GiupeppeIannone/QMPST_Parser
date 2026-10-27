package TypeChecker;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import GlobalType.GlobalType;
import LocalType.LBranch;
import LocalType.LEnd;
import LocalType.LocalType;
import LocalType.Receive;
import LocalType.Send;
import ProgramType.Branching;
import ProgramType.Conditional;
import ProgramType.Generation;
import ProgramType.Inaction;
import ProgramType.Measurement;
import ProgramType.ProgramType;
import ProgramType.Selection;
import ProgramType.UnitOp;
import ProjectionAlgorithm.ASTParticipantVisitor;
import ProjectionAlgorithm.ProjectionVisitor;

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
            System.err.println("numero di partecipanti non congruo");
            return false;
        }
        for (String participantString : localTypesMap.keySet()) {
            ret = ret && this.checkParticipant(localTypesMap.get(participantString),
                    programTypeMap.get(participantString), new HashMap<>(), new HashMap<>(), new HashMap<>());
        }
        return ret;
    }

    private boolean checkParticipant(LocalType localType, ProgramType programType, Map<String, String> gamma,
            Map<String, String> delta, Map<String, String[]> theta) {

        //Regola T-end
        if (localType instanceof LEnd && programType instanceof Inaction r1) {
            boolean ret = true;
            if (delta.isEmpty()) {
                ret = delta.isEmpty();
            } else {
                Set<String> ownedSet = new HashSet<>(Arrays.asList(r1.ownedqbits));
                ret = delta.keySet().containsAll(ownedSet) && ownedSet.containsAll(delta.keySet());
            }
            return ret;
        }

        //Regola T-U
        if (programType instanceof UnitOp r1) {
            return delta.keySet().containsAll(Arrays.asList(r1.vars)) && checkParticipant(localType, r1.continuation, gamma, delta, theta);
        }

        //Regola T-qbit
        if (programType instanceof Generation r1) {
            delta.put(r1.variable, "qbit");
            return checkParticipant(localType, r1.continuation, gamma, delta, theta);
        }

        //Regola T-meas
        if (programType instanceof Measurement r1) {
            //TODO: implement checkVar
            gamma.put(r1.variable, "bit");
            //TODO: rimuovi qbit misurati da delta
            delta.keySet().removeAll(Arrays.asList(r1.measuredVars));
            return checkParticipant(localType, r1.continuation, gamma, delta, theta) /* && checkVar(r1.measuredVars.key, r1.measuredVars.value, gamma, new HashMap<>(Arrays.asList(r1.measuredVars).....))*/;
        }

        //Regola T-Send
        if (localType instanceof Send r1 && programType instanceof Selection r2) {
            boolean ret;
            if (r1.participant.equals(r2.participant)) {
                if (r1.branches.get(0).label.equals(r2.label)) {
                    ret = checkVar(r1.branches.get(0).type, r2.expression[0], gamma, delta);
                    delta.remove(r2.expression[0]);
                    ret = ret && checkParticipant(r1.branches.get(0).continuation, r2.continuation, gamma, delta, theta);
                    return ret;
                }
            }
        }

        //Regola T-if
        if (programType instanceof Conditional r1) { //TODO: potrebbe essere più efficiente fare un grande if, se questi si ferma non appena trova un valore falso in AND;
            boolean ret;
            ret = checkVar("bit", r1.expression, gamma, new HashMap<>());
            ret = ret && checkParticipant(localType, r1.optionA, gamma, delta, theta);
            ret = ret && checkParticipant(localType, r1.optionB, gamma, delta, theta);
            return ret;
        }

        //Regola T-Receive
        if (localType instanceof Receive r1 && programType instanceof Branching r2) {
            boolean ret = true;
            if (r1.branches.size()!=r2.branches.size()) {
                System.err.println("numero di scelte diverse tra tipo e programma");
                return false;
            }
            for (LBranch branch : r1.branches) {
                
            }
        }

        return false;
    }


    private boolean checkVar(String basicType, String varString, Map<String, String> gamma, Map<String, String> delta){
        return false;
    }
}
