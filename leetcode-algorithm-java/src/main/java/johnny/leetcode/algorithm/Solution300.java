package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * Longest Increasing Subsequence.
 * Given an unsorted array of integers, find the length of longest increasing subsequence.
 * <p>
 * For example,
 * Given [10, 9, 2, 5, 3, 7, 101, 18],
 * The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4.
 * Note that there may be more than one LIS combination, it is only necessary for you to return the length.
 * <p>
 * Your algorithm should run in O(n2) complexity.
 * <p>
 * Follow up: Could you improve it to O(n log n) time complexity?
 *
 * @author Johnny
 */
public class Solution300 {
    //https://www.youtube.com/watch?v=CE2b_-XfVDk
    //https://www.youtube.com/watch?v=S9oUiVYEq7E    
    // DP, O(n^2)
    public int lengthOfLIS2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    // Recursive, O(n^2)
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = Math.max(ans, helper(nums, i, dp));
        }
        return ans;
    }

    private int helper(int[] nums, int pos, int[] dp) {
        if (pos == 0) {
            return 1;
        }

        if (dp[pos] > 0) { // cache
            return dp[pos];
        }

        int ans = 1;
        for (int i = 0; i < pos; i++) {
            if (nums[pos] > nums[i]) {
                ans = Math.max(ans, helper(nums, i, dp) + 1);
            }
        }
        dp[pos] = ans;
        return dp[pos];
    }
}
