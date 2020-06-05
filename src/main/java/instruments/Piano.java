package instruments;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(String material, String colour, Type type, double buyingPrice, double sellingPrice, int numberOfKeys) {
        super(material, colour, type, buyingPrice, sellingPrice);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play() {
        return "Piano playing...";
    }
}
