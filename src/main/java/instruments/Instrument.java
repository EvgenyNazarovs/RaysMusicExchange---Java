package instruments;

public abstract class Instrument {

    String material;
    String colour;
    Type type;

    public Instrument(String material, String colour, Type type) {
        this.material = material;
        this.colour = colour;
        this.type = type;
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
}
