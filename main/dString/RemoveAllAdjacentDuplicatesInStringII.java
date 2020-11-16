package dString;


/** 1209. Remove All Adjacent Duplicates in String II */
public class RemoveAllAdjacentDuplicatesInStringII {

    /**
     * Method 1: Brute Force
     * Time: O(n^2/k)
     * Space: O(1)
     * */
    public static String removeDuplicatesBruteForce(String s, int k) {
        StringBuilder builder = new StringBuilder(s);

        int len = -1;

        while (len != builder.length()) {
            len = builder.length();
            for (int i = 0, count = 1; i < builder.length(); i++) {
                if (i == 0 || builder.charAt(i) != builder.charAt(i - 1)) {
                    count = 1;
                } else if (++count == k) {
                    builder.delete(i - k + 1, i + 1);
                    break;
                }
            }
        }

        return builder.toString();
    }

    /**
     * Method 2: Using array to store counts
     * Time: O(n)
     * Space: O(n)
     * */
    public static String removeDuplicatesUsingArray(String s, int k) {
        StringBuilder builder = new StringBuilder(s);
        int[] count = new int[s.length()];

        for (int i = 0; i < builder.length(); i++) {
            if (i == 0 || builder.charAt(i) != builder.charAt(i - 1)) {
                count[i] = 1;
            } else {
                count[i] = count[i - 1] + 1;
                if (count[i] == k) {
                    builder.delete(i - k + 1, i + 1);
                    i = i - k;
                }
            }
        }

        return builder.toString();
    }


    /**
     * Method 3: */
//    public static String removeDuplicatesUsingStack(String s, int k) {
//
//    }
}
