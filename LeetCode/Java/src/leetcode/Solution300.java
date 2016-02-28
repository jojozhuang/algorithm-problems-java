/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;

/**
 * Longest Increasing Subsequence.
 * Given an unsorted array of integers, find the length of longest increasing subsequence.
 * 
 * For example,
 * Given [10, 9, 2, 5, 3, 7, 101, 18],
 * The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. 
 * Note that there may be more than one LIS combination, it is only necessary for you to return the length.
 * 
 * Your algorithm should run in O(n2) complexity.
 * 
 * Follow up: Could you improve it to O(n log n) time complexity?
 * 
 * @author Johnny
 */
public class Solution300 {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int[] f = new int[nums.length];
        Arrays.fill(f, 1);
        
        for(int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && f[i] < f[j] + 1) {
                    f[i] = f[j] + 1;
                }
            }
        }
        
        int max = 0;
        for (int i = 0; i < f.length; i++) {
            if (f[i] > max) {
                max = f[i];
            }
        }
        
        return max;
    }
}
