package ProgramType;

import java.util.Arrays;

public class UnitOp extends ProgramType {
    public String opType;
    public String[] vars;
    public ProgramType continuation;
    
    public UnitOp(String opType, String[] vars, ProgramType continuation) {
        this.opType = opType;
        this.vars = vars;
        this.continuation = continuation;
    }

    @Override
    public String toString() {
        return "procType: UnitOp; opType: " + opType + "; vars: " + Arrays.toString(vars) + "; continuation: {" + continuation + "}";
    }

    
}
