package leetcode.stack;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char latest = stack.peek();
                if (c == ')' && latest == '(') {
                    stack.pop();
                } else if (c == ']' && latest == '[') {
                    stack.pop();
                } else if (c == '}' && latest == '{') {
                    stack.pop();
                } else return false;
            }

        }

        return stack.isEmpty();
    }

}
