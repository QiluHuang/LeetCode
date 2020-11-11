package aBinarySearch;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindKClosestElementsTest {
    @Test
    public void generalTest() {
        int[] nums = {1,2,3,4,5};
        List<Integer> res = FindKClosestElements.findClosestElements(nums, 4,3 );
        assertEquals(List.of(1,2,3,4), res);
    }
}
