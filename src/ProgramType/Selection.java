package ProgramType;

public class Selection extends ProgramType{
    public String participant;
    public String label;
    public String[] expression;
    public ProgramType continuation;

    public Selection(String participantString, String labelString, String[] expressionString, ProgramType continuationType){
        this.participant = participantString;
        this.label = labelString;
        this.expression = expressionString;
        this.continuation = continuationType;
    }
}
