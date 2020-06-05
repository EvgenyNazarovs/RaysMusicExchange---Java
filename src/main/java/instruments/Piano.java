package instruments;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(String material, String colour, Type type, int numberOfKeys) {
        super(material, colour, type);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}
