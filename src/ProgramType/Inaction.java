package ProgramType;

public class Inaction extends ProgramType {
    public String[] ownedqbits;

    public Inaction(String[] ownedqbits) {
        this.ownedqbits = ownedqbits;
    }

    @Override
    public String toString() {
        String retString = "procType: inaction; owned qBits: ";
        for (String string : this.ownedqbits) {
            retString += string + "; ";
        }
        return retString;
    }

    
    
}
