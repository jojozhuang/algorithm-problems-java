/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Stack;

/**
 * Remove Duplicate Letters.
 * 
 * Given a string which contains only lowercase letters, remove duplicate 
 * letters so that every letter appear once and only once. You must make sure 
 * your result is the smallest in lexicographical order among all possible results.
 * 
 * Example:
 * Given "bcabc"
 * Return "abc"
 * 
 * Given "cbacdcbc"
 * Return "acdb"
 *  
 * @author Johnny
 */
public class Solution316 {
    public String removeDuplicateLetters(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
        }
        
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if(stack.contains(c)) {
                counter[c - 'a']--;
            } else {
                char top = stack.peek();
                while (top > c && counter[top - 'a'] > 1) {
                    stack.pop();
                    counter[top - 'a']--;
                    if (stack.isEmpty()) {
                        break;
                    } else {
                        top = stack.peek();
                    }
                }
                stack.push(c);
            }
        }
        Character[] arr = new Character[stack.size()];
        stack.toArray(arr);
        StringBuilder sb = new StringBuilder();
        for (Character c: arr) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}
