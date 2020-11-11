package dString;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FrequencyTest {
    @Test
    public void getCountTest() {
        String mainStr = "abwijassojabwfojabso";
        String subStr = "ab";
        int res = Frequency.getCount(mainStr, subStr);
        assertEquals(3, res);
    }
}
