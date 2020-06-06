package otherstockitems;

import behaviours.ISell;

public abstract class StockItem implements ISell {

    private double buyingPrice;
    private double sellingPrice;

    public StockItem(double buyingPrice, double sellingPrice) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkup() {
        return getSellingPrice() - getBuyingPrice();
    }
}
