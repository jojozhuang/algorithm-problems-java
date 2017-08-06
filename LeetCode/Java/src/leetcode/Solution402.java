/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Stack;

/**
 * Remove K Digits
 * 
 * Given a non-negative integer num represented as a string, remove k digits from
 * the number so that the new number is the smallest possible.
 * 
 * Note:
 * The length of num is less than 10002 and will be ≥ k.
 * The given num does not contain any leading zero.
 * 
 * Example 1:
 * Input: num = "1432219", k = 3
 * Output: "1219"
 * Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 
 * which is the smallest.
 * 
 * Example 2:
 * Input: num = "10200", k = 1
 * Output: "200"
 * Explanation: Remove the leading 1 and the number is 200. Note that the output
 * must not contain leading zeroes.
 * 
 * Example 3:
 * Input: num = "10", k = 2
 * Output: "0"
 * Explanation: Remove all the digits from the number and it is left with 
 * nothing  which is 0.
 * 
 * @author Johnny
 */
public class Solution402 {
    public String removeKdigits(String num, int k) {
        if (num == null || num.isEmpty() || k < 0 || k >= num.length()) {
            return "0";
        }
        
        Stack<Character> stack = new Stack<>();
        stack.push(num.charAt(0));
        int i = 1; 
        while (i < num.length() && k > 0) {
            char ch = num.charAt(i);
            if (stack.peek() <= ch) {
                stack.push(ch);
                i++;
            } else {
                while (!stack.isEmpty() && stack.peek() > ch && k > 0) {
                    stack.pop();
                    k--;                    
                }
                stack.push(ch);
                i++;
                if (k == 0) {
                    break;
                }
            }
        }
        
        String res = "";
        StringBuilder sb = new StringBuilder();
        if (k == 0) {
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            res = sb.reverse().toString();
            if (i < num.length()) {
                res += num.substring(i);
            }
        } else {
            while (!stack.isEmpty() && k > 0) {
                stack.pop();
                k--;
            }
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            res = sb.reverse().toString();
        }
        
        if (res.startsWith("0")) {
            int j = 0;
            while (j < res.length()) {
                if (res.charAt(j) == '0') {
                    j++;
                } else {
                    break;
                }
            }
            res = res.substring(j);
        }

        if (res.isEmpty()) {
            res = "0";
        }
        
        return res;
    } 
}
