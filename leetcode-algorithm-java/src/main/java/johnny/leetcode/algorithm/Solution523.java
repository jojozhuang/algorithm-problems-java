package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Continuous Subarray Sum
 * <p>
 * Given a list of non-negative numbers and a target integer k, write a function
 * to check if the array has a continuous subarray of size at least 2 that sums
 * up to the multiple of k, that is, sums up to n*k where n is also an integer.
 * <p>
 * Example 1:
 * Input: [23, 2, 4, 6, 7],  k=6
 * Output: True
 * Explanation: Because [2, 4] is a continuous subarray of size 2 and sums up to 6.
 * <p>
 * Example 2:
 * Input: [23, 2, 6, 4, 7],  k=6
 * Output: True
 * Explanation: Because [23, 2, 6, 4, 7] is an continuous subarray of size 5 and sums up to 42.
 * <p>
 * Note:
 * 1. The length of the array won't exceed 10,000.
 * 2. You may assume the sum of all the numbers is in the range of a signed 32-bit integer.
 *
 * @author Johnny
 */
public class Solution523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // continuous zero
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0) {
                sum %= k;
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            } else {
                Integer index = map.get(sum);
                if (i - index > 1) {
                    return true;
                }
            }
        }
        return false;
    }

    // Prefix sum, O(n^2)
    public boolean checkSubarraySum2(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return false;
        }

        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0 && nums[i - 1] == 0) {
                return true;
            }
            sum[i] = sum[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (k != 0 && (sum[j] % k == 0 || (sum[j] - sum[i]) % k == 0 && sum[j] - sum[i] != 0 && sum[j] - sum[i] != nums[j])) {
                    return true;
                }
            }
        }

        return false;
    }

    // Brute force, O(n^3)
    public boolean checkSubarraySum3(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return false;
        }

        for (int start = 0; start < nums.length - 1; start++) {
            if (k == 0 && nums[start] == 0 && nums[start + 1] == 0) {
                return true;
            }
            for (int end = start + 1; end < nums.length; end++) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum += nums[i];
                }
                if (k != 0 && (sum == k || sum % k == 0)) {
                    return true;
                }
            }
        }

        return false;
    }
}
