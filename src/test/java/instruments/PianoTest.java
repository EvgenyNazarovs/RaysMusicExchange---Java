package instruments;

import instruments.Piano;
import instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("wood", "black", Type.KEYBOARD, 85);
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("black", piano.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(Type.KEYBOARD, piano.getType());
    }

    @Test
    public void hasNumberOfKeys() {
        assertEquals(85, piano.getNumberOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("Piano playing...", piano.play());
    }


}
