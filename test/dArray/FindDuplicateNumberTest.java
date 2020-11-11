package dArray;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FindDuplicateNumberTest {
    @Test
    public void generalTest() {
        int[] nums = {1,3,4,2,3};
        int res = FindDuplicateNumber.findDuplicate(nums);

        assertEquals(3, res);
    }
}
