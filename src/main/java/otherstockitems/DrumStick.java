package otherstockitems;

public class DrumStick extends StockItem {

    private int setOf;

    public DrumStick(double buyingPrice, double sellingPrice, int setOf) {
        super(buyingPrice, sellingPrice);
        this.setOf = setOf;
    }

    public int getSetOf() {
        return setOf;
    }
}
