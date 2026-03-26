package LocalType;

import java.util.List;


public class Receive extends LocalType {
    public String participant;
    public List<LBranch> branches;

    public Receive(String participant, List<LBranch> branches) {
        this.participant = participant;
        this.branches = branches;
    }


}
