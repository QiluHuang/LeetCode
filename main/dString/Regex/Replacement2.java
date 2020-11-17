package dString.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replacement2 {
    private static String REGEX = "a*b";  // a���Գ���0�λ��߸���Σ�b����һ��
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
