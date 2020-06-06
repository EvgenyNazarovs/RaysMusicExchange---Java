package instruments;

import instruments.Guitar;
import instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("wood", "yellow", Type.STRING, 100, 120, 6);
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("yellow", guitar.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(Type.STRING, guitar.getType());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Strum, strum, strum...", guitar.play());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(100, guitar.getBuyingPrice(), 0.1);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(120, guitar.getSellingPrice(), 0.1);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(20, guitar.calculateMarkup(), 0.1);
    }




}
