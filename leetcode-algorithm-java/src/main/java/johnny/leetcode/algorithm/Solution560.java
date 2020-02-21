package johnny.leetcode.algorithm;

/**
 * Subarray Sum Equals K
 * <p>
 * Given an array of integers and an integer k, you need to find the total
 * number of continuous subarrays whose sum equals to k.
 * <p>
 * Example 1:
 * Input:nums = [1,1,1], k = 2
 * <p>
 * Output: 2
 * <p>
 * Note:
 * The length of the array is in range [1, 20,000].
 * The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 *
 * @author Johnny
 */
public class Solution560 {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] sum = new int[n];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (sum[i] == k) {
                ans++;
            }
            for (int j = i + 1; j < n; j++) {
                if (sum[j] - sum[i] == k) {
                    ans++;
                }
            }
        }

        return ans;
    }

    public int subarraySum2(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            if (sum == k) {
                res++;
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    res++;
                }
            }
        }

        return res;
    }
}
