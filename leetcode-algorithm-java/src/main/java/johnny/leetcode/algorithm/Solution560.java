package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

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
    // Prefix sum + HashMap, O(n)
    // https://www.cnblogs.com/grandyang/p/6810361.html
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int[] sum = new int[n];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put (0, 1);

        int ans = 0;
        for (int i = 0; i < sum.length; ++i) {
            if (map.containsKey(sum[i] - k)) {
                ans += map.get(sum[i] - k);
            }
            map.put(sum[i], map.getOrDefault(sum[i], 0) + 1);
        }

        return ans;
    }

    // Prefix sum, O(n^2)
    public int subarraySum2(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
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

    // Brute force, O(n^2)
    public int subarraySum3(int[] nums, int k) {
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
