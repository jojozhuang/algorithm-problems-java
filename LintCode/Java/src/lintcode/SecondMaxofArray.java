/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

import java.util.Arrays;

/**
 * Second Max of Array
 * 
 * Find the second max number in a given array.
 * 
 * Example
 * 
 * Given [1, 3, 2, 4], return 3.
 * 
 * Given [1, 2], return 1.
 * 
 * @author Johnny
 */
public class SecondMaxofArray {
    public int secondMax(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MIN_VALUE;
        }
        
        if (nums.length == 1) {
            return nums[0];
        }
        
        Arrays.sort(nums);
        
        return nums[nums.length - 2];
    }
}
