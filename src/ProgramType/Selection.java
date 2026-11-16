package ProgramType;

import java.util.Arrays;

public class Selection extends ProgramType{
    public String participant;
    public String label;
    public String[] expression;
    public ProgramType continuation;

    public Selection(String participantString, String labelString, String[] expressionString, ProgramType continuationType){
        this.participant = participantString;
        this.label = (labelString != null) ? labelString : "NNONE";
        if (expressionString.length != 0) {
            this.expression = expressionString;
        } else {
            this.expression = new String[1];
            this.expression[0] = "unit";
        }
        this.continuation = continuationType;
    }

    @Override
    public String toString() {
        return "procType: Selection; participant: " + participant + "; label: " + label + "; expression: "
                + Arrays.toString(expression) + "; continuation: {" + continuation + "}";
    }
    
}
