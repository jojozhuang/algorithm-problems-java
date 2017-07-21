/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Minimum Size Subarray Sum.
 * 
 * Given an array of n positive integers and a positive integer s, find the 
 * minimal length of a subarray of which the sum ≥ s. If there isn't one, return 0 instead.
 * 
 * For example, given the array [2,3,1,2,4,3] and s = 7,
 * the subarray [4,3] has the minimal length under the problem constraint.
 * 
 * click to show more practice.
 * 
 * More practice:
 * If you have figured out the O(n) solution, try coding another solution of 
 * which the time complexity is O(n log n).
 * 
 * @author Johnny
 */
public class Solution209 {
    //http://www.cnblogs.com/grandyang/p/4501934.html
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int len = nums.length;
        int left = 0, right = 0;
        
        int sum = 0;
        int min = len + 1;
        while (right < len) {
            while (sum < s && right < len) {
                sum += nums[right];
                right++;
            }
            while (sum >= s && left < len){                
                min = Math.min(min, right - left);                
                sum -= nums[left];
                left++;
            }
        }
       
        return len + 1 == min ? 0: min;
    }
}
