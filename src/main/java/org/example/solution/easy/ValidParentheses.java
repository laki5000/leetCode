package org.example.solution.easy;

import java.util.Stack;

// 20. Valid Parentheses https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char current = s.charAt(i);

            if (!checkCurrentIsValid(stack, current)) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    private boolean checkCurrentIsValid(Stack<Character> stack, char current) {
        boolean isEmpty = stack.isEmpty();

        switch (current) {
            case ')' -> {
                return !isEmpty && stack.pop() == '(';
            }
            case '}' -> {
                return !isEmpty && stack.pop() == '{';
            }
            case ']' -> {
                return !isEmpty && stack.pop() == '[';
            }
            default -> stack.push(current);
        }

        return true;
    }
}
