package aStringSearching;

public class KMP {
    /**
     *
     * @param origin Դ�ַ���
     * @param target �Ӵ�
     * @param next �Ӵ��Ĳ���ƥ��ֵ��
     * @return û��ƥ�䵽������ -1�� ���򷵻ص�һ��ƥ���λ��
     */
    public static int kmpSearch(String origin, String target, int[] next) {
        for (int i = 0, j = 0; i < origin.length(); i++) {
            while (j > 0 && origin.charAt(i) != target.charAt(j)) {
                j = next[j - 1];
            }
            if (origin.charAt(i) == target.charAt(j)) {
                j++;
            }

            // �ҵ��ˣ�
            if (j == target.length()) {
                return i - j + 1;
            }
        }

        // �Ҳ����κ�
        return -1;
    }


    // 1. get target array's Partial Match Table
    //    ��ȡһ���ַ������Ӵ����Ĳ���ƥ��ֵ
    public static int[] getNext(String target) {
        int[] next = new int[target.length()];

        // corner case ����ַ�������Ϊ1������ƥ��ֵ����0
        next[0] = 0;

        // i: ������������, j: ����ǰ׺
        for (int i = 1, j = 0; i < target.length(); i++) {
            while (j > 0 && target.charAt(i) != target.charAt(j)) {
                j = next[j - 1];
            }
            if (target.charAt(i) == target.charAt(j)) {
                j++;
            }
            next[i] = j;
        }

        return next;
    }
}


/*

�ַ���ƥ��ֵ��
       0  1  2  3  4  5  6
       A  B  C  D  A  B  D
next   0  0  0  0  1  2  0
                         i
       j

 i  j  �ַ���
 0  0   A
 1  0

* */