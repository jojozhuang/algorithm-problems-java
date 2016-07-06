/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;

/**
 * Wiggle Sort.
 * 
 * Given an unsorted array nums, reorder it in-place such that 
 * nums[0] <= nums[1] >= nums[2] <= nums[3]....
 * 
 * For example, given nums = [3, 5, 2, 1, 6, 4], one possible answer 
 * is [1, 6, 2, 5, 3, 4].
 * 
 * @author Johnny
 */
public class Solution280 {
    //http://www.cnblogs.com/jcliBlogger/p/4797531.html
    public void wiggleSort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (((i % 2 == 1) && nums[i] < nums[i - 1]) || 
                ((i % 2 == 0) && nums[i] > nums[i - 1])) {
                int temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
            }
        }
    }
    public void wiggleSort2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        
        Arrays.sort(nums);
        
        for(int i = 2; i < nums.length; i = i + 2) {
            int temp = nums[i];
            nums[i] = nums[i - 1];
            nums[i - 1] = temp;
        }
    }
}
