package LocalType;

public class LBranch {
    public String label;
    public String baseType;
    public Local cont;

    public LBranch(String label, String baseType, Local cont) {
        this.label = label;
        this.baseType = baseType;
        this.cont = cont;
    }
}
