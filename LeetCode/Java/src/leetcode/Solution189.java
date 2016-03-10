/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;

/**
 * Rotate Array.
 * Rotate an array of n elements to the right by k steps.
 * 
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated 
 * to [5,6,7,1,2,3,4].
 * 
 * Note:
 * Try to come up as many solutions as you can, there are at least 3 different 
 * ways to solve this problem.
 * 
 * @author Johnny
 */
public class Solution189 { 
    public void rotate(int[] nums, int k) { 
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return;
        }
        
        if (k >= nums.length) {
            k = k % nums.length;
        }
        
        if (k <= 0) {
            return;
        }
        
        int[] arr = Arrays.copyOf(nums, nums.length);
        
        int i = 0;
        int j = k;
        while(j > 0) {
            nums[i] = arr[arr.length-j];
            i++;
            j--;
        }
        
        j = 0;
        while(j < nums.length-k) {
            nums[i] = arr[j];
            i++;
            j++;
        }
    }
}
