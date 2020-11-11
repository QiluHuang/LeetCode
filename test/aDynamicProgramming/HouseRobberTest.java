package aDynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HouseRobberTest {
    @Test
    public void robTest() {
        int[] nums = {2,1,1,2};
        int res = HouseRobber.rob(nums);
        assertEquals(4, res);
    }
}
