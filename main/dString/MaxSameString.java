package dString;

public class MaxSameString {
    /*
    获取两个字符串中最大相同子串。比如:
    str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm" 提示:将短的那个串进行长度依次递减的子串与较长的串比较。

    前提：两个字符串中，只有一个最大相同子串
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
