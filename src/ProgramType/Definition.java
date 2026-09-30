package ProgramType;

public class Definition extends ProgramType{
    public String procName;
    public String[] arguments;
    public ProgramType proc;
    public ProgramType porg;
   
    public Definition(String procName, String[] arguments, ProgramType proc, ProgramType porg) {
        this.procName = procName;
        this.arguments = arguments;
        this.proc = proc;
        this.porg = porg;
    } 
}
