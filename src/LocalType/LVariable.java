package LocalType;


public class LVariable extends LocalType {
    public String variable;

    public LVariable(String variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return variable;
    }


}
