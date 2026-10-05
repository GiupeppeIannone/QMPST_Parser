package ProgramType;

import java.util.Arrays;

public class Definition extends ProgramType{
    public String procName;
    public String[] arguments;
    public ProgramType proc;
    public ProgramType prog;
   
    public Definition(String procName, String[] arguments, ProgramType proc, ProgramType prog) {
        this.procName = procName;
        this.arguments = arguments;
        this.proc = proc;
        this.prog = prog;
    }

    @Override
    public String toString() {
        return "procType: Definition; procName: " + procName + "; arguments: " + Arrays.toString(arguments) + "; proc: {" + proc + "}; prog: {" + prog + "}";
    } 
    
}
