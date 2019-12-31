package johnny.leetcode.algorithm;

/**
 * Target Sum
 * 
 * You are given a list of non-negative integers, a1, a2, ..., an, and a target, 
 * S. Now you have 2 symbols + and -. For each integer, you should choose one 
 * from + and - as its new symbol.
 * 
 * Find out how many ways to assign symbols to make sum of integers equal to 
 * target S.
 * 
 * Example 1:
 * Input: nums is [1, 1, 1, 1, 1], S is 3. 
 * Output: 5
 * Explanation: 
 * 
 * -1+1+1+1+1 = 3
 * +1-1+1+1+1 = 3
 * +1+1-1+1+1 = 3
 * +1+1+1-1+1 = 3
 * +1+1+1+1-1 = 3
 * 
 * There are 5 ways to assign symbols to make the sum of nums be target 3.
 * 
 * Note:
 * 1. The length of the given array is positive and will not exceed 20.
 * 2. The sum of elements in the given array will not exceed 1000.
 * 3. Your output answer is guaranteed to be fitted in a 32-bit integer.
 * 
 * @author Johnny
 */
public class Solution494 {
    //dp
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        
        if (sum < S) {
            return 0;
        }
        
        int n = nums.length;
        int[][] dp = new int[n+1][2*sum+1];
        int offset = sum;
        dp[0][offset] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = nums[i]; j < 2*sum+1 - nums[i]; j++) {
                if (dp[i][j] != 0) {
                    dp[i + 1][j + nums[i]] += dp[i][j];
                    dp[i + 1][j - nums[i]] += dp[i][j];
                }
            }
        }
        
        return dp[n][offset+S];
    } 
    
    // recursion, O(2^n)
    public int findTargetSumWays3(int[] nums, int S) {
        int[] count = new int[1];
        dfs(nums, 0, 0, S, count);
        return count[0];
    }
    
    private void dfs(int[] nums, int i, int sum, int S, int[] count) {
        if (i == nums.length) {
            if (sum == S) {
                count[0]++;
            }
            return;
        }
        
        dfs(nums, i + 1, sum + nums[i], S, count);
        dfs(nums, i + 1, sum - nums[i], S, count);
    }
}
