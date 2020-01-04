package johnny.leetcode.algorithm;

/**
 * Palindromic Substrings
 * <p>
 * Given a string, your task is to count how many palindromic substrings in this
 * string.
 * <p>
 * The substrings with different start indexes or end indexes are counted as
 * different substrings even they consist of same characters.
 * <p>
 * Example 1:
 * Input: "abc"
 * Output: 3
 * <p>
 * Explanation: Three palindromic strings: "a", "b", "c".
 * <p>
 * Example 2:
 * Input: "aaa"
 * Output: 6
 * <p>
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 * <p>
 * Note:
 * The input string length won't exceed 1000.
 *
 * @author Johnny
 */
public class Solution647 {
    int count = 0;

    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;

        for (int i = 0; i < s.length(); i++) { // i is the mid point
            extendPalindrome(s, i, i); // odd length;
            extendPalindrome(s, i, i + 1); // even length
        }

        return count;
    }

    private void extendPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
    }
}
