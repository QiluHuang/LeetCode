package aBacktracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    /**
     * 22. Generate Parentheses
     **/
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        backtrack(n, n, list, builder);
        return list;
    }

    private static void backtrack(int left, int right, List<String> list, StringBuilder builder) {
        if (right < left) return;

        if (left == 0 && right == 0) {
            list.add(builder.toString());
            return;
        }

        if (left <= right) {
            if (left > 0) {
                backtrack(left - 1, right, list, builder.append("("));
                builder.deleteCharAt(builder.length() - 1);
            }
            if (right > 0) {
                backtrack(left, right - 1, list, builder.append(")"));
                builder.deleteCharAt(builder.length() - 1);
            }
        }
    }
}

