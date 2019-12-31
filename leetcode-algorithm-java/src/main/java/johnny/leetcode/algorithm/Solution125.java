package johnny.leetcode.algorithm;

/**
 * Valid Palindrome.
 * Given a string, determine if it is a palindrome, considering only 
 * alphanumeric characters and ignoring cases.
 * 
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * 
 * Note:
 * Have you consider that the string might be empty? This is a good question to
 * ask during an interview.
 * 
 * For the purpose of this problem, we define empty string as valid palindrome.
 * 
 * @author Johnny
 */
public class Solution125 {
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            while (left < s.length() && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (right >= 0 && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (left < right) {
                if (Character.toLowerCase(s.charAt(left))
                    != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }
        
        return true;
    }
    // two pointers
    public boolean isPalindrome2(String s) {
        if(s == null || s.isEmpty()) {
            return true;
        }
        
        s = s.toUpperCase();
        
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            char left = s.charAt(start);
            char right = s.charAt(end);
            if (!Character.isLetterOrDigit(left)) {
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(right)) {
                end--;
                continue;
            }
            if (left != right) {
                return false;
            } else {
                start++;
                end--;
            }
        }

        return true;
    }
}
