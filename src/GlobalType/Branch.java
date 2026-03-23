package GlobalType;

import ProjectionAlgorithm.Visitor;

public class Branch implements Visitable{
    public String label;
    public String type;
    public GlobalType continuation;

    public Branch(String label, String type, GlobalType continuation) {
        this.label = label;
        this.type = type;
        this.continuation = continuation;
    }

    @Override
    public String toString() {
        String string = """
                [
                    label: %s,
                    type: %s,
                    continuation: %s
                ]
                """;
        string = String.format(string, (this.label != null) ? this.label : "none", this.type,
                this.continuation.toString());
        return string;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitBranch(this);
    }
}
