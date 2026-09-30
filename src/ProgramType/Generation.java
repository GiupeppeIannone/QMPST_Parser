package ProgramType;

public class Generation extends ProgramType {
    public String variable;
    public ProgramType continuation;


    Generation(String variableString, ProgramType continuationType){
        this.variable = variableString;
        this.continuation = continuationType;
    }
}
