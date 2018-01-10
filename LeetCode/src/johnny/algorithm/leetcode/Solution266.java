package johnny.algorithm.leetcode;

import java.util.HashMap;

/**
 * Palindrome Permutation.
 * 
 * Given a string, determine if a permutation of the string could form a palindrome.
 * 
 * For example,
 * "code" -> False, "aab" -> True, "carerac" -> True.
 * 
 * Hint:
 * 
 * Consider the palindromes of odd vs even length. What difference do you notice?
 * Count the frequency of each character.
 * If each character occurs even number of times, then it must be a palindrome. 
 * How about character which occurs odd number of times?
 *  
 * @author Johnny
 */
public class Solution266 {
    public boolean canPermutePalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        
        HashMap<Character, Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }
        
        boolean odd = false;
        for(Integer val: map.values()) {
            if (val % 2 == 1) {
                if (odd == true) {
                    return false;
                } else {
                    odd = true;
                }
            }
        }
        
        return true;
    }
    public boolean canPermutePalindrome2(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        
        char[] arr = new char[256];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }
        
        boolean odd = false;
        for (int i = 0; i < arr.length; i++) {            
            if (arr[i] % 2 != 0) {
                if (odd == true) {
                    return false;
                } else {
                    odd = true;
                }
            }
        }
        
        return true;
    }
}
