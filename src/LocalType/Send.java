package LocalType;

import java.util.List;


public class Send extends LocalType {
    public String participant;
    public List<LBranch> branches;

    public Send(String participant, List<LBranch> branches) {
        this.participant = participant;
        this.branches = branches;
    }

}
