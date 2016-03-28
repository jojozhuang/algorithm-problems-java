/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Reverse Words in a String.
 * Given an input string, reverse the string word by word.
 * 
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 * 
 * Update (2015-02-12):
 * For C programmers: Try to solve it in-place in O(1) space.
 * 
 * Clarification:
 *  1. What constitutes a word?
 *     A sequence of non-space characters constitutes a word.
 *  2. Could the input string contain leading or trailing spaces?
 *     Yes. However, your reversed string should not contain leading or trailing spaces.
 *  3. How about multiple spaces between two words?
 *     Reduce them to a single space in the reversed string.
 * 
 * @author Johnny
 */
public class Solution151 {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        int end = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[i] == ' ') {
                if (end > -1) {
                    sb.append(getWord(arr, i + 1, end));
                    sb.append(' ');
                    end = -1;
                }
            } else {
                if (end == -1) {
                    end = i;
                }
            }
        }
        
        if (end > -1) {
            sb.append(getWord(arr, 0, end));
            sb.append(' ');
        }
        
        return sb.toString().trim();
    }
    
    private char[] getWord(char[] arr, int start, int end) {
        char[] word = new char[end - start + 1];
        for (int i = 0; i <= end - start; i++) {
            word[i] = arr[start + i];
        }
        
        return word;
    }
}
