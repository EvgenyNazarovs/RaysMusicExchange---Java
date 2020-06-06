import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell stockItem) {
        stock.add(stockItem);
    }

    public void removeFromStock(ISell stockItem) {
        stock.remove(stockItem);
    }

    public double calculateProfit() {
        double total = 0;
        for (ISell item : stock) {
            total += item.calculateMarkup();
        }
        return total;
    }
}
