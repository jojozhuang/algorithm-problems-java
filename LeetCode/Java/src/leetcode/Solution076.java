/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Minimum Window Substring.
 * Given a string S and a string T, find the minimum window in S which will 
 * contain all the characters in T in complexity O(n).
 * 
 * For example,
 * S = "ADOBECODEBANC"
 * T = "ABC"
 * Minimum window is "BANC".
 * 
 * Note:
 * If there is no such window in S that covers all characters in T, return the 
 * emtpy string "".
 * 
 * If there are multiple such windows, you are guaranteed that there will 
 * always be only one unique minimum window in S.
 * 
 * @author Johnny
 */
public class Solution076 {
    public String minWindow(String S, String T) {
        if (S==null||S.isEmpty())
            return S;
        
        return "";
    }
}
