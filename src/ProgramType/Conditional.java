package ProgramType;

public class Conditional extends ProgramType {
    public String expression;
    public ProgramType optionA;
    public ProgramType optionB;
    
    public Conditional(String expression, ProgramType optionA, ProgramType optionB) {
        this.expression = expression;
        this.optionA = optionA;
        this.optionB = optionB;
    }

}
