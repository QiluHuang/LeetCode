package dString.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replacement2 {
    private static String REGEX = "a*b";  // a可以出现0次或者更多次，b就是一次
    private static String INPUT = "aabfooaabfooabfoob";
    private static String REPLACE = "-";

    private static Pattern pattern;
    private static Matcher matcher;

    public static void main(String[] args) {
        pattern = Pattern.compile(REGEX);

        matcher = pattern.matcher(INPUT);
        StringBuilder builder = new StringBuilder();
        while (matcher.find()) {
            matcher.appendReplacement(builder, REPLACE);
        }
        matcher.appendTail(builder);
        System.out.println(builder.toString());
    }
}
