package dStack;

import java.util.Stack;


/**
 * 856. Score of Parentheses
 * */
public class ScoreOfParentheses {
    public static int scoreOfParentheses(String S) {
        int res = 0;
        if (S.length() == 0) return res;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char currChar = S.charAt(i);
            if (currChar == '(') {
                stack.push(-1);

            } else if (currChar == ')') {
                int sum = 0;
                while (stack.peek() != -1) {
                    sum += stack.pop();
                }
                if (stack.peek() == -1) {
                    stack.pop();
                    if (sum == 0) {
                        stack.push(1);
                    } else {
                        stack.push(sum * 2);
                    }
                }
            }
        }


        while (!stack.isEmpty()) {
            res += stack.pop();
        }

        return res;
    }
}
