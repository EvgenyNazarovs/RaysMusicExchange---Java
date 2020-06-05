package instruments;

public class DrumKit extends Instrument {

    private int numberOfPieces;


    public DrumKit(String material, String colour, Type type, int numberOfPieces) {
        super(material, colour, type);
        this.numberOfPieces = numberOfPieces;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }
}
