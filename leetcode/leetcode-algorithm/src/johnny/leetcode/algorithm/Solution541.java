package johnny.leetcode.algorithm;

/**
 * Reverse String II
 * 
 * Given a string and an integer k, you need to reverse the first k characters 
 * for every 2k characters counting from the start of the string. If there are
 * less than k characters left, reverse all of them. If there are less than 2k 
 * but greater than or equal to k characters, then reverse the first k 
 * characters and left the other as original.
 * 
 * Example:
 * Input: s = "abcdefg", k = 2
 * Output: "bacdfeg"
 * 
 * Restrictions:
 * 1. The string consists of lower English letters only.
 * 2. Length of the given string and k will in the range [1, 10000]
 * 
 * @author Johnny
 */
public class Solution541 {
    public String reverseStr(String s, int k) {
        if (k <= 0) {
            return s;
        }
        
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i+=2*k) {
            reverse(arr, i, i+k-1);
        }
        
        return new String(arr);
    }
    
    private void reverse(char[] arr, int start, int end) {
        end = Math.min(arr.length - 1, end);
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
