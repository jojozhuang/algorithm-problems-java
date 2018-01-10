package johnny.algorithm.leetcode;

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
        if (s == null || s.isEmpty()) {
            return "";
        }
        if (k < 2) {
            return s;
        }
        
        char[] letters = s.toCharArray();
        
        for (int i = 0; i < letters.length; i += 2*k) {
            reverseHelper(letters, i, Math.min(letters.length - 1,  i + k - 1));
        }
        
        return String.valueOf(letters);
    }
    
    private void reverseHelper(char[] arr, int start, int end) {
        if (start >= arr.length || end > arr.length) {
            return;
        }
        
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
