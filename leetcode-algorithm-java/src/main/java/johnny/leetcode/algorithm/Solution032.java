package johnny.leetcode.algorithm;

import java.util.Stack;

/**
 * Longest Valid Parentheses.
 * Given a string containing just the characters '(' and ')', find the length
 * of the longest valid (well-formed) parentheses substring.
 * <p>
 * For "(()", the longest valid parentheses substring is "()", which has
 * length = 2.
 * <p>
 * Another example is ")()())", where the longest valid parentheses substring
 * is "()()", which has length = 4.
 *
 * @author Johnny
 */
public class Solution032 {
    public int longestValidParentheses2(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int maxans = 0;
        int dp[] = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                maxans = Math.max(maxans, dp[i]);
            }
        }
        return maxans;
    }

    //http://www.geeksforgeeks.org/length-of-the-longest-valid-substring/
    public int longestValidParentheses(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        // Create stack to store the position of character
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(-1);

        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    max = Math.max(max, i - stack.peek());
                } else {
                    stack.push(i);
                }
            }
        }

        return max;
    }
}
