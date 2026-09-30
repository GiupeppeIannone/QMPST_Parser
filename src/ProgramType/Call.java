package ProgramType;

public class Call extends ProgramType {
    public String procName;
    public String[] arguments;
    
    public Call(String procName, String[] arguments) {
        this.procName = procName;
        this.arguments = arguments;
    }
    
}
