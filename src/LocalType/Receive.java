package LocalType;

import java.util.Set;


public class Receive extends LocalType {
    public String participant;
    public Set<LBranch> branches;

    public Receive(String participant, Set<LBranch> branches) {
        this.participant = participant;
        this.branches = branches;
    }

    @Override
    public String toString() {
        String resultString = "";
        for (LBranch lBranch : branches) {
            resultString += lBranch.toString() + ", ";
        }

        return participant + "&" + "{" + resultString + "}";
    }

}
