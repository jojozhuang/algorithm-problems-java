/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

/**
 * Longest Common Prefix.
 * Write a function to find the longest common prefix string amongst an 
 * array of strings.
 * 
 * @author Johnny
 */
public class Solution014 {
    //http://www.programcreek.com/2014/02/leetcode-longest-common-prefix-java/
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
  
        int minlen = Integer.MAX_VALUE;
        String str = "";
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minlen) {
                minlen = strs[i].length();
                str = strs[i];
            }
        }
        
        if (minlen == 0) {
            return "";
        }
        
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != str.charAt(i)) {
                    return str.substring(0, i);
                }
            }
        }
        
        return str;
    }
}
