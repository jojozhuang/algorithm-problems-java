/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.Arrays;

/**
 * Valid Triangle Number
 * 
 * Given an array consists of non-negative integers, your task is to count the 
 * number of triplets chosen from the array that can make triangles if we take 
 * them as side lengths of a triangle.
 * 
 * Example 1:
 * Input: [2,2,3,4]
 * Output: 3
 * 
 * Explanation:
 * Valid combinations are: 
 * 2,3,4 (using the first 2)
 * 2,3,4 (using the second 2)
 * 2,2,3
 * 
 * Note:
 * 1. The length of the given array won't exceed 1000.
 * 2. The integers in the given array are in the range of [0, 1000].
 * 
 * @author Johnny
 */
public class Solution611 {
    public int triangleNumber(int[] nums) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        
        Arrays.sort(nums);
        
        int count = 0;
        
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[k] >= nums[i] + nums[j]) {
                        break;
                    }
                    
                    if ((nums[i] + nums[k] > nums[j]) && (nums[j] + nums[k] > nums[i])) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}
