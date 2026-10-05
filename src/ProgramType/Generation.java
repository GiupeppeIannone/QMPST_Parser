package ProgramType;

public class Generation extends ProgramType {
    public String variable;
    public ProgramType continuation;


    public Generation(String variableString, ProgramType continuationType){
        this.variable = variableString;
        this.continuation = continuationType;
    }


    @Override
    public String toString() {
        String retString = "procType: Generation; Variable: " + this.variable + " continuation:{" + this.continuation.toString() + "}";
        return retString;
    }

    
}
