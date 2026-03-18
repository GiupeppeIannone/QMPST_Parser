package GlobalType;

import java.util.List;

public class Transmission extends GlobalType {
    public String participant1;
    public String participant2;
    public List<Branch> branches;

    public Transmission(String participant1, String participant2, List<Branch> branches) {
        this.participant1 = participant1;
        this.participant2 = participant2;
        this.branches = branches;
    }
}
