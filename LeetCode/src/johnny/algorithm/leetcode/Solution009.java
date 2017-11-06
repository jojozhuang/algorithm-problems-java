/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

/**
 * Palindrome Number.
 * Determine whether an integer is a palindrome. Do this without extra space.
 * 
 * @author Johnny
 */
public class Solution009 {
    // generate the reverse value of x
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reverse = 0;
        int num = x;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        
        return reverse == x;
    }
    public boolean isPalindrome2(int x) {
        if (x < 0) {
            return false;
        }

        // initialize how many zeros
        int div = 1;
        while (x / div >= 10) {
            div *= 10;
        }

        while (x != 0) {
            int left = x / div;
            int right = x % 10;

            if (left != right) {
                return false;
            }

            x = (x % div) / 10;
            div /= 100;
        }

        return true;
    }
}
