package dString.Regex;

public class ReplacementUsingReplaceAll {
    public static void main(String[] args) {
        String str1 = "createTime";
        String str2 = "createTimeAt";
        String regex = "([A-Z])+";

        System.out.println(str1.replaceAll(regex, "_$0"));
        System.out.println(str1.replaceAll(regex, "_$1").toLowerCase());

    }
}
