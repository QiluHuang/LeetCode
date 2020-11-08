package aSlidingWindow;

/*
 str: ABCDEFG
 target: BD

 return str中包含target值最短的连续子字符串， 即BCD
* */


public class MinimumSubstring {
    // Method 2 : Sliding Window
    public static String getMinimumSubstringSlidingWindow(String str, String target) {
        String res = "";
        int minLen = Integer.MAX_VALUE;

        int[] targetSet = new int[256];
        for (int i = 0; i < target.length(); i++) {
            int ch = target.charAt(i);
            targetSet[ch] += 1;
        }

        int right = 0, left = 0;


        return res;
    }

    // Method 1 : Brute Force
    // list all the substring
    // check contains target characters
    // find the minimum len res
    public static String getMinimumSubstringBruteForce(String str, String target) {
        String res = "";
        int minLen = Integer.MAX_VALUE;

        for (int start = 0; start < str.length(); start++) {
            for (int end = start + 1; end <= str.length(); end++) {
                String currSubstring = str.substring(start, end);
                if (hasAllCharacters(currSubstring, target)) {
                    if (currSubstring.length() < minLen) {
                        minLen = currSubstring.length();
                        res = currSubstring;
                    }
                }
            }
        }

        return res;
    }

    private static boolean hasAllCharacters(String str, String target) {
        int[] targetMap = new int[256];
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            targetMap[ch] += 1;
        }

        for (int i = 0; i < target.length(); i++) {
            int ch = target.charAt(i);
            if (targetMap[ch] <= 0) {
                return false;
            } else {
                targetMap[ch] -= 1;
            }
        }

        return true;
    }
}
