package dArray;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.List;

public class SpiralMatrixTest {
    @Test
    public void spiralOrderTest() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> res = SpiralMatrix.spiralOrder(matrix);
        assertEquals(List.of(1,2,3,6,9,8,7,4,5), res);
    }
}
