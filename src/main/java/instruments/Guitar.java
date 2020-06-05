package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String material, String colour, Type type, double buyingPrice, double sellingPrice, int numberOfStrings) {
        super(material, colour, type, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "Strum, strum, strum...";
    }
}
