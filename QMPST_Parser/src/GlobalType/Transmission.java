package GlobalType;

import java.util.List;

public class Transmission extends Global {
    public String sender;
    public String receiver;
    // TODO: implement some class for label-type sections of global types
    public List<GBranch> choicesList;

    public Transmission(String sender, String receiver, List<GBranch> choiceList) {
        this.sender = sender;
        this.receiver = receiver;
        for (GBranch gBranch : choiceList) {
            this.choicesList.add(gBranch);
        }
    }
    // TODO: add toString method
}
