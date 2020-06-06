package otherstockitems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void setUp() {
        drumStick = new DrumStick(20, 25, 4);
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(20, drumStick.getBuyingPrice(), 0.1);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(25, drumStick.getSellingPrice(), 0.1);
    }

    @Test
    public void hasSetOf() {
        assertEquals(4, drumStick.getSetOf());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(5, drumStick.calculateMarkup(), 0.1);
    }
}
