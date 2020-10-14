package dString;

public class ImplementStrStrMethod {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (needle.length() > haystack.length()) return -1;

        int res = -1;
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length() && i + j < haystack.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) break;
                else {
                    if (j == needle.length() - 1) {
                        res = i;
                    }
                }
            }
            if (res != -1) {
                break;
            }
        }
        return res;
    }
}
