package dString;

public class Addition {
    /** 415 Add Strings */
    public static String addStrings(String num1, String num2) {
        StringBuilder builder = new StringBuilder();

        int idx1 = num1.length() - 1;
        int idx2 = num2.length() - 1;
        int carry = 0;
        while (idx1 >= 0 || idx2 >= 0) {
            if (idx1 >= 0) carry += (num1.charAt(idx1--) - '0');
            if (idx2 >= 0) carry += (num2.charAt(idx2--) - '0');
            builder.append(carry % 10);

            carry /= 10;
        }

        if (carry != 0) builder.append(carry);

        return builder.reverse().toString();
    }

    /** 67 Add Binary */
    public static String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();

        int aIdx = a.length() - 1;
        int bIdx = b.length() - 1;
        int carry = 0;
        while (aIdx >= 0 || bIdx >= 0) {
            if (aIdx >= 0) carry += (a.charAt(aIdx--) - '0');
            if (bIdx >= 0) carry += (b.charAt(bIdx--) - '0');
            int val = carry % 2;
            builder.append(val);
            carry /= 2;
        }

        if (carry != 0) builder.append(carry);

        return builder.reverse().toString();
    }
}
