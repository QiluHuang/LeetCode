package dArray;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FindLongestHarmoniousSubsequenceTest {
    private static int[] test;
    @BeforeClass
    public static void setUp() {
        test = new int[]{1,3,2,2,5,2,3,7};
    }

    @Test
    public void generalTest() {
        int res = FindLongestHarmoniousSubsequence.findLHS(test);
        assertEquals(5,res);
    }
}
