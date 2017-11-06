/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.List;

/**
 * Ugly Number II.
 * Write a program to find the n-th ugly number.
 * 
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 
 * For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
 * 
 * Note that 1 is typically treated as an ugly number.
 * 
 * @author Johnny
 */
public class Solution264 {
    //http://www.cnblogs.com/grandyang/p/4743837.html
    public int nthUglyNumber(int n) {
        if (n <= 0) {
            return 0;
        }
        
        int[] arr = new int[n];
        arr[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        int i = 1;
        while(i < n) {
            int ugly2 = arr[i2] * 2;
            int ugly3 = arr[i3] * 3;
            int ugly5 = arr[i5] * 5;
            arr[i] = Math.min(Math.min(ugly2, ugly3), ugly5);
            if (arr[i] == ugly2) {
                i2++;
            }
            if (arr[i] == ugly3) {
                i3++;
            }
            if (arr[i] == ugly5) {
                i5++;
            }
            i++;
        }
        
        return arr[n - 1];
    }
    
    public int nthUglyNumber2(int n) {
        int kth = 0;
        int i = 0;
        while(kth < n) {
            i++;
            if (isUgly(i)) {
                kth++;
            }            
        }
        return i;
    }
    
    private boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        
        return num == 1;
    }
}
