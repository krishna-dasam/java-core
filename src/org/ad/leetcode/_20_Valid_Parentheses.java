package org.ad.leetcode;

import java.util.Stack;

public class _20_Valid_Parentheses {

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        if (!(chars.length % 2 == 0) || chars.length == 0) return false;
        Stack<Character> stack = new Stack<>();
        for (char aChar : chars) {
            if (aChar == '{' || aChar == '[' || aChar == '(') {
                stack.push(aChar);
            } else if (aChar == ('}')) {
                if (stack.isEmpty() || !stack.pop().equals('{')) return false;
            } else if (aChar == (']')) {
                if (stack.isEmpty() || !stack.pop().equals('[')) return false;
            } else if (aChar == (')')) {
                if (stack.isEmpty() || !stack.pop().equals('(')) return false;
            } else return false;
        }
        return stack.isEmpty();
    }

    public boolean isValid_1(String s) {
        char[] chars = s.toCharArray();
        if (!(chars.length % 2 == 0) || chars.length == 0) return false;
        Stack<Character> stack = new Stack<>();
        for (char aChar : chars) {
            if (aChar == '(') stack.push(')');
            else if (aChar == '{') stack.push('}');
            else if (aChar == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != aChar) return false;
        }
        return stack.isEmpty();
    }
}
