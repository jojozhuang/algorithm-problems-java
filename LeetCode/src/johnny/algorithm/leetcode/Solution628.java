/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.Arrays;

/**
 * Maximum Product of Three Numbers
 * 
 * Given an integer array, find three numbers whose product is maximum and 
 * output the maximum product.
 * 
 * Example 1:
 * Input: [1,2,3]
 * Output: 6
 * 
 * Example 2:
 * Input: [1,2,3,4]
 * Output: 24
 * 
 * Note:
 * 1. The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
 * 2. Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
 * 
 * @author Johnny
 */
public class Solution628 {
    public int maximumProduct(int[] nums) {
        if (nums == null || nums.length < 3) {
            return Integer.MIN_VALUE;
        }
        
        Arrays.sort(nums);
        
        int n = nums.length;
        
        int max = nums[n - 1] * nums[n - 2] * nums[n - 3];
        max = Math.max(max, nums[0] * nums[1] * nums[n - 1]);
        
        return max;
    }
}
