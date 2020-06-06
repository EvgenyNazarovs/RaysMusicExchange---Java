package otherstockitems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void setUp() {
        guitarString = new GuitarString(10, 12, 6);
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(10, guitarString.getBuyingPrice(), 0.1);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(12, guitarString.getSellingPrice(), 0.1);
    }

    @Test
    public void hasSetOf() {
        assertEquals(6, guitarString.getSetOf());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(2, guitarString.calculateMarkup(), 0.1);
    }


}
