package johnny.leetcode.algorithm;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 844. Backspace String Compare
 * <p>
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
 * <p>
 * Example 1:
 * <p>
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 * Example 2:
 * <p>
 * Input: S = "ab##", T = "c#d#"
 * Output: true
 * Explanation: Both S and T become "".
 * Example 3:
 * <p>
 * Input: S = "a##c", T = "#a#c"
 * Output: true
 * Explanation: Both S and T become "c".
 * Example 4:
 * <p>
 * Input: S = "a#c", T = "b"
 * Output: false
 * Explanation: S becomes "c" while T becomes "b".
 * Note:
 * <p>
 * 1 <= S.length <= 200
 * 1 <= T.length <= 200
 * S and T only contain lowercase letters and '#' characters.
 * Follow up:
 * <p>
 * Can you solve it in O(N) time and O(1) space?
 *
 * @author Johnny
 */
public class Solution844 {
    public boolean backspaceCompare(String S, String T) {
        String s1 = simplify(S);
        String t1 = simplify(T);

        return s1.equals(t1);
    }

    private String simplify(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        Deque<Character> deque = new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '#') {
                deque.addLast(ch);
            } else {
                if (!deque.isEmpty()) {
                    deque.pollLast();
                }
            }
        }

        char[] arr = new char[deque.size()];
        int i = 0;
        for (Character ch : deque) {
            arr[i] = ch;
            i++;
        }

        return new String(arr);
    }
}
