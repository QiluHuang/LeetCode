package dString;

public class MaxSameString {
    /*
    ��ȡ�����ַ����������ͬ�Ӵ�������:
    str1 = "abcwerthelloyuiodef��;str2 = "cvhellobnm" ��ʾ:���̵��Ǹ������г������εݼ����Ӵ���ϳ��Ĵ��Ƚϡ�

    ǰ�᣺�����ַ����У�ֻ��һ�������ͬ�Ӵ�
     */
    public static String getMaxSameString(String str1, String str2) {
        if (str1 != null || str2 != null) {
            String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
            String minStr = (str1.length() < str2.length()) ? str1 : str2;

            int len = minStr.length();

            for (int i = 0; i < maxStr.length(); i++) {
                for (int x = 0, y = len - i; y < len; x++, y++) {
                    String subStr = minStr.substring(x, y);
                    if (maxStr.contains(subStr)) {
                        return subStr;
                    }
                }
            }
        }
        return "We cannot find their intersection string";
    }
}
