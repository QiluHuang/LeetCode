package dArray;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NonDecreasingArrayTest {
    private static int[] nums;

    @BeforeClass
    public static void setUp() {
        nums = new int[]{12,8,15,11,13,14};
    }

    @Test
    public void genralTest() {
        boolean res = NonDecreasingArray.checkPossibility(nums);
        assertEquals(false, res);
    }
}
