package johnny.leetcode.algorithm;

/**
 * House Robber II.
 * 
 * Note: This is an extension of House Robber.
 * 
 * After robbing those houses on that street, the thief has found himself a new 
 * place for his thievery so that he will not get too much attention. This time, 
 * all houses at this place are arranged in a circle. That means the first house 
 * is the neighbor of the last one. Meanwhile, the security system for these
 * houses remain the same as for those in the previous street.
 * 
 * Given a list of non-negative integers representing the amount of money of 
 * each house, determine the maximum amount of money you can rob tonight without
 * alerting the police.
 *  
 * @author Johnny
 */
public class Solution213 {
    //http://www.programcreek.com/2014/05/leetcode-house-robber-ii-java/
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }        
        if (len == 2) {
            return Math.max(nums[0], nums[1]);
        }
        
        //include 1st element, and not last element
        int[] dp = new int[len];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 2; i < len; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }
        
        //not include frist element, and include last element
        int[] dr = new int[len];
        dr[0] = 0;
        dr[1] = nums[1];
        for(int i = 2; i < len; i++) {
            dr[i] = Math.max(dr[i - 1], dr[i - 2] + nums[i]);
        }
        
        return Math.max(dp[len - 1], dr[len - 1]);
    }
}
