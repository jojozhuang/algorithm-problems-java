package johnny.algorithm.leetcode;

/**
 *680. Valid Palindrome II
 Given a non-empty string s, you may delete at most one character. Judge whether you can make it
  a palindrome.

Example 1:
Input: "aba"
Output: True
Example 2:
Input: "abca"
Output: True
Explanation: You could delete the character 'c'.
Note:
The string will only contain lowercase characters a-z. The maximum length of the string is 50000.
 * @author Johnny
 */
public class Solution680{
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return isPalindrome(s, start + 1, end) ||
                       isPalindrome(s, start, end - 1);
            }
            start++;
            end--;
        }
        
        return true;
    }
    
    boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}