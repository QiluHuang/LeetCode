package aSlidingWindow;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumSubstringTest {
    @Test
    public void bruteForceTest() {
        String str = "ABCDEFG";
        String target = "BD";
        assertEquals("BCD", MinimumSubstring.getMinimumSubstringBruteForce(str, target));
    }
}