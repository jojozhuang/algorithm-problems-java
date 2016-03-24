/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Palindrome Number 
 * Determine whether an integer is a palindrome. Do this without extra space.
 * @author Johnny
 */
public class Solution009 {
    public boolean isPalindrome(int x) {
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
