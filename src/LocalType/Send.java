package LocalType;

import java.util.List;


public class Send extends LocalType {
    public String participant;
    public List<LBranch> branches;

    public Send(String participant, List<LBranch> branches) {
        this.participant = participant;
        this.branches = branches;
    }

    @Override
    public String toString() {
        String resultString = participant + "⊕";
        if (this.branches.size() == 1) {
            resultString = resultString + branches.get(0).toString();
        } else {
            resultString = resultString + "{" + branches.get(0).toString();
            for (int i = 1; i < branches.size(); i++) {
                resultString = resultString + "," + branches.get(i).toString();
            }
            resultString = resultString + "}";
        }

        return resultString;
    }

}
