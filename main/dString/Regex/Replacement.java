package dString.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replacement {
    private static String REGEX = "dog";
    private static String INPUT = "The dog says memov. " + "All dogs say memow.";
    private static String REPLACE = "cat";

    private static Pattern pattern;
    private static Matcher matcher;

    /**
     *
     * replaceAll()
     * replaceFirst()
     *
     * */
    public static void main(String[] args) {
        pattern = Pattern.compile(REGEX);

        System.out.println("Origin:\t" + INPUT);

        // get a matcher object
        matcher = pattern.matcher(INPUT);
        INPUT = matcher.replaceAll(REPLACE);
        System.out.println("Result:\t" + INPUT);


        String str = "-$12540.2";
        String res = str.replaceAll("\\$", "");
        System.out.println("\nstr:\t" + str + "\nres:\t" + res);

    }
}
