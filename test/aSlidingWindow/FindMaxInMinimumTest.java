package aSlidingWindow;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FindMaxInMinimumTest {
    @Test
    public void bruteForceTest() {
        List<Integer> space1 = Arrays.asList(1,2,3,1,2);
        assertEquals(3, FindMaxInMinimum.segmentBruteForce(1, space1));

        List<Integer> space2 = Arrays.asList(1,1,1);
        assertEquals(1, FindMaxInMinimum.segmentBruteForce(2, space2));

        List<Integer> space3 = Arrays.asList(2,5,4,6,8);
        assertEquals(4, FindMaxInMinimum.segmentBruteForce(3, space3));
    }

}