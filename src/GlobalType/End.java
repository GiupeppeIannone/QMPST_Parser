package GlobalType;

import ProjectionAlgorithm.Visitor;

public class End extends GlobalType {
    public End() {
    }

    @Override
    public String toString() {
        String string = "{\n\tend\n}";
        return string;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitEnd(this);
    }

}
