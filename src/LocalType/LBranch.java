package LocalType;


public class LBranch{
    public String label;
    public String type;
    public LocalType continuation;

    public LBranch(String label, String type, LocalType continuation) {
        this.label = label;
        this.type = type;
        this.continuation = continuation;
    }

    @Override
    public String toString() {
        return label + ".(" + type + ")." + continuation.toString();
    }

}
