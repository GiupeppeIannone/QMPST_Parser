package ProjectionAlgorithm;

import java.util.HashMap;
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
                if (r1.branches.keySet().equals(r2.branches.keySet())) {
                    Map<String, LBranch> mergedCont = new HashMap<>();
                    for (String branchKey : r1.branches.keySet()) {
                        if (r1.branches.get(branchKey).type.equals(r2.branches.get(branchKey).type)) {
                            LBranch tmp = new LBranch(r1.branches.get(branchKey).label, r1.branches.get(branchKey).type,
                                    fullMerge(r1.branches.get(branchKey).continuation,
                                            r1.branches.get(branchKey).continuation));
                            mergedCont.put(branchKey, tmp);
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
                Map<String, LBranch> resBranches = new HashMap<>();
                for (Map.Entry<String, LBranch> extMap : r1.branches.entrySet()) {
                    if (r2.branches.containsKey(extMap.getKey())) {
                        resBranches.put(extMap.getValue().label, new LBranch(extMap.getValue().label, extMap.getValue().type, fullMerge(
                                extMap.getValue().continuation, r2.branches.get(extMap.getKey()).continuation)));
                    } else {
                        resBranches.put(extMap.getKey(), extMap.getValue());
                    }
                }
                for (Map.Entry<String, LBranch> extMap : r2.branches.entrySet()) {
                    if (!r1.branches.containsKey(extMap.getKey())) {
                        resBranches.put(extMap.getKey(), extMap.getValue());
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
            return lRec;
        } else {
            return new LEnd();
        }
    }

    @Override
    public LocalType visitTransmission(Transmission transmission) {
        if (transmission.participant1.equals(this.role)) {
            Map<String, LBranch> resLBranch = new HashMap<>();
            for (Branch branch : transmission.branches) {
                resLBranch.put(branch.label, new LBranch(branch.label, branch.type, branch.continuation.accept(this)));
            }
            Send res = new Send(transmission.participant2, resLBranch);
            return res;
        } else if (transmission.participant2.equals(this.role)) {
            Map<String, LBranch> resLBranch = new HashMap<>();
            for (Branch branch : transmission.branches) {
                resLBranch.put(branch.label, new LBranch(branch.label, branch.type, branch.continuation.accept(this)));
            }
            Receive res = new Receive(transmission.participant1, resLBranch);
            return res;
        } else {
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
        return var;
    }

}
