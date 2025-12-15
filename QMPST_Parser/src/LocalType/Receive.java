package LocalType;

import java.util.List;

public class Receive extends Local {
    public String participant;
    public List<LBranch> externalChoice;

    public Receive(String participant, List<LBranch> externalChoice) {
        this.participant = participant;
        for (LBranch lBranch : externalChoice) {
            this.externalChoice.add(lBranch);
        }
    }
}
