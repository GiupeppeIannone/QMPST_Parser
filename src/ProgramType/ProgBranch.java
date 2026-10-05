package ProgramType;

import java.util.Arrays;

public class ProgBranch {
    public String label;
    public String[] vars;
    public ProgramType continuation;
    
    public ProgBranch(String label, String[] vars, ProgramType continuation) {
        this.label = label;
        this.vars = vars;
        this.continuation = continuation;
    }

    @Override
    public String toString() {
        return "label: " + label + "; vars: " + Arrays.toString(vars) + ", continuation: {" + continuation + "}";
    }
    
}
