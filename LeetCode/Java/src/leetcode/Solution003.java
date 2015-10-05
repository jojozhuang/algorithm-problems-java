/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Longest Substring Without Repeating Characters.
 * Given a string, find the length of the longest substring without repeating 
 * characters. For example, the longest substring without repeating letters for 
 * "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring
 * is "b", with the length of 1.
 * 
 * @author Johnny
 */
public class Solution003 {
    public int lengthOfLongestSubstring1(String s) {
        int currentlength=0, maxlength =0;
        int i=0, j=0;

        char[] chars = s.toCharArray();
        ArrayList<Character> currentCharList = new ArrayList<Character>();
        
        if (s.length()==0)
            return 0;
        
        if (s.length()==1)
            return 1;

        for(i = 0; i<chars.length; i++)
        {
            currentCharList.clear();
            currentCharList.add(chars[i]);
            currentlength = currentCharList.size();
            for(j = i + 1; j<chars.length; j++)
            {               
                if(currentCharList.contains(chars[j]))
                {
                    break;
                }
                else
                {
                     currentCharList.add(chars[j]);
                     currentlength = currentCharList.size();
                }                
            }            
            
            if (currentlength > maxlength)
                maxlength = currentlength;            
                       
        }
        return maxlength;
    }
    
    public int lengthOfLongestSubstring2(String s) {
        
        if (s == null || s.length() == 0){
            return 0;
        }
        int max = 1;
        int start = 0;
        int end = 1;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put(s.charAt(0), 0);
        while (end < s.length()){
            char c = s.charAt(end);
            if (map.containsKey(c) && map.get(c) >= start){
                start = map.get(c) + 1;
            }
            map.put(c, end);
            max = Math.max(max, end - start + 1);
            end++;
        }
        return max;
    }  
}
