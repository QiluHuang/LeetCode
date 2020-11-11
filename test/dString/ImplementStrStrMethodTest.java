package dString;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ImplementStrStrMethodTest {
    @Test
    public void generalTest() {
        int res = ImplementStrStrMethod.strStr("mississippi", "issipi");

        assertEquals(-1, res);
    }
}
