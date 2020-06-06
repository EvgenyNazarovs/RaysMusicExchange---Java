package otherstockitems;

public class GuitarString extends StockItem {

    private int setOf;

    public GuitarString(double buyingPrice, double sellingPrice, int setOf) {
        super(buyingPrice, sellingPrice);
        this.setOf = setOf;
    }

    public int getSetOf() {
        return setOf;
    }
}
