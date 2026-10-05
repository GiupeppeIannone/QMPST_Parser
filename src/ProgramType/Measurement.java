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

    @Override
    public String toString() {
        String retString = "procType: Meas; LHSVar: " + this.variable + "; RHSVars: ";
        for (String string : measuredVars) {
            retString += string + "; ";
        }
        retString += "Continuation: {" + this.continuation.toString() + "}";
        return retString;
    }
    
}
