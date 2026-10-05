package ProgramType;

import java.util.List;

public class Branching extends ProgramType {
    public String participant;
    public List<ProgBranch> branches;
    
    public Branching(String participant, List<ProgBranch> branches) {
        this.participant = participant;
        this.branches = branches;
    }

    @Override
    public String toString() {
        String branchString = "";
        for (ProgBranch progBranch : branches) {
            branchString += "[ " + progBranch.toString() + " ]";
        }
        return "procTYpe: Branching; participant: " + participant + "; branches: {" + branchString + "}";
    }

    
}
