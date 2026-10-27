package LocalType;

import java.util.Map;



public class Receive extends LocalType {
    public String participant;
    public Map<String, LBranch> branches;

    public Receive(String participant, Map<String, LBranch> branches) {
        this.participant = participant;
        this.branches = branches;
    }

    @Override
    public String toString() {
        String resultString = "";
        for (String lBranch : branches.keySet()) {
            resultString += branches.get(lBranch).toString() + ", ";
        }

        return participant + "&" + "{" + resultString + "}";
    }

}
