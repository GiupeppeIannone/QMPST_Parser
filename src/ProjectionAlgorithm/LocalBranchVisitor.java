package ProjectionAlgorithm;

import GlobalType.Branch;
import GlobalType.End;
import GlobalType.Recursion;
import GlobalType.Transmission;
import GlobalType.Variable;
import LocalType.LBranch;
import LocalType.LocalType;

public class LocalBranchVisitor implements Visitor<LBranch>{
    public String role;

    public LocalBranchVisitor(String role){
        this.role = role;
    }

    @Override
    public LBranch visitBranch(Branch branch) {
        ProjectionVisitor projection = new ProjectionVisitor(role);
        LocalType LContinuation = branch.continuation.accept(projection);
        LBranch result = new LBranch(branch.label, branch.type, LContinuation);
        return result;
    }

    @Override
    public LBranch visitEnd(End end) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LBranch visitRecursion(Recursion recursion) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LBranch visitTransmission(Transmission transmission) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LBranch visitVariable(Variable variable) {
        // TODO Auto-generated method stub
        return null;
    }

}
