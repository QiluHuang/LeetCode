package dString;

public class CurrencyRecognition {
    public static boolean isCurrency(String strAmount) {
        boolean hasParenthese = false;
        int i = 0;
        int len = strAmount.length();

        if (strAmount.charAt(i) == '-') i++;

        if (strAmount.charAt(i) == '(' && strAmount.charAt(len - 1) != ')') {
            return false;
        } else if (strAmount.charAt(i) == '(' && strAmount.charAt(len - 1) == ')') {
            hasParenthese = true;
            i++;
        }

        System.out.println("\u0024");
        String symbol = strAmount.substring(i, i+1);
        if (!symbol.equals("\u0024") && !symbol.equals("\u20ac") && !symbol.equals("\uffe5")) {
            return false;
        } else if (symbol.equals("\u0024") || symbol.equals("\u20ac") || symbol.equals("\uffe5")) {
            return hasParenthese ? isCorrectNumber(strAmount.substring(i, len - 1)) : isCorrectNumber(strAmount.substring(i));
        }

        return true;
    }

    private static boolean isCorrectNumber(String strNum) {
        boolean begin = true;
        boolean beforeDot = true;
        boolean hasDot = false;
        boolean hasNumBeforeDot = false;
        int count = 3;
        int i = 1;
        int afterDotCount = 4;

        while (begin && i < strNum.length()) {
            if (strNum.charAt(i) == '.' && hasNumBeforeDot) {
                i++;
                break;
            } else if (strNum.charAt(i) < '0' || strNum.charAt(i) > '9') {
                return false;
            } else if (strNum.charAt(i) == ','  && 0 <= count && count < 3) {
                count = 4;
                begin = false;
            }
            count--;
            i++;
            hasNumBeforeDot = true;
        }

        while (beforeDot && i < strNum.length()) {
            if (strNum.charAt(i) < '0' || strNum.charAt(i) > '9') {
                return false;
            } else if (strNum.charAt(i) == ','  && count == 0) {
                count = 4;
            } else if (strNum.charAt(i) == '.' && count == 0) {
                beforeDot = false;
                hasDot = true;
            } else {
                return false;
            }
            count--;
            i++;
        }


        if (strNum.substring(0, 1) == "\u0024" || strNum.substring(0, 1) == "\u20ac") afterDotCount = 2;
        if (hasDot && strNum.length() - i  != afterDotCount) return false;
        while (hasDot && i < strNum.length()) {
            if (strNum.charAt(i) < '0' || strNum.charAt(i) > '9') {
                return false;
            }
        }

        return true;
    }
}
