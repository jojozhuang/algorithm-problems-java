package johnny.algorithm.leetcode;

import java.util.Stack;

/**
 * Valid Parentheses.
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
 * 
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid
 * but "(]" and "([)]" are not.
 * 
 * @author Johnny
 */
public class Solution020 {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        
        if (s.length() % 2 != 0) {
            return false;
        }
        
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
    
    public boolean isValid2(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        
        if (s.length() % 2 != 0) {
            return false;
        }
        
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            } else if (current == ')' || current == '}' || current == ']') {
                if (stack.empty()) {
                    return false;
                }
                char top = stack.pop();
                if ((current == ')' && top == '(') ||
                    (current == '}' && top == '{') ||
                    (current == ']' && top == '[')) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        
       return stack.isEmpty();
    }
}
