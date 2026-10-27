package LocalType;

import java.util.Map;

public class Send extends LocalType {
    public String participant;
    public Map<String, LBranch> branches;

    public Send(String participant, Map<String, LBranch> branches) {
        this.participant = participant;
        this.branches = branches;
    }

    @Override
    public String toString() {
        String resultString = "";
        for (String lBranch : branches.keySet()) {
            resultString += branches.get(lBranch).toString() + ", ";
        }

        return participant + "⊕" + "{" + resultString + "}";
    }

}
