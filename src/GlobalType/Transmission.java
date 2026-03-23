package GlobalType;

import java.util.List;

import ProjectionAlgorithm.Visitor;

public class Transmission extends GlobalType {
    public String participant1;
    public String participant2;
    public List<Branch> branches;

    public Transmission(String participant1, String participant2, List<Branch> branches) {
        this.participant1 = participant1;
        this.participant2 = participant2;
        this.branches = branches;
    }

    @Override
    public String toString() {
        String string = """
                {
                    sender: %s,
                    receiver: %s,
                    branches: {%s}
                }
                """;
        String branchesString = "";
        for (Branch branch : this.branches) {
            branchesString = branchesString + ",\n" + branch.toString();
        }
        string = String.format(string, this.participant1, this.participant2, branchesString);
        return string;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitTransmission(this);
    }

}
