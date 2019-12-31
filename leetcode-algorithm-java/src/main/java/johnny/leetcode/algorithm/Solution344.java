package johnny.leetcode.algorithm;

/**
 * Reverse String.
 * Write a function that takes a string as input and returns the string reversed.
 * Example:
 * Given s = "hello", return "olleh".
 * 
 * @author Johnny
 */
public class Solution344 {
    public String reverseString(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            char c = chars[start];
            chars[start] = chars[end];
            chars[end] = c;
            start++;
            end--;
        }
        
        return new String(chars);
    }
}
