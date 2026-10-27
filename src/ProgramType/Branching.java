package ProgramType;

import java.util.Map;

public class Branching extends ProgramType {
    public String participant;
    public Map<String, ProgBranch> branches;
    
    public Branching(String participant, Map<String, ProgBranch> branches) {
        this.participant = participant;
        this.branches = branches;
    }

    @Override
    public String toString() {
        String branchString = "";
        for (String progkey : branches.keySet()) {
            branchString += "[ " + branches.get(progkey).toString() + " ]";
        }
        return "procTYpe: Branching; participant: " + participant + "; branches: {" + branchString + "}";
    }

    
}
