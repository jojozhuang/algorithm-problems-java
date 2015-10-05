/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Stack;

/**
 * Valid Parentheses.
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
 * 
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid
 * but "(]" and "([)]" are not.
 * 
 * @author Johnny
 */
public class Solution020 {
    public boolean isValid(String s) {
        if (s==null||s.isEmpty())
            return false;
        
        if (s.length() % 2 != 0)
            return false;
        
        char[] chars = s.toCharArray();
        char current;
        Stack stack = new Stack();
        for (int i=0; i<chars.length; i++) {
            current = chars[i];
            if (current == '(' || current == '{' || current == '[')
                stack.push(current);
            else if (current == ')' || current == '}' || current == ']') {
                if (stack.empty())
                    return false;
                char pop = (char)stack.pop();
                if (current== ')' && pop=='(') 
                    continue;
                else if (current== '}' && pop=='{') 
                    continue;
                else if (current== ']' && pop=='[') 
                    continue;
                else
                    return false;
            }
        }
        
        if (stack.empty())
            return true;
        else
            return false;
    }
}
