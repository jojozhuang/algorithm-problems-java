/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

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
        if(strs == null || strs.length == 0) {
            return "";
        }

        int minLen = Integer.MAX_VALUE;
        for(String str: strs){
            if(minLen > str.length()) {
                minLen = str.length();
            }
        }
        
        if (minLen == 0) {
            return "";
        }

        for(int j = 0; j < minLen; j++){
            char prev = strs[0].charAt(j);
            for(int i = 0; i < strs.length; i++){
                if(strs[i].charAt(j) != prev){
                    return strs[i].substring(0, j);
                }
            }
        }

        return strs[0].substring(0, minLen);
    }
}
