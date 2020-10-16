package dStack;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s.length() == 1) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')' && !stack.isEmpty() && stack.peek() == '(') stack.pop();
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') stack.pop();
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') stack.pop();
            else stack.push(c);
        }

        return stack.isEmpty();
    }
}
