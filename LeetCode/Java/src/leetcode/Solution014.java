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
    public String longestCommonPrefix(String[] strs) {
        if (strs == null)
            return "";
        if (strs.length == 1)
            return strs[0];
        
        String prefix = "";
        String str1 = "";
        String str2 = "";
        char[] chars1;
        char[] chars2;
        
        for (int i=0; i<strs.length; i++) {
            str1 = strs[i];
            if (prefix.isEmpty())
                str2 = strs[i+1];
            else
                str2 = prefix;
            
            if (str1.isEmpty() || str2.isEmpty())
                return "";
            
            if (str1.equals(str2)) {
                prefix = str1;
                continue;
            }

            prefix = "";
            chars1 = str1.toCharArray();
            chars2 = str2.toCharArray();
            for(int j = 0; j < chars1.length; j++) {
                if (j >= chars2.length)
                    break;
                if (chars1[j] == chars2[j])
                    prefix = prefix + chars1[j];
                else
                    break;                    
            }
            
            if (prefix.isEmpty())
                return "";
        }
        
        return prefix;
    }
}
