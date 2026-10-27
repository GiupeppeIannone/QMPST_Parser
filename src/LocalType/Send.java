package LocalType;

import java.util.Set;

public class Send extends LocalType {
    public String participant;
    public Set<LBranch> branches;

    public Send(String participant, Set<LBranch> branches) {
        this.participant = participant;
        this.branches = branches;
    }

    @Override
    public String toString() {
        String resultString = "";
        for (LBranch lBranch : branches) {
            resultString += lBranch.toString() + ", ";
        }

        return participant + "⊕" + "{" + resultString + "}";
    }

}
