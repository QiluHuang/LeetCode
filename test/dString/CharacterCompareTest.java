package dString;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CharacterCompareTest {
    @Test
    public void compareWordTest() {
        String str1 = "START";
        String str2 = "APPLE";
        int res = CharacterCompare.compareWord(str1, str2);
        assertEquals(1, res);
    }
}
