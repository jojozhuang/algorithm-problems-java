package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Repeated Substring Pattern
 * <p>
 * Given a non-empty string check if it can be constructed by taking a substring
 * of it and appending multiple copies of the substring together. You may assume
 * the given string consists of lowercase English letters only and its length
 * will not exceed 10000.
 * <p>
 * Example 1:
 * Input: "abab"
 * <p>
 * Output: True
 * <p>
 * Explanation: It's the substring "ab" twice.
 * <p>
 * Example 2:
 * Input: "aba"
 * <p>
 * Output: False
 * <p>
 * Example 3:
 * Input: "abcabcabcabc"
 * <p>
 * Output: True
 * <p>
 * Explanation: It's the substring "abc" four times. (And the substring
 * "abcabc" twice.)
 *
 * @author Johnny
 */
public class Solution459 {
    public boolean repeatedSubstringPattern(String s) {
        if (s.length() == 0) {
            return true;
        }

        List<Integer> divs = divider(s.length());
        if (divs.size() == 0) {
            return false;
        }

        for (int i = 0; i < divs.size(); i++) {
            boolean allsame = true;
            int len = divs.get(i);
            String p = s.substring(0, len);
            for (int j = 0; j <= s.length() - len; j += len) {
                if (!p.equals(s.substring(j, j+len))) {
                    allsame = false;
                    break;
                }
            }

            if (allsame) {
                return true;
            }
        }

        return false;
    }

    private List<Integer> divider(int num)
    {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public boolean repeatedSubstringPattern2(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if ((n % (i + 1)) != 0) {
                continue;
            }
            String pattern = s.substring(0, i + 1);
            int j = i + 1;
            for (; j < n; j += pattern.length()) {
                if (!s.substring(j, j + pattern.length()).equals(pattern)) {
                    break;
                }
            }
            if (j >= n) {
                return true;
            }
        }

        return false;
    }
}
