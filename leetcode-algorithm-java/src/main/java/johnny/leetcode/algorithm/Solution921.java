package johnny.leetcode.algorithm;

import java.util.Stack;

/**
 * 921. Minimum Add to Make Parentheses Valid
 * Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions ) so that the resulting parentheses string is valid.
 * <p>
 * Formally, a parentheses string is valid if and only if:
 * <p>
 * It is the empty string, or
 * It can be written as AB (A concatenated with B), where A and B are valid strings, or
 * It can be written as (A), where A is a valid string.
 * Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: "())"
 * Output: 1
 * Example 2:
 * <p>
 * Input: "((("
 * Output: 3
 * Example 3:
 * <p>
 * Input: "()"
 * Output: 0
 * Example 4:
 * <p>
 * Input: "()))(("
 * Output: 4
 * <p>
 * <p>
 * Note:
 * <p>
 * S.length <= 1000
 * S only consists of '(' and ')' characters.
 *
 * @author Johnny
 */
public class Solution921 {
    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            if (c == ')' && stack.peek() == '(') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.size();
    }

    public int minAddToMakeValid2(String S) {
        if (S == null || S.length() == 0) {
            return 0;
        }

        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    count++;
                } else {
                    char top = stack.peek();
                    if (top == '(') {
                        stack.pop();
                    } else {
                        count++;
                    }
                }
            }
        }

        count += stack.size();

        return count;
    }
}
