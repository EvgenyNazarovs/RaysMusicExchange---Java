import instruments.*;
import org.junit.Before;
import org.junit.Test;
import otherstockitems.DrumStick;
import otherstockitems.GuitarString;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    DrumKit drumKit;
    Piano piano;
    Saxophone saxophone;
    DrumStick drumStick;
    GuitarString guitarString;


    @Before
    public void setUp() {
        shop = new Shop();
        guitar = new Guitar("wood", "yellow", Type.STRING, 100, 120, 6);
        drumKit = new DrumKit("wood", "white", Type.PERCUSSION, 400, 500, 7);
        piano = new Piano("wood", "black", Type.KEYBOARD, 1000, 1500, 85);
        saxophone = new Saxophone("brass", "golden", Type.WOODWIND, 1000, 1200, "soprano");
        drumStick = new DrumStick(20, 25, 4);
        guitarString = new GuitarString(10, 12, 6);
    }

    @Test
    public void hasEmptyStock() {
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveFromStock() {
        shop.addToStock(guitar);
        shop.removeFromStock(guitar);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canCalculateOverallProfit() {
        shop.addToStock(guitar);
        shop.addToStock(drumKit);
        shop.addToStock(piano);
        shop.addToStock(saxophone);
        shop.addToStock(drumStick);
        shop.addToStock(guitarString);
        assertEquals(827, shop.calculateProfit(), 0.1);
    }


}
