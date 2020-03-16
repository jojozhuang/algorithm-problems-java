package johnny.leetcode.algorithm;

import java.util.Stack;

/**
 * 1249. Minimum Remove to Make Valid Parentheses
 *
 * Given a string s of '(' , ')' and lowercase English characters.
 *
 * Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.
 *
 * Formally, a parentheses string is valid if and only if:
 *
 * It is the empty string, contains only lowercase characters, or
 * It can be written as AB (A concatenated with B), where A and B are valid strings, or
 * It can be written as (A), where A is a valid string.
 *
 *
 * Example 1:
 *
 * Input: s = "lee(t(c)o)de)"
 * Output: "lee(t(c)o)de"
 * Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
 * Example 2:
 *
 * Input: s = "a)b(c)d"
 * Output: "ab(c)d"
 * Example 3:
 *
 * Input: s = "))(("
 * Output: ""
 * Explanation: An empty string is also valid.
 * Example 4:
 *
 * Input: s = "(a(b(c)d)"
 * Output: "a(b(c)d)"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 10^5
 * s[i] is one of  '(' , ')' and lowercase English letters.
 *
 */
public class SolutionA1249 {
    // Stack with two pass
    public String minRemoveToMakeValid(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        // first pass: remove the redundant right parenthesis
        Stack<Character> stack = new Stack<>();
        int count = 0; // count of left parenthesis
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
                count++;
            } else if (c == ')') {
                if (count > 0) {
                    stack.push(c);
                    count--;
                }
            } else {
                stack.push(c);
            }
        }

        // second pass: remove the redundant left parenthesis
        Stack<Character> reverseStack = new Stack();
        count = 0; // count of right parenthesis
        while (!stack.isEmpty()) {
            char c = stack.pop();
            if (c == ')') {
                reverseStack.push(c);
                count++;
            } else if (c == '(') {
                if (count > 0) {
                    reverseStack.push(c);
                    count--;
                }
            } else {
                reverseStack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!reverseStack.isEmpty()) {
            sb.append(reverseStack.pop());
        }

        return sb.toString();
    }
}
