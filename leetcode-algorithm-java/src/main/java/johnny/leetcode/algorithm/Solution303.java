package johnny.leetcode.algorithm;

/**
 * Range Sum Query - Immutable.
 * <p>
 * Given an integer array nums, find the sum of the elements between
 * indices i and j ({@code i ≤ j}), inclusive.
 * <p>
 * Example:
 * Given nums = [-2, 0, 3, -5, 2, -1]
 * <p>
 * {@code sumRange(0, 2) -> 1}
 * {@code sumRange(2, 5) -> -1}
 * {@code sumRange(0, 5) -> -3}
 * Note:
 * You may assume that the array does not change.
 * There are many calls to sumRange function.
 *
 * @author Johnny
 */
public class Solution303 {
    int[] preSum;

    public Solution303(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        preSum = new int[nums.length];
        preSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) {
            return preSum[j];
        } else {
            return preSum[j] - preSum[i - 1];
        }
    }
}
