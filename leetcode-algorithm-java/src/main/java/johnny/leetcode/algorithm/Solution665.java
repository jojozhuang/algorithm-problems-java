package johnny.leetcode.algorithm;

/**
 * 665. Non-decreasing Array
 * Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
 * <p>
 * We define an array is non-decreasing if {@code array[i] <= array[i + 1] holds for every i (1 <= i < n)}.
 * <p>
 * Example 1:
 * Input: [4,2,3]
 * Output: True
 * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
 * Example 2:
 * Input: [4,2,1]
 * Output: False
 * Explanation: You can't get a non-decreasing array by modify at most one element.
 * Note: The n belongs to [1, 10,000].
 *
 * @author Johnny
 */
public class Solution665 {
    public boolean checkPossibility(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
                if (i - 2 < 0 || nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i];
                } else {
                    nums[i] = nums[i - 1];
                }
            }
        }

        return count <= 1;
    }

    public boolean checkPossibility2(int[] nums) {
        int cnt = 0;                                                                    //the number of changes
        for (int i = 1; i < nums.length && cnt <= 1; i++) {
            if (nums[i - 1] > nums[i]) {
                cnt++;
                if (i - 2 < 0 || nums[i - 2] <= nums[i])
                    nums[i - 1] = nums[i];                    //modify nums[i-1] of a priority
                else nums[i] = nums[i - 1];                                                //have to modify nums[i]
            }
        }
        return cnt <= 1;
    }
}
