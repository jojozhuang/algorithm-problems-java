/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Palindrome Pairs.
 * 
 * Given a list of unique words. Find all pairs of distinct indices (i, j) in 
 * the given list, so that the concatenation of the two words, i.e. words[i] + 
 * words[j] is a palindrome.
 * 
 * Example 1:
 * Given words = ["bat", "tab", "cat"]
 * Return [[0, 1], [1, 0]]
 * The palindromes are ["battab", "tabbat"]
 * Example 2:
 * Given words = ["abcd", "dcba", "lls", "s", "sssll"]
 * Return [[0, 1], [1, 0], [3, 2], [2, 4]]
 * The palindromes are ["dcbaabcd", "abcddcba", "slls", "llssssll"]
 *  
 * @author RZHUANG
 */
public class Solution336 {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();

        if (words == null || words.length == 0) {
            return ret;            
        }
        
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                List<List<Integer>> list = isPair(i, j, words[i], words[j]);
                ret.addAll(list);
            }
        }
        
        return ret;        
    }
    
    private List<List<Integer>> isPair(int i, int j, String s1, String s2) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (s1.isEmpty() && s2.isEmpty()) {
            return ret;
        }
        
        if (isPalindrome(s1+s2)) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(i);
            list.add(j);
            ret.add(list);
        }
        
        if (isPalindrome(s2+s1)) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(j);
            list.add(i);
            ret.add(list);
        }
        
        return ret;
    }
    
    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while(left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
