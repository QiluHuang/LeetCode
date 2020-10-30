package aDynamicProgramming;

public class KnapsackProblem {
    /*
    * �������⣺��һ������������Ϊ4��������������Ʒ
    * ��Ʒ    ��  ����  ��  �۸�
    * ���� G  ��   1    |  1500
    * ���� S  |    4    |  3000
    * ���� L  |    3    |  2000
    **/

    /**
     * ��������
     * @param weight the bag's weight
     * @param weights  the goods's weight
     * @param val the good's val
     * @return
     */
    public static int getMaxVal(int weight, int[] weights, int[] val) {
        int num = weights.length;  // the quantity of the goods
        int[][] maxVal = new int[num + 1][weight + 1];

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= weight; j++) {
                if (weights[i - 1] > j) maxVal[i][j] = maxVal[i - 1][j];
                else if (weights[i - 1] <= j) {
                    maxVal[i][j] = Math.max(val[i - 1], val[i - 1] + maxVal[i - 1][j - weights[i - 1]]);
                }
            }
        }

        return maxVal[num][weight];
    }
}
