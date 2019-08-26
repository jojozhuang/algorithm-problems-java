package johnny.leetcode.algorithm;

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
    // 128 array
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int[] count = new int[128];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'A']++;
        }
        int ans = 0;
        boolean hasOdd = false;
        for (int i = 0; i < count.length; i++) {
            if (count[i] % 2 == 0) {
                ans += count[i];
            } else {
                hasOdd = true;
                ans += count[i] - 1;
            }
        }
        if (hasOdd) {
            ans++;
        }
        
        return ans;
    }
    // 52 array
    public int longestPalindrome2(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int[] count = new int[52];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            } else if (c >= 'A' && c <= 'Z'){
                count[c - 'A' + 26]++;
            }
        }
        
        int ans = 0;
        boolean hasOdd = false;
        for (int i = 0; i < count.length; i++) {
            if (count[i] % 2 == 0) {
                ans += count[i];
            } else {
                hasOdd = true;
                ans += count[i] - 1;
            }
        }
        
        if (hasOdd) {
            ans++;
        }
        
        return ans;
    }  
}
