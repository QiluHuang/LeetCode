package dString.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matching {
//    private static final String REGEX = "abc";
//    private static final String INPUT = "abc";

    private static final String REGEX = "foo";
    private static final String INPUT = "foooooooooooooooooooo";
    private static Pattern pattern;
    private static Matcher matcher;

    public static void main(String[] args) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);

        System.out.println("Current REGEX is:\t" + REGEX);
        System.out.println("Current INPUT is:\t" + INPUT);

        System.out.println("lookingAt():\t" + matcher.lookingAt());  // true
        System.out.println("matches():\t" + matcher.matches());      // false




    }
}
