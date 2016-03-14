/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Maximum Product Subarray.
 * Find the contiguous subarray within an array (containing at least one number)
 * which has the largest product.
 * 
 * For example, given the array [2,3,-2,4],
 * the contiguous subarray [2,3] has the largest product = 6.
 * 
 * @author Johnny
 */
public class Solution152 {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int max = nums[0];  
        int min = nums[0];  
        int global = nums[0];  

        for(int i = 1; i < nums.length; i++) {
            int temp = max;  
            max = Math.max(Math.max(nums[i] * temp, nums[i]), nums[i] * min);
            min = Math.min(Math.min(nums[i] * temp, nums[i]), nums[i] * min);
            global = Math.max(global, max);  
        }  
        return global;
    }
}
