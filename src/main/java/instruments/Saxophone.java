package instruments;

public class Saxophone extends Instrument {

    private String model;

    public Saxophone(String material, String colour, Type type, double buyingPrice, double sellingPrice, String model) {
        super(material, colour, type, buyingPrice, sellingPrice);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String play() {
        return "Here comes the saxophone!..";
    }
}
