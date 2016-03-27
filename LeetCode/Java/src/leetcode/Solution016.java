/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 3Sum Closest.
 * Given an array S of n integers, find three integers in S such that the sum 
 * is closest to a given number, target. Return the sum of the three integers. 
 * You may assume that each input would have exactly one solution.
 * 
 *     For example, given array S = {-1 2 1 -4}, and target = 1.
 * 
 *     The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * 
 * @author Johnny
 */
public class Solution016 {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        
        int min = Integer.MAX_VALUE;
        int res = 0;
 
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum == target) {
                    return sum;
                } else if (sum < target) {
                    start++;
                } else {
                    end--;
                }
                
                int diff = Math.abs(sum - target);
                if (diff < min) {
                    min = diff;
                    res = sum;
                }
            }
        }
        
        return res;
    }
}
