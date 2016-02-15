/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;

/**
 * Valid Anagram.
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * 
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * 
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * 
 * @author Johnny
 */
public class Solution242 {
    public boolean isAnagram1(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        
        if (s.length() == 0 && t.length() == 0 ) {
            return true;
        }
        
        char[] arrS = s.toCharArray();
        Arrays.sort(arrS);
        String sortedS = new String(arrS);
        
        char[] arrT= t.toCharArray();
        Arrays.sort(arrT);
        String sortedT = new String(arrT);
        
        if (sortedS.equals(sortedT)){
            return true;
        }
   
        return false;
    }
}
