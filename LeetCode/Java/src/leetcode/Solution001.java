/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;

/**
 * Two Sum.
 * 
 * Given an array of integers, return indices of the two numbers such that they 
 * add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution.
 * 
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *  
 * @author Johnny
 */
public class Solution001 {  
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if (nums == null || nums.length < 2) {
            return res;
        }
        
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]))
            {
                res[0] = map.get(nums[i]);
                res[1] = i;
                return res;
            }
            else
            {
                map.put(target - nums[i], i);
            }
        }
        return res;
    }
}
