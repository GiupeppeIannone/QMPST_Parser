package ProjectionAlgorithm;

import GlobalType.*;

public interface Visitor<T> {
    T visitTransmission(Transmission transmission);

    T visitRecursion(Recursion recursion);

    T visitVariable(Variable variable);

    T visitEnd(End end);

    T visitBranch(Branch branch);
}
