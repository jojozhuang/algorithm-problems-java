package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * First Unique Character in a String
 * 
 * Given a string, find the first non-repeating character in it and return it's
 * index. If it doesn't exist, return -1.
 * 
 * Examples:
 * s = "leetcode"
 * return 0.
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 *
 * @author Johnny
 */
public class Solution387 {
    public int firstUniqChar(String s) {
        if (s == null || s.isEmpty()) {
            return -1;
        }
        
        // Apperence times for each letter
        int[] countArray = new int[26];
        // The position for the first apperence
        int[] indexArray = new int[26];
        for (int i = 0; i < indexArray.length; i++) {
            indexArray[i] = -1;
        }
        
        for (int i = 0; i < s.length(); i++) {
            countArray[s.charAt(i) - 'a']++;
            if (indexArray[s.charAt(i) - 'a'] == -1) {
                indexArray[s.charAt(i) - 'a'] = i;
            }
        }
        
        Arrays.sort(indexArray);
        
        for (int i = 0; i < indexArray.length; i++) {
            if (indexArray[i] != -1 && 
                    countArray[s.charAt(indexArray[i]) - 'a'] == 1) {
                return indexArray[i];
            }
        }
        return -1;
    }
    
    //http://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/
    //1) Scan the string from left to right and construct the count array.
    //2) Again, scan the string from left to right and check for count of each character, if you find an element who's count is 1, return it.
    public int firstUniqChar2(String s) {
        if (s == null || s.isEmpty()) {
            return -1;
        }
        
        // Apperence times for each letter
        int[] countArray = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            countArray[s.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (countArray[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1;
    }
}
