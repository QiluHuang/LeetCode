package dString;

public class TrimFrontAndEndSpace {
    public static String trim(String str) {
        int len = str.length();

        int left = 0, right = len - 1;
        while(str.charAt(left) == ' ') {
            left++;
        }

        while (str.charAt(right) == ' ') {
            right--;
        }

        return str.substring(left, right + 1);
    }
}
