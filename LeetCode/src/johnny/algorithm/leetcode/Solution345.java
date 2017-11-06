/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.HashSet;

/**
 * Reverse Vowels of a String.
 * 
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * 
 * Example 1:
 * Given s = "hello", return "holle".
 * 
 * Example 2:
 * Given s = "leetcode", return "leotcede".
 * 
 * @author Johnny
 */
public class Solution345 {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        
        HashSet<Character> set = new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        
        while (start < end) {
            while (start < chars.length && !set.contains(chars[start])) {
                start++;
            }
            while (end > 0 && !set.contains(chars[end])) {
                end--;
            }
            
            if (start >= end) {
                break;
            }
            
            char c = chars[start];
            chars[start] = chars[end];
            chars[end] = c;
            start++;
            end--;
        }
        
        return new String(chars);
    }
}
