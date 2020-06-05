package instruments;

public class DrumKit extends Instrument {

    private int numberOfPieces;


    public DrumKit(String material, String colour, Type type, double buyingPrice, double sellingPrice, int numberOfPieces) {
        super(material, colour, type, buyingPrice, sellingPrice);
        this.numberOfPieces = numberOfPieces;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public String play() {
        return "Boom boom boom";
    }
}
