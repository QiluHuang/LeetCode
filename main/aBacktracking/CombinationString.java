package aBacktracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CombinationString {
    /**
     * 17. Letter Combinations of a Phone Number
     **/
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.length() == 0) return list;

        Map<Character, String> map = constructMap();
        StringBuilder builder = new StringBuilder();

        backtrack(0, digits, map, list, builder);

        return list;
    }

    private static void backtrack(int index, String digits, Map<Character, String> map, List<String> list, StringBuilder builder) {
        if (index == digits.length()) {
            list.add(builder.toString());
            return;
        }

        char c = digits.charAt(index);
        String str = map.get(c);
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            builder.append(str.charAt(i));
            backtrack(index + 1, digits, map, list, builder);
            builder.deleteCharAt(builder.length() - 1);
        }
    }

    private static Map<Character, String> constructMap() {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        return map;
    }
}
