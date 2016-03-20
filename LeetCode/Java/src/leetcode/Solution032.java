/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Stack;

/**
 * Longest Valid Parentheses.
 * Given a string containing just the characters '(' and ')', find the length 
 * of the longest valid (well-formed) parentheses substring.
 * 
 * For "(()", the longest valid parentheses substring is "()", which has 
 * length = 2.
 * 
 * Another example is ")()())", where the longest valid parentheses substring 
 * is "()()", which has length = 4.
 * 
 * @author Johnny
 */
public class Solution032 {
    //http://www.geeksforgeeks.org/length-of-the-longest-valid-substring/
     public int longestValidParentheses(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        
        // Create stack to store the position of character
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(-1);
        
        int i = 0;
        int max = 0;
        while(i < s.length()) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if(!stack.isEmpty()) {
                    max = Math.max(max, i - stack.peek());
                } else {
                    stack.push(i);
                }
            } 
            i++;
        }
        
        return max;
     } 
}
