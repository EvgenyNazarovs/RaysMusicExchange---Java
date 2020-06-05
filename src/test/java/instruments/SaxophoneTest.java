package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp() {
        saxophone = new Saxophone("brass", "golden", Type.WOODWIND, 1000, 1200, "soprano");
    }

    @Test
    public void hasName() {
        assertEquals("brass", saxophone.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("golden", saxophone.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(Type.WOODWIND, saxophone.getType());
    }

    @Test
    public void hasModel() {
        assertEquals("soprano", saxophone.getModel());
    }

    @Test
    public void canPlay() {
        assertEquals("Here comes the saxophone!..", saxophone.play());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(1000, saxophone.getBuyingPrice(), 0.1);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(1200, saxophone.getSellingPrice(), 0.1);
    }
}
