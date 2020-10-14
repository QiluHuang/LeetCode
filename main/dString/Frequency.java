package dString;

public class Frequency {
    /*
    ��ȡһ���ַ�������һ���ַ����г��ֵĴ�����
    ����:��ȡ�� ab���� ��abkkcadkabkebfkabkskab�� �г��ֵĴ���
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
