/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

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
