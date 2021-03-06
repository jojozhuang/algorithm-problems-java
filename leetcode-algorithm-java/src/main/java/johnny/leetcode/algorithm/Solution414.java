package johnny.leetcode.algorithm;

/**
 * Third Maximum Number
 * <p>
 * Given a non-empty array of integers, return the third maximum number in this
 * array. If it does not exist, return the maximum number. The time complexity
 * must be in O(n).
 * <p>
 * Example 1:
 * Input: [3, 2, 1]
 * <p>
 * Output: 1
 * <p>
 * Explanation: The third maximum is 1.
 * <p>
 * Example 2:
 * Input: [1, 2]
 * <p>
 * Output: 2
 * <p>
 * Explanation: The third maximum does not exist, so the maximum (2) is returned
 * instead.
 * <p>
 * Example 3:
 * Input: [2, 2, 3, 1]
 * <p>
 * Output: 1
 * <p>
 * Explanation: Note that the third maximum here means the third maximum
 * distinct number.
 * Both numbers with value 2 are both considered as second maximum.
 *
 * @author Johnny
 */
public class Solution414 {
    public int thirdMax(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
            } else if (nums[i] != first && nums[i] > second) {
                third = second;
                second = nums[i];
            } else if (nums[i] != first && nums[i] != second && nums[i] > third) {
                third = nums[i];
            }
        }

        if (third != Long.MIN_VALUE) {
            return (int) third;
        } else {
            return (int) first;
        }
    }
}
