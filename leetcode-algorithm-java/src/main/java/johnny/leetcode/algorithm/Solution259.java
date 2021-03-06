package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * 3Sum Smaller.
 * Given an array of n integers nums and a target, find the number of
 * index triplets i, j, k with {@code 0 <= i < j < k < n} that satisfy the
 * condition {@code nums[i] + nums[j] + nums[k] < target}.
 * <p>
 * For example, given nums = [-2, 0, 1, 3], and target = 2.
 * <p>
 * Return 2. Because there are two triplets which sums are less than 2:
 *
 * @author Johnny
 */
public class Solution259 {
    public int threeSumSmaller(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int count = 0;
        Arrays.sort(nums);
        int len = nums.length;

        for (int i = 0; i < len - 2; i++) {
            int left = i + 1, right = len - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] < target) {
                    count += right - left; // all the nums between right and left are satisfied
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }

    //https://segmentfault.com/a/1190000003794736
    public int threeSumSmaller2(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] >= target) {
                break;
            }
            int diff = target - nums[i];
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                if (nums[left] + nums[right] < diff) {
                    count += right - left;
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }
}
