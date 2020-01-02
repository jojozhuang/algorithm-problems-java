package johnny.lintcode.algorithm;

import java.util.ArrayList;

/**
 * Longest Palindrome
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
 *
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 *
 * Example
 * Example 1:
 *
 * Input : s = "abccccdd"
 * Output : 7
 * Explanation :
 * One longest palindrome that can be built is "dccaccd", whose length is `7`.
 * 
 * @author Johnny
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int[] count = new int[128];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'A']++;
        }

        int total = 0;
        for (int i = 0; i < 128; i++) {
            if (count[i] > 0) {
                if (count[i] % 2 == 0) {
                    total += count[i];
                } else {
                    total += count[i] - 1;
                }
            }
        }

        if (total < s.length()) {
            total++;
        }

        return total;
    }
}
