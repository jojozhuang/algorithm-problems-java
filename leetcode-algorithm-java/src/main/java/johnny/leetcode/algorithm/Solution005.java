package johnny.leetcode.algorithm;

/**
 * Longest Palindromic Substring.
 * Given a string S, find the longest palindromic substring in S. You may assume
 * that the maximum length of S is 1000, and there exists one unique longest
 * palindromic substring.
 *
 * @author Johnny
 */
public class Solution005 {
    // O(n^2)
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        int start = 0;
        int end = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] pos1 = helper(s, i, i);
            int[] pos2 = helper(s, i, i + 1);
            if (pos1[1] - pos1[0] + 1 > max) {
                max = pos1[1] - pos1[0] + 1;
                start = pos1[0];
                end = pos1[1];
            }
            if (pos2[1] - pos2[0] + 1 > max) {
                max = pos2[1] - pos2[0] + 1;
                start = pos2[0];
                end = pos2[1];
            }
        }

        return s.substring(start, end + 1);
    }

    // return index not string
    private int[] helper(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }

        return new int[]{start + 1, end - 1};
    }

    // O(n^2)
    public String longestPalindrome2(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = palindrome(s, i, i);
            String s2 = palindrome(s, i, i + 1);
            if (s1.length() > ans.length()) {
                ans = s1;
            }
            if (s2.length() > ans.length()) {
                ans = s2;
            }
        }

        return ans;
    }

    // return sub string
    private String palindrome(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }

        return s.substring(start + 1, end);
    }

    // use global variable
    private int low = 0, maxLen = 0;

    public String longestPalindrome3(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            helper3(s, i, i);            // odd
            helper3(s, i, i + 1);  // even
        }
        return s.substring(low, low + maxLen);
    }

    private void helper3(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }

        if (maxLen < end - start - 1) { // this also covers the scenario that left != right at first place
            low = start + 1;
            maxLen = end - start - 1;
        }
    }
}
