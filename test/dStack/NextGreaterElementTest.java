package dStack;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NextGreaterElementTest {
    private static int[] nums1;
    private static int[] nums2;
    @BeforeClass
    public static void setUp() {
        nums1 = new int[]{137, 59, 92, 122, 52, 131, 79, 236, 94, 171, 141, 86, 169, 199, 248, 120, 196, 168, 77};
        nums2 = new int[]{137, 59, 92, 122, 52, 131, 79, 236, 94, 171, 141, 86, 169, 199, 248, 120, 196, 168, 77};
    }

    @Test
    public void generalTest() {
        int[] res = NextGreaterElement.nextGreaterElement(nums1, nums2);
        int[] expect = new int[]{236, 92, 122, 131, 131, 236, 236, 248, 171, 199, 169, 169, 199, 248, -1, 196, -1, -1, -1};
        assertEquals(expect, res);
    }
}
