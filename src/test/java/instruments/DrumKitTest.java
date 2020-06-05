package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {

    DrumKit drumKit;

    @Before
    public void setUp() {
        drumKit = new DrumKit("wood", "white", Type.PERCUSSION, 7);
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", drumKit.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("white", drumKit.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(Type.PERCUSSION, drumKit.getType());
    }

    @Test
    public void hasNumberOfPieces() {
        assertEquals(7, drumKit.getNumberOfPieces());
    }



}
