/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Single Number III.
 * Given an array of numbers nums, in which exactly two elements appear only once 
 * and all the other elements appear exactly twice. Find the two elements that appear only once.
 * 
 * For example:
 * 
 * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 * 
 * Note:
 * The order of the result is not important. So in the above example, [5, 3] is also correct.
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 * 
 * @author Johnny
 */
public class Solution260 {
    public int[] singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        
        int last1Bit = xor & (-xor); // last bit which is equals to '1'
        int first = 0;
        int second = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if ((last1Bit & nums[i]) == 0) {
                first = first ^ nums[i];
            } else {
                second = second ^ nums[i];
            }
        }
        
        int[] res = new int[2];
        res[0] = first;
        res[1] = second;
        
        return res;
    }
}
