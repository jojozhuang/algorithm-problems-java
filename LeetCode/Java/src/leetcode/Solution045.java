/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Jump Game II.
 * Given an array of non-negative integers, you are initially positioned at the 
 * first index of the array.
 * 
 * Each element in the array represents your maximum jump length at that position.
 * 
 * Your goal is to reach the last index in the minimum number of jumps.
 * 
 * For example:
 * Given array A = [2,3,1,1,4]
 * The minimum number of jumps to reach the last index is 2. (Jump 1 step from
 * index 0 to 1, then 3 steps to the last index.)
 * 
 * @author Johnny
 */
public class Solution045 {
    // Greedy
    public int jump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MAX_VALUE;
        }
        
        int farthest = nums[0];
        int steps = 0;
        for (int i = 1; i < nums.length; i++) {
            if (i <= farthest && nums[i] + i > farthest) {
                farthest = nums[i] + i;
                steps++;
            }
            if (farthest >= nums.length - 1) {
                return steps;
            }
        }
        
        if (farthest >= nums.length - 1) {
            return steps;
        }
        else {
            return Integer.MAX_VALUE;
        }
    }
    /*
    public int jump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MAX_VALUE;
        }
        
        int[] minSteps = new int[nums.length];
        minSteps[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            minSteps[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (minSteps[j] != Integer.MAX_VALUE && nums[j] + j >= i) {
                    minSteps[i] = minSteps[j] + 1;
                    break;
                }
            }
        }
        
        return minSteps[minSteps.length - 1];
    }
    */
}
