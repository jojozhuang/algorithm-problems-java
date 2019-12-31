package johnny.leetcode.algorithm;

/**
 *674. Longest Continuous Increasing Subsequence
 *Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).

Example 1:
Input: [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3. 
Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4. 
Example 2:
Input: [2,2,2,2,2]
Output: 1
Explanation: The longest continuous increasing subsequence is [2], its length is 1. 
Note: Length of the array will not exceed 10,000.
 * @author Johnny
 */
public class Solution674 {
    // optimized dp
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int count = 1;
        int ans = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                count++;
                ans = Math.max(ans, count);
            } else {
                count = 1;
            }
        }
        
        return ans;
    }
    // dp
    public int findLengthOfLCIS2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                dp[i] = dp[i-1] + 1;
            } else {
                dp[i] = 1;
            }
        }
        int ans = 0;
        for (int i = 0; i < dp.length; i++) {
            ans = Math.max(ans, dp[i]);
        }
        
        return ans;
    }
    // two points
    public int findLengthOfLCIS3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int left = 0;
        int right = 1;
        int ans = 0;
        while (right < nums.length) {
            if (nums[right] <= nums[right - 1]) {
                ans = Math.max(ans, right - left);
                left = right;
            }
            right++;
        }
        
        ans = Math.max(ans, right - left);
        
        return ans;
    }
}
