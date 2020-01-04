package johnny.leetcode.algorithm;

/**
 * Move Zeroes.
 * <p>
 * Given an array nums, write a function to move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements.
 * <p>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function,
 * nums should be [1, 3, 12, 0, 0].
 * <p>
 * Note:
 * <p>
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 *
 * @author Johnny
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int i = 0, j = 0;
        while (i < nums.length) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }
}
