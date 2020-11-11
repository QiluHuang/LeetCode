package dString;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxSameStringTest {
    @Test
    public void getMaxSameStringTest() {
        String str1 = "abcdefghhellodijaojsdfkja";
        String str2 = "wrbashelloiifwa";

        String res = MaxSameString.getMaxSameString(str1, str2);
        assertEquals("hello", res);
    }
}
