package dString;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Parentheses {
    /** 20. Valid Parentheses */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.empty()) stack.push(c);
            else if (c == ')' && stack.peek() == '(') stack.pop();
            else if (c == ']' && stack.peek() == '[') stack.pop();
            else if (c == '}' && stack.peek() == '{') stack.pop();
            else stack.push(c);
        }

        System.out.println(stack.empty());
        return stack.empty();
    }


    /** 678. Valid Parenthesis String */
    public boolean checkValidString(String s) {
        // we have too many right tokens. not enough left/wild to pair
        char[] chars = s.toCharArray();
        int leftWild = 0;
        for (char c : chars) {
            if (c == ')') {
                if (leftWild == 0) return false;
                leftWild--;
            } else {
                leftWild++;
            }
        }

        // we have too many left tokens. not enough right/wild to pair
        int left = 0;
        for(char c : chars) {
            if (c == '(') {
                left++;
            } else {
                left = Math.max(0, left - 1);    // (******* => (     *
            }
        }

        return left == 0;
    }

    /** 856. Score of Parentheses */
    public int scoreOfParentheses(String S) {
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

    /**  1249. Minimum Remove to Make Valid Parentheses */
    public String minRemoveToMakeValid(String s) {
        Set<Integer> indexesToRemove = new HashSet<>();
        Stack<Integer> stack = new Stack<>();   // only contain (
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    indexesToRemove.add(i);
                } else {
                    stack.pop();
                }
            }
        }

        // Put any indexes reamining on stack into the set
        while (!stack.isEmpty()) indexesToRemove.add(stack.pop());

        // construct new string
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!indexesToRemove.contains(i)) {
                builder.append(s.charAt(i));
            }
        }

        return builder.toString();
    }


}
