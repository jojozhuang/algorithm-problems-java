/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;

/**
 * Shortest Unsorted Continuous Subarray
 * 
 * Given an integer array, you need to find one continuous subarray that if you
 * only sort this subarray in ascending order, then the whole array will be 
 * sorted in ascending order, too.
 * 
 * You need to find the shortest such subarray and output its length.
 * 
 * Example 1:
 * Input: [2, 6, 4, 8, 10, 9, 15]
 * Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 * 
 * Note:
 * 1. Then length of the input array is in range [1, 10,000].
 * 2. The input array may contain duplicates, so ascending order here means <=.
 * 
 * @author Johnny
 */
public class Solution581 {
    public int findUnsortedSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int[] clone = nums.clone();
        Arrays.sort(clone);
        
        int start = 0;
        int end = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == clone[i]) {
                start++;                
            } else {
                break;
            }
        }
        for (int i = nums.length - 1; i > start; i--) {
            if (nums[i] == clone[i]) {
                end--;
            } else{
                break;
            }
        }
        
        return end - start + 1;
    }
}
