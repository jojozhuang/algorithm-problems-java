package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * Maximum Product of Three Numbers
 * <p>
 * Given an integer array, find three numbers whose product is maximum and
 * output the maximum product.
 * <p>
 * Example 1:
 * Input: [1,2,3]
 * Output: 6
 * <p>
 * Example 2:
 * Input: [1,2,3,4]
 * Output: 24
 * <p>
 * Note:
 * 1. The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
 * 2. Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
 *
 * @author Johnny
 */
public class Solution628 {
    // O(n)
    public int maximumProduct(int[] nums) {
        if (nums == null || nums.length < 3) {
            return Integer.MIN_VALUE;
        }
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n <= min1) {
                min2 = min1;
                min1 = n;
            } else if (n <= min2) {
                min2 = n;
            }
            if (n >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n >= max2) {
                max3 = max2;
                max2 = n;
            } else if (n >= max3) {
                max3 = n;
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }

    // nlog(n)
    public int maximumProduct2(int[] nums) {
        if (nums == null || nums.length < 3) {
            return Integer.MIN_VALUE;
        }

        Arrays.sort(nums);

        int n = nums.length;

        int max = nums[n - 1] * nums[n - 2] * nums[n - 3];
        max = Math.max(max, nums[0] * nums[1] * nums[n - 1]);

        return max;
    }
}
