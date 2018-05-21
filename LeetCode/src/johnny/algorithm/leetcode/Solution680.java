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
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left, right + 1) || isPalindrome(s, left - 1, right);
            }
            left++;
            right--;
        }
        return true;
    }
    
    private boolean isPalindrome(String str, int left, int right) {
        left++;
        right--;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}