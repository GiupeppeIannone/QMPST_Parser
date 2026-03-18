package GlobalType;

public class Branch {
    public String label;
    public String type;
    public GlobalType continuation;

    public Branch(String label, String type, GlobalType continuation) {
        this.label = label;
        this.type = type;
        this.continuation = continuation;
    }
}
