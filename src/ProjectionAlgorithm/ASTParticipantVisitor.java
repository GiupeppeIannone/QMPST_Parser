package ProjectionAlgorithm;

import java.util.HashSet;
import java.util.Set;

import GlobalType.*;

public class ASTParticipantVisitor implements Visitor<Set<String>> {

    @Override
    public Set<String> visitEnd(End end) {
        return new HashSet<>();
    }

    @Override
    public Set<String> visitRecursion(Recursion recursion) {
        return recursion.continuation.accept(this);
    }

    @Override
    public Set<String> visitTransmission(Transmission transmission) {
        Set<String> result = new HashSet<>();
        result.add(transmission.participant1);
        result.add(transmission.participant2);
        for (Branch branch : transmission.branches) {
            result.addAll(branch.continuation.accept(this));
        }
        return result;
    }

    @Override
    public Set<String> visitVariable(Variable variable) {
        return new HashSet<>();
    }

    @Override
    public Set<String> visitBranch(Branch branch) {
        return branch.continuation.accept(this);
    }

}
