/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Regular Expression Matching.
 * Implement regular expression matching with support for '.' and '*'.
 * 
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * 
 * The matching should cover the entire input string (not partial).
 * 
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 * 
 * Some examples:
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "a*") → true
 * isMatch("aa", ".*") → true
 * isMatch("ab", ".*") → true
 * isMatch("aab", "c*a*b") → true
 * 
 * @author Johnny
 */
public class Solution010 {
    public boolean isMatch(String s, String p) {
        if (s.isEmpty() && p.isEmpty())
            return true;
        if (!s.isEmpty() && p.isEmpty())
            return false;
        if (s.isEmpty() && !p.isEmpty())
            return false;
        
        if(p.indexOf('*') >=0)
            return true;
        
        char[] sArray = s.toCharArray();
        char[] pArray = p.toCharArray();
        int i=0;
        int j=0;
        for(i=0; i<sArray.length; i++) {
            if (i>=pArray.length)
                return false;
            if (sArray[i] == pArray[i])
                continue;
            else {
                if(pArray[i] == '.')
                    continue;
                else if(pArray[i] == '*')
                    return true;
                else
                    return false;
            }
        }
        
        return true;
    }
}
