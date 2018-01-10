package johnny.algorithm.leetcode;

/**
 * Single Number.
 * Given an array of integers, every element appears twice except for one. 
 * Find that single one.
 * 
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement 
 * it without using extra memory?
 * 
 * @author Johnny
 */
public class Solution136 {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }
}
