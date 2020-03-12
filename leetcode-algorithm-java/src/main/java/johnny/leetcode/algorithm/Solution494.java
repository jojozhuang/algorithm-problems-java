package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Target Sum
 * <p>
 * You are given a list of non-negative integers, a1, a2, ..., an, and a target,
 * S. Now you have 2 symbols + and -. For each integer, you should choose one
 * from + and - as its new symbol.
 * <p>
 * Find out how many ways to assign symbols to make sum of integers equal to
 * target S.
 * <p>
 * Example 1:
 * Input: nums is [1, 1, 1, 1, 1], S is 3.
 * Output: 5
 * Explanation:
 * <p>
 * -1+1+1+1+1 = 3
 * +1-1+1+1+1 = 3
 * +1+1-1+1+1 = 3
 * +1+1+1-1+1 = 3
 * +1+1+1+1-1 = 3
 * <p>
 * There are 5 ways to assign symbols to make the sum of nums be target 3.
 * <p>
 * Note:
 * 1. The length of the given array is positive and will not exceed 20.
 * 2. The sum of elements in the given array will not exceed 1000.
 * 3. Your output answer is guaranteed to be fitted in a 32-bit integer.
 *
 * @author Johnny
 */
public class Solution494 {
    // dfs with memorization
    public int findTargetSumWays(int[] nums, int S) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        return helper(nums, S, 0, 0, new HashMap<>());
    }

    private int helper(int[] nums, int target, int pos, int sum, Map<String, Integer> map){
        String encodeString = pos + "->" + sum;
        if (map.containsKey(encodeString)){
            return map.get(encodeString);
        }
        if (pos == nums.length){
            if (sum == target){
                return 1;
            }else {
                return 0;
            }
        }
        int add = helper(nums, target, pos + 1, sum + nums[pos], map);
        int minus = helper(nums, target, pos + 1, sum - nums[pos], map);
        map.put(encodeString, add + minus);
        return add + minus;
    }

    //dp
    public int findTargetSumWays2(int[] nums, int S) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }

        if (sum < S) {
            return 0;
        }

        int n = nums.length;
        int[][] dp = new int[n + 1][2 * sum + 1];
        int offset = sum;
        dp[0][offset] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = nums[i]; j < 2 * sum + 1 - nums[i]; j++) {
                if (dp[i][j] != 0) {
                    dp[i + 1][j + nums[i]] += dp[i][j];
                    dp[i + 1][j - nums[i]] += dp[i][j];
                }
            }
        }

        return dp[n][offset + S];
    }

    // recursion, O(2^n)
    public int findTargetSumWays3(int[] nums, int S) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] ans = new int[1];
        dfs(nums, S, 0, 0, ans);
        return ans[0];
    }

    private void dfs(int[] nums, int target, int pos, int sum, int[] ans) {
        if (pos == nums.length) {
            if (target == sum) {
                ans[0]++;
            }
            return;
        }

        dfs(nums, target, pos + 1, sum + nums[pos], ans);
        dfs(nums, target, pos + 1, sum - nums[pos], ans);
    }
}
