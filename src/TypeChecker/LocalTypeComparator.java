package TypeChecker;

import java.util.Map;

import LocalType.LBranch;
import LocalType.LEnd;
import LocalType.LRecursion;
import LocalType.LVariable;
import LocalType.LocalType;
import LocalType.Receive;
import LocalType.Send;

public class LocalTypeComparator {
    public static boolean equivalent(LocalType t1, LocalType t2) {
        if (t1 == t2) return true;
        if (t1 == null || t2 == null) return false;
        if (t1.getClass() != t2.getClass()) return false;

        if (t1 instanceof LEnd) {
            return true;
        }
     
        if (t1 instanceof LVariable r1 && t2 instanceof LVariable r2) {
            return r1.variable.equals(r2.variable) || r1.variable.contains(r2.variable);
        }
     
        if (t1 instanceof Send r1 && t2 instanceof Send r2) {
            return r1.participant.equals(r2.participant)
            && equivalentBranches(r1.branches, r2.branches);
        }

        if (t1 instanceof Receive r1 && t2 instanceof Receive r2) {
            return r1.participant.equals(r2.participant)
            && equivalentBranches(r1.branches, r2.branches);
        }

        if (t1 instanceof LRecursion r1 && t2 instanceof LRecursion r2) {
            return r1.variable.equals(r2.variable)
            && equivalent(r1.continuation, r2.continuation);
        }
     
        return false;
    }

    private static boolean equivalentBranches (Map<String, LBranch> t1, Map<String, LBranch> t2) {
        if (t1 == null || t1 == null) return false;
        if (!t1.keySet().containsAll(t2.keySet()) || !t2.keySet().containsAll(t1.keySet())) return false;

        boolean ret = true;
        for (String labelString : t1.keySet()) {
            ret = ret && t1.get(labelString).label.equals(t2.get(labelString).label) 
                && t1.get(labelString).type.equals(t2.get(labelString).type)
                && equivalent(t1.get(labelString).continuation, t2.get(labelString).continuation);
        }


        return ret;
    }
}
