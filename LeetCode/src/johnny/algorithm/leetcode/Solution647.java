package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Palindromic Substrings
 * 
 * Given a string, your task is to count how many palindromic substrings in this
 * string.
 * 
 * The substrings with different start indexes or end indexes are counted as 
 * different substrings even they consist of same characters.
 * 
 * Example 1:
 * Input: "abc"
 * Output: 3
 * 
 * Explanation: Three palindromic strings: "a", "b", "c".
 * 
 * Example 2:
 * Input: "aaa"
 * Output: 6
 * 
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 * 
 * Note:
 * The input string length won't exceed 1000.
 * 
 * @author Johnny
 */
public class Solution647 {
    public int countSubstrings(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        
        int res = 0;
        List<String> words = getWords(s);
        for (String word : words) {
            if (!word.isEmpty()) {
                if (isPalindrome(word)) {
                    res++;
                }
            }
        }
        
        return res;
    }
    
    private List<String> getWords(String s) {
        List<String> res = new ArrayList<String>();
        
        for (int i = 0; i < s.length(); i++) {
            res.add(String.valueOf(s.charAt(i)));
            for (int j = i + 1; j < s.length(); j++) {
                res.add(s.substring(i, j + 1));
            }
        }
        return res;
    }
    
    private boolean isPalindrome(String s) {
        if(s == null || s.isEmpty()) {
            return true;
        }
        
        s = s.toUpperCase();
        
        int start = 0;
        int end = s.length() - 1;
        while(start <= end) {
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
