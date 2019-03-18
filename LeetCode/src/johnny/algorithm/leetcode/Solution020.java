package johnny.algorithm.leetcode;

import java.util.HashMap;
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
        if (s.length() % 2 != 0) {
            return false;
        }
        
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char match = stack.pop();
                if (c == ')' && match != '(') {
                    return false;
                }
                if (c == ']' && match != '[') {
                    return false;
                }
                if (c == '}' && match != '{') {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    public boolean isValid3(String s) {
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
    
    public boolean isValid2(String s, HashMap<Character, Character> map) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        
        if (s.length() % 2 != 0) {
            return false;
        }
        
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(map.get(c));
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
