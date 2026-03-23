package GlobalType;

import ProjectionAlgorithm.Visitor;

public interface Visitable {
    <T> T accept(Visitor<T> visitor);
}
