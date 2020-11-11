package dString;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AdditionTest {
    @Test
    public void addStringsTest() {
        String res = Addition.addStrings("0","0");
        assertEquals("0", res);
    }

    @Test
    public void addBinaryTest() {
        String res = Addition.addBinary("1010","1011");
        assertEquals("10101", res);
    }
}
