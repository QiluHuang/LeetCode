package aBinarySearch;

import org.junit.Test;

public class CapacityToShipPackagesWithinDDaysTest {
    @Test
    public void generalTest() {
        int[] weights = {3,2,2,4,1,4};
        int res = CapacityToShipPackagesWithinDDays.shipWithinDays(weights, 3);
        System.out.println(res);
    }
}
