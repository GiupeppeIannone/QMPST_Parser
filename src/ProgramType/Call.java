package ProgramType;

import java.util.Arrays;

public class Call extends ProgramType {
    public String procName;
    public String[] arguments;
    
    public Call(String procName, String[] arguments) {
        this.procName = procName;
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "procType: Call; procName: " + procName + ", arguments: " + Arrays.toString(arguments);
    }
    
    
}
