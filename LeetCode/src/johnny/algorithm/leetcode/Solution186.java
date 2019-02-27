package johnny.algorithm.leetcode;

/**
 * Reverse Words in a String II.
 * Given an input string, reverse the string word by word. A word is defined as 
 * a sequence of non-space characters.
 * 
 * The input string does not contain leading or trailing spaces and the words 
 * are always separated by a single space.
 * 
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 * 
 * Could you do it in-place without allocating extra space?
 * 
 * @author Johnny
 */
public class Solution186 {
    public void reverseWords(char[] str) {
        if (str == null || str.length == 0) {
            return;
        }
        
        reverse(str, 0, str.length - 1);
        
        int i = 0;
        int start = 0;
        while (i < str.length) {
            if (str[i] == ' ') {
                reverse(str, start, i - 1);
                start = i + 1;
            }
            i++;
        }
        reverse(str, start, str.length - 1);
    }
    
    private void reverse(char[] arr, int start, int end) {
        if (start > end) {
            return;
        }
        
        while (start < end) {
            char c = arr[start];
            arr[start] = arr[end];
            arr[end] = c;
            start++;
            end--;
        }
    }
}
