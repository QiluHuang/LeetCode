package dString;

public class Frequency {
    /*
    获取一个字符串在另一个字符串中出现的次数。
    比如:获取“ ab”在 “abkkcadkabkebfkabkskab” 中出现的次数
     */
    public static int getCount(String mainStr, String subStr) {
        int mainLen = mainStr.length();
        int subLen = subStr.length();
        int count = 0;
        int index = 0;

        if (subLen <= mainLen) {
            while ((index = mainStr.indexOf(subStr, index)) != -1) {
                count++;
                index += subStr.length();
            }
        }


        return count;
    }
}


/*
ab

0  1  2  3  4  5  6  7
a  b  k  k  k  c  d  a  bdewwsabffefabddws



*/
