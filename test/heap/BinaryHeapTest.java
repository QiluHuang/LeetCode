package heap;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BinaryHeapTest {
    private static int[] randomArray;

    @BeforeClass
    public static void setUp() {
        randomArray = new int[]{7, 5, 19, 8, 4, 1, 20, 13, 16};
    }

    @Test
    public void buildMinHeap() {
        BinaryHeap res = new BinaryHeap(randomArray);

        int[] test = {1, 4, 7, 8, 5, 19, 20, 13, 16};
        int[] expected = new int[test.length + 1];
        int i = 1;
        for (int t : test) {
            expected[i++] = t;
        }

        assertEquals(expected, res);
    }
}
