package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String material;
    private String colour;
    private Type type;
    private double buyingPrice;
    private double sellingPrice;


    public Instrument(String material, String colour, Type type, double buyingPrice, double sellingPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public Type getType() {
        return type;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
