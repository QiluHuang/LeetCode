package aStringSearching;

public class KMP {
    /**
     *
     * @param origin 源字符串
     * @param target 子串
     * @param next 子串的部分匹配值表
     * @return 没有匹配到，返回 -1， 否则返回第一个匹配的位置
     */
    public static int kmpSearch(String origin, String target, int[] next) {
        for (int i = 0, j = 0; i < origin.length(); i++) {
            while (j > 0 && origin.charAt(i) != target.charAt(j)) {
                j = next[j - 1];
            }
            if (origin.charAt(i) == target.charAt(j)) {
                j++;
            }

            // 找到了！
            if (j == target.length()) {
                return i - j + 1;
            }
        }

        // 找不到任何
        return -1;
    }


    // 1. get target array's Partial Match Table
    //    获取一个字符串（子串）的部分匹配值
    public static int[] getNext(String target) {
        int[] next = new int[target.length()];

        // corner case 如果字符串长度为1，部分匹配值就是0
        next[0] = 0;

        // i: 遍历整个数组, j: 遍历前缀
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

字符串匹配值表
       0  1  2  3  4  5  6
       A  B  C  D  A  B  D
next   0  0  0  0  1  2  0
                         i
       j

 i  j  字符串
 0  0   A
 1  0

* */