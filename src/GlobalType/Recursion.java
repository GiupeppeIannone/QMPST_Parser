package GlobalType;

public class Recursion extends GlobalType {
    public String variable;
    GlobalType continuation;

    public Recursion(String variable, GlobalType continuation) {
        this.variable = variable;
        this.continuation = continuation;
    }
}
