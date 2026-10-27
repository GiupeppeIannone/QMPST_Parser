package ProgramType;

import java.util.Set;

public class Branching extends ProgramType {
    public String participant;
    public Set<ProgBranch> branches;
    
    public Branching(String participant, Set<ProgBranch> branches) {
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
