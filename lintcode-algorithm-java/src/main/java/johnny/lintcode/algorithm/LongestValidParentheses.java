package johnny.lintcode.algorithm;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Longest Valid Parentheses
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
 *
 * Example 1:
 *
 * Input: "(()"
 * Output: 2
 * Explanation: The longest valid parentheses substring is "()"
 * Example 2:
 *
 * Input: ")()())"
 * Output: 4
 * Explanation: The longest valid parentheses substring is "()()"
 *
 * @author Johnny
 */
public class LongestValidParentheses {
    /**
     * @param s: a string
     * @return: return a integer
     */
    public int longestValidParentheses(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Deque<Character> deque = new LinkedList<>();
        Deque<Integer> index = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                deque.addLast(c);
                index.addLast(i);
            } else {
                if (deque.isEmpty()) {
                    deque.addLast(c);
                    index.addLast(i);
                } else if (deque.peekLast() == '(') {
                    deque.removeLast();
                    index.removeLast();
                } else {
                    deque.addLast(c);
                    index.addLast(i);
                }
            }
        }

        if (index.isEmpty()) {
            return s.length();
        }

        List<Integer> list = new ArrayList<>();
        while (!index.isEmpty()) {
            list.add(index.removeFirst());
        }

        int max = 0;
        if (list.get(0) - 0 > max) {
            max = list.get(0);
        }
        if (s.length() - list.get(list.size() - 1) - 1 > max) {
            max = s.length() - list.get(list.size() - 1) - 1;
        }
        for (int i = 1; i < list.size(); i++) {
            max = Math.max(max, list.get(i) - list.get(i - 1) - 1);
        }

        return max;
    }
}
