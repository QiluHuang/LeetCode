package dString;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TrimFrontAndEndSpaceTest {
    @Test
    public void trimTest() {
        String str = "     Hello!      ";
        String res = TrimFrontAndEndSpace.trim(str);
        System.out.println(res);
        assertEquals("Hello!", res);
    }
}
