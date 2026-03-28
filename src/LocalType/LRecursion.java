package LocalType;


public class LRecursion extends LocalType {
    public String variable;
    public LocalType continuation;

    public LRecursion(String variable, LocalType continuation) {
        this.variable = variable;
        this.continuation = continuation;
    }

    @Override
    public String toString() {
        return "μ" + variable + "." + continuation.toString();
    }

}
