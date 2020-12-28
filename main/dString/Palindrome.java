package dString;

import java.util.HashSet;
import java.util.Set;

public class Palindrome {

    /** 125. Valid Palindrome */
    public static boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        int i = 0, j = s.length() - 1;

        String str = s.toLowerCase();

        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else if (!Character.isLetterOrDigit(str.charAt(i))){
                i++;
            } else if (!Character.isLetterOrDigit(str.charAt(j))) {
                j--;
            } else if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    /** 409. Longest Palindrome */
    public static int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
            } else {
                set.remove(c);
                count++;
            }
        }

        int res = count * 2;

        return set.size() == 0 ? res : res + 1;
    }

    /** 680. Valid Palindrome II */
    public boolean validPalindrome(String s) {
        return validPalindromeHelper(s, 0, s.length()-1, 1);
    }

    private boolean validPalindromeHelper(String s, int left, int right, int count) {
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                if (count == 1) {
                    return validPalindromeHelper(s, left + 1, right, count - 1) || validPalindromeHelper(s, left, right - 1, count - 1);
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
