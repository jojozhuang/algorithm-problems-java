package johnny.algorithm.leetcode;

/**
 * Longest Palindrome
 * 
 * Given a string which consists of lowercase or uppercase letters, find the 
 * length of the longest palindromes that can be built with those letters.
 * 
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * 
 * Note:
 * Assume the length of given string will not exceed 1,010.
 * 
 * Example:
 * 
 * Input:
 * "abccccdd"
 * 
 * Output:
 * 7
 * 
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 * 
 * @author Johnny
 */
public class Solution409 {
    public int longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        
        int[] counts = new int[52];
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                counts[s.charAt(i) - 'A']++;
            } else {
                counts[s.charAt(i) - 'a' + 26]++;
            }
        }
        
        int result = 0;
        boolean odd = false;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] % 2 == 0) {
                result += counts[i];
            } else {
                result += counts[i] - 1;
                odd = true;
            }
        }
        
        if (odd) {
            return result + 1;
        } else {
            return result;
        }
    }  
}
