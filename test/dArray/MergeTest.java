package dArray;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MergeTest {
    @Test
    public void TestOnde() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        Merge.merge(nums1, 3, nums2, 3);
    }
}
