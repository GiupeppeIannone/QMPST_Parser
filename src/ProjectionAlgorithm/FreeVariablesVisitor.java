package ProjectionAlgorithm;

import java.util.HashSet;
import java.util.Set;

import GlobalType.Branch;
import GlobalType.End;
import GlobalType.Recursion;
import GlobalType.Transmission;
import GlobalType.Variable;

public class FreeVariablesVisitor implements Visitor<Set<String>> {

    @Override
    public Set<String> visitBranch(Branch branch) {
        return branch.continuation.accept(this);
    }

    @Override
    public Set<String> visitEnd(End end) {
        return new HashSet<>();
    }

    @Override
    public Set<String> visitRecursion(Recursion recursion) {
        Set<String> result = recursion.continuation.accept(this);
        result.remove(recursion.variable);
        return result;
    }

    @Override
    public Set<String> visitTransmission(Transmission transmission) {
        Set<String> result = new HashSet<>();
        for (Branch branch : transmission.branches) {
            result.addAll(branch.continuation.accept(this));
        }
        return result;
    }

    @Override
    public Set<String> visitVariable(Variable variable) {
        Set<String> result = new HashSet<>();
        result.add(variable.variable);
        return result;
    }

}
