package dArray;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxProfitTest {
    @Test
    public void generalTest() {
        int[] test = {7,1,5,3,6,4};

        int res = MaxProfit.maxProfit(test);

        assertEquals(5, res);
    }

    @Test
    public void testTwo() {
        int[] test = {2,1,4};

        int res = MaxProfit.maxProfit(test);

        assertEquals(3, res);
    }
}
