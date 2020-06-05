package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp() {
        saxophone = new Saxophone("brass", "golden", Type.WOODWIND, "soprano");
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
}
