package aDynamicProgramming;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];

        int maxLen = 0;
        int startIdx = 0;
        int endIdx = 0;
        for (int col = 0; col < len; col++) {
            char endChar = s.charAt(col);
            for (int row = 0; row <= col; row++) {
                char startChar = s.charAt(row);
                if (row == col) dp[row][col] = true;
                else {
                    if (startChar != endChar) {
                        dp[row][col] = false;
                    } else {
                        if (row + 1 == col) {
                            dp[row][col] = true;
                        } else {
                            dp[row][col] = (dp[row + 1][col - 1] == true) ? true : false;
                        }
                    }

                    int currLen = col - row + 1;
                    if (dp[row][col] == true && currLen > maxLen) {
                        maxLen = currLen;
                        startIdx = row;
                        endIdx = col;
                    }
                }

            }
        }

        return s.substring(startIdx, endIdx + 1);
    }
}
