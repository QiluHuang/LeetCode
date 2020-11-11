package aBinarySearch;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class BinarySearchTest {
    @Test
    public void searchTest() {
        int nums[] = {-1,0,3,5,9,12};

//        assertEquals(4, BinarySearch.search(nums, 9));
    }

    @Test
    public void twoSumTest() {
//        int[] nums = {2,7,11,15};
//        int[] expect = {1,2};
        int[] nums = {3,24,50,79,88,150,345};   //200
        int[] expect = {3, 6};

//        assertArrayEquals(expect, BinarySearch.twoSum(nums, 9));
    }
}
