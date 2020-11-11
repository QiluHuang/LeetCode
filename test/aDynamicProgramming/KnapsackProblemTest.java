package aDynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KnapsackProblemTest {
    /*
     * �������⣺��һ������������Ϊ4��������������Ʒ
     * ��Ʒ    ��  ����  ��  �۸�
     * ���� G  ��   1    |  1500
     * ���� S  |    4    |  3000
     * ���� L  |    3    |  2000
     **/
    @Test
    public void getMaxValTest() {
        int[] weights = {1, 4, 3};
        int[] val = {1500, 3000, 2000};

        int res = KnapsackProblem.getMaxVal(4, weights, val);

        assertEquals(3500, res);
    }
}
