package ProjectionAlgorithm;

import java.util.ArrayList;
import java.util.List;
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

    private LocalType fullMerge(List<LocalType> continuations){
        
        return null;
    }

    @Override
    public LocalType visitBranch(Branch branch) {
        
        return branch.continuation.accept(this);
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
        LocalBranchVisitor branchVisitor = new LocalBranchVisitor(role);
        if (role == transmission.participant1) {    //SEND projection
            List<LBranch> branchesSet = new ArrayList<>();
            for (Branch branch : transmission.branches) {
                branchesSet.add(branch.accept(branchVisitor));
            }
            Send send = new Send(role, branchesSet);
            return send;
        } else if (role == transmission.participant2) {
            List<LBranch> branchesSet = new ArrayList<>();
            for (Branch branch : transmission.branches) {
                branchesSet.add(branch.accept(branchVisitor));
            }
            Receive receive = new Receive(role, branchesSet);
            return receive;
        } else if (role != transmission.participant1 && role != transmission.participant2) {
            List<LocalType> continuations = new ArrayList<>();
            for (Branch branch : transmission.branches) {
                continuations.add(branch.accept(this));
            }
            return fullMerge(continuations);
        }
        return null;
    }

    @Override
    public LocalType visitVariable(Variable variable) {
        LVariable var = new LVariable(variable.variable);

        return var;
    }

    
}
