/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

/**
 * One Edit Distance.
 * 
 * Given two strings S and T, determine if they are both one edit distance apart.
 * 
 * @author Johnny
 */
public class Solution161 {
    public boolean isOneEditDistance(String s, String t) {
        if (s == null || t == null) {
            return true;
        }
        
        int m = s.length();
        int n = t.length();
        
        if (Math.abs(m - n) > 1) {
            return false;
        }
        
        int i = 0;
        int j = 0;
        int diff = 0;
        
        while (i < m && j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                diff++;
                if (diff > 1) {
                    return false;
                }
                
                if (m == n) {
                    i++;
                    j++;
                } else if (m < n){
                    j++;
                } else {
                    i++;                
                }
            }
        }
        
        return true;
    }
}
