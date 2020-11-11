package aDynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KnapsackProblemTest {
    /*
     * 背包问题：有一个背包，容量为4磅，现有如下物品
     * 物品    ｜  重量  ｜  价格
     * 吉他 G  ｜   1    |  1500
     * 音响 S  |    4    |  3000
     * 电脑 L  |    3    |  2000
     **/
    @Test
    public void getMaxValTest() {
        int[] weights = {1, 4, 3};
        int[] val = {1500, 3000, 2000};

        int res = KnapsackProblem.getMaxVal(4, weights, val);

        assertEquals(3500, res);
    }
}
