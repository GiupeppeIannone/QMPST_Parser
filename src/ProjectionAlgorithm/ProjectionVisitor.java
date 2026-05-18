package ProjectionAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GlobalType.Branch;
import GlobalType.End;
import GlobalType.Recursion;
import GlobalType.Transmission;
import GlobalType.Variable;
import LocalType.*;

public class ProjectionVisitor implements Visitor<LocalType> {
    public String role;

    public ProjectionVisitor(String role) {
        this.role = role;
    }

    private LocalType fullMerge(LocalType t1, LocalType t2) {
        // Merge(end, end)
        if (t1 instanceof LEnd && t2 instanceof LEnd) {
            return new LEnd();
        }
        // Merge(t, t)
        if (t1 instanceof LVariable r1 && t2 instanceof LVariable r2) {
            if (r1.variable.equals(r2.variable)) {
                LVariable var = new LVariable(r1.variable);
                return var;
            }
        }
        // Merge(rec, rec)
        if (t1 instanceof LRecursion r1 && t2 instanceof LRecursion r2) {
            if (r1.variable.equals(r2.variable)) {
                LocalType newCont = fullMerge(r1.continuation, r2.continuation);
                LRecursion res = new LRecursion(r1.variable, newCont);
                return res;
            }
        }
        // Merge(Send, Send)
        if (t1 instanceof Send r1 && t2 instanceof Send r2) {
            if (r1.participant.equals(r2.participant)) {
                if (r1.branches.size() == r2.branches.size()) { // TODO: migliorare la guardia, o fai check interni per
                                                                // verificare che si tratti dello stesso indexSet
                    List<LBranch> mergedCont = new ArrayList<>();
                    for (LBranch extBranch : r1.branches) { // TODO: provare a fare prima mapping per ridurre costo
                                                            // temporale
                        for (LBranch intBranch : r2.branches) {
                            if (extBranch.label == intBranch.label && extBranch.type == intBranch.type) {
                                LBranch tmpBranch = new LBranch(extBranch.label, extBranch.type,
                                        fullMerge(extBranch.continuation, intBranch.continuation));
                                mergedCont.add(tmpBranch);
                            }
                        }
                    }
                    Send res = new Send(r1.participant, mergedCont);
                    return res;
                }
            }
        }
        // Merge(&, &)
        if (t1 instanceof Receive r1 && t2 instanceof Receive r2) {
            if (r1.participant.equals(r2.participant)) {
                Map<String, LBranch> mappedIBranches = new HashMap<>();
                for (LBranch branch : r1.branches) {
                    mappedIBranches.put(branch.label, branch);
                }
                Map<String, LBranch> mappedJBranches = new HashMap<>();
                for (LBranch branch : r2.branches) {
                    mappedJBranches.put(branch.label, branch);
                }
                List<LBranch> resBranches = new ArrayList<>();
                for (Map.Entry<String, LBranch> extMap : mappedIBranches.entrySet()) {
                    if (mappedJBranches.containsKey(extMap.getKey())) {
                        resBranches.add(new LBranch(extMap.getValue().label, extMap.getValue().type, fullMerge(
                                extMap.getValue().continuation, mappedJBranches.get(extMap.getKey()).continuation)));
                    } else {
                        resBranches.add(extMap.getValue());
                    }
                }
                for (Map.Entry<String, LBranch> extMap : mappedJBranches.entrySet()) {
                    if (!mappedIBranches.containsKey(extMap.getKey())) {
                        resBranches.add(extMap.getValue());
                    }
                }
                Receive res = new Receive(r1.participant, resBranches);
                return res;
            }
        }
        return null;
    }

    @Override
    public LocalType visitBranch(Branch branch) {
        return null;
    }

    @Override
    public LocalType visitEnd(End end) {
        LEnd termination = new LEnd();
        //System.out.print(termination.toString() + "\n");
        return termination;
    }

    @Override
    public LocalType visitRecursion(Recursion recursion) {
        ASTParticipantVisitor pt = new ASTParticipantVisitor();
        Set<String> participants = recursion.accept(pt);

        FreeVariablesVisitor fv = new FreeVariablesVisitor();
        Set<String> freeVariables = recursion.accept(fv);
        if (participants.contains(role) || freeVariables.isEmpty()) {
            LocalType cont = recursion.continuation.accept(this);
            LRecursion lRec = new LRecursion(recursion.variable, cont);
            //System.out.print(lRec.toString() + "\n");
            return lRec;
        } else {
            return new LEnd();
        }
    }

    @Override
    public LocalType visitTransmission(Transmission transmission) {
        if (transmission.participant1.equals(this.role)) {
            List<LBranch> resLBranch = new ArrayList<>();
            for (Branch branch : transmission.branches) {
                resLBranch.add(new LBranch(branch.label, branch.type, branch.continuation.accept(this)));
            }
            Send res = new Send(transmission.participant2, resLBranch);
            //System.out.print(res.toString() + "\n");
            return res;
        } else if (transmission.participant2.equals(this.role)) {
            List<LBranch> resLBranch = new ArrayList<>();
            for (Branch branch : transmission.branches) {
                resLBranch.add(new LBranch(branch.label, branch.type, branch.continuation.accept(this)));
            }
            Receive res = new Receive(transmission.participant1, resLBranch);
            //System.out.print(res.toString() + "\n");
            return res;
        } else {
            /* if (this.role.equals("Rnd")) System.out.print(transmission.branches.toString() + "\n"); */
            LocalType res = transmission.branches.get(0).continuation.accept(this);
            for (int i = 1; i < transmission.branches.size(); i++) {
                res = fullMerge(res, transmission.branches.get(i).continuation.accept(this));
            }
            return res;
        }
    }

    @Override
    public LocalType visitVariable(Variable variable) {
        LVariable var = new LVariable(variable.variable);
        //System.out.print(var.toString() + "\n");
        return var;
    }

}
