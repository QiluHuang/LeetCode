package dString.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Frequency {
    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";
    private static Pattern pattern;
    private static Matcher matcher;

    public static void main(String[] args) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT); // get a matcher object
        int count = 0;



        while (matcher.find()) {

            count++;

            System.out.println("------------");
            System.out.println("Match number\t" + count);
            System.out.println("start():\t" + matcher.start());
            System.out.println("end():\t" + matcher.end());
        }
    }

}
