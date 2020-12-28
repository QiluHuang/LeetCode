package aSlidingWindow;

/**
 * 3. Longest Substring Without Repeating Characters
 * */
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int firstLetter = 0;
        int maxLen = 0;

        int[] charLastPos = new int[256];
        for (int i = 0; i < 256; i++) {
            charLastPos[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (charLastPos[currChar] >= firstLetter) {
                firstLetter = charLastPos[currChar] + 1;
            }
            charLastPos[currChar] = i;
            int currLen = i - firstLetter + 1;
            maxLen = Math.max(currLen, maxLen);
        }

        return maxLen;
    }
}
