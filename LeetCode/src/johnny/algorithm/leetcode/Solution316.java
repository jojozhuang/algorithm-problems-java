package johnny.algorithm.leetcode;

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
    // stack
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
        counter[s.charAt(0) - 'a']--;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if(stack.contains(c)) {
                counter[c - 'a']--;
            } else {
                char top = stack.peek();
                while (top > c && counter[top - 'a'] > 0) {
                    stack.pop();
                    //counter[top - 'a']--;
                    if (stack.isEmpty()) {
                        break;
                    } else {
                        top = stack.peek();
                    }
                }
                stack.push(c);
                counter[c - 'a']--;
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        
        return sb.toString();
    }
}
