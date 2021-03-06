package johnny.leetcode.algorithm;

/**
 * Increasing Triplet Subsequence.
 * Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.
 * <p>
 * Formally the function should:
 * Return true if there exists i, j, k
 * such that {@code arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1} else return false.
 * Your algorithm should run in O(n) time complexity and O(1) space complexity.
 * <p>
 * Examples:
 * Given [1, 2, 3, 4, 5],
 * return true.
 * <p>
 * Given [5, 4, 3, 2, 1],
 * return false.
 *
 * @author Johnny
 */
public class Solution334 {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (a >= nums[i]) { // minimum
                a = nums[i];
            } else if (b >= nums[i]) { // second minimum
                b = nums[i];
            } else {
                return true;
            }
        }

        return false;
    }
}
