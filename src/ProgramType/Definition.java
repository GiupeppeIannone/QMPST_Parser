package ProgramType;

import java.util.Arrays;

import LocalType.LocalType;

public class Definition extends ProgramType{
    public String procName;
    public String[] classicalArguments;
    public String[] linearArguments;
    public ProgramType proc;
    public ProgramType prog;
    public LocalType expectedType;
   
    public Definition(String procName, String[] classicalArguments, String[] linearArguments, ProgramType proc, ProgramType prog, LocalType expectedType) {
        this.procName = procName;
        this.classicalArguments = classicalArguments;
        this.linearArguments = linearArguments;
        this.proc = proc;
        this.prog = prog;
        this.expectedType = expectedType;
    }

    @Override
    public String toString() {
        return "procType: Definition; procName: " + procName + "; arguments: " + Arrays.toString(classicalArguments) + ',' + Arrays.toString(linearArguments) + "; proc: {" + proc + "}; prog: {" + prog + "}";
    } 
    
}
