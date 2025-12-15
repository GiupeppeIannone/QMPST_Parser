package LocalType;

import java.util.List;

public class Send extends Local {
    public String participant;
    public List<LBranch> externalChoice;

    public Send(String participant, List<LBranch> externalChoice) {
        this.participant = participant;
        for (LBranch lBranch : externalChoice) {
            this.externalChoice.add(lBranch);
        }
    }

}
