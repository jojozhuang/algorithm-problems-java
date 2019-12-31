package johnny.leetcode.algorithm;

/**
 * Maximum Subarray.
 * Find the contiguous subarray within an array (containing at least one number)
 * which has the largest sum.
 * 
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 * the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 * 
 * Click to show more practice.
 * 
 * More practice:
 * 
 * If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 * 
 * @author Johnny
 */
public class Solution053 {
    // time: O(n), space O(1) 
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int sum = nums[0];
        int max = nums[0];
        
        for (int i = 1; i < n; i++) {
            sum = Math.max(nums[i], nums[i] + sum);
            max = Math.max(max, sum);
        }
        
        return max;
    }
    // dp, time: O(n), space: O(n), one loop
    public int maxSubArray2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int ans = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            ans = Math.max(ans, dp[i]);
        }

        return ans;
    }
    // dp, time: O(n), space: O(n), two loops
    public int maxSubArray3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            if (dp[i - 1] < 0) {
                dp[i] = nums[i];
            } else {
                dp[i] = dp[i - 1] + nums[i];
            }
            // same as
            // dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
        }
        
        // scan to find the maximum
        int ans = nums[0];
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, dp[i]);
        }

        return ans;
    }
}
