package GlobalType;

import ProjectionAlgorithm.Visitor;

public class Variable extends GlobalType {
    public String variable;

    public Variable(String variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        String string = "{\n\tvariable: " + this.variable + "\n}";
        return string;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitVariable(this);
    }

}
