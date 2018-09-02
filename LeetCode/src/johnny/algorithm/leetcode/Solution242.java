package johnny.algorithm.leetcode;

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
    // sort and compare
    public boolean isAnagram2(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
    
    public boolean isAnagram3(String s, String t) {
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
    
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        
        if (s.length() == 0 && t.length() == 0 ) {
            return true;
        }
        
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }
        
        for (int i = 0; i < count.length; i++) {
            if(count[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
}
