package GlobalType;

import ProjectionAlgorithm.Visitor;

public class Recursion extends GlobalType {
    public String variable;
    public GlobalType continuation;

    public Recursion(String variable, GlobalType continuation) {
        this.variable = variable;
        this.continuation = continuation;
    }

    @Override
    public String toString() {
        String string = "Recursion{\n\tvariable: " + this.variable + ";\n" + this.continuation.toString() + "\n}";
        return string;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitRecursion(this);
    }

}
