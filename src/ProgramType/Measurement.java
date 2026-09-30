package ProgramType;

public class Measurement extends ProgramType {
    public String variable;
    public String[] measuredVars;
    public ProgramType continuation;

    public Measurement(String variableString, String[] measuredVarStrings, ProgramType continuationType) {
        this.variable = variableString;
        this.measuredVars = measuredVarStrings;
        this.continuation = continuationType;
    }
}
