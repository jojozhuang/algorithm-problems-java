package johnny.leetcode.algorithm;

import java.util.Stack;

/**
 * 132 Pattern
 * <p>
 * Given a sequence of n integers a1, a2, ..., an, a 132 pattern is a subsequence
 * ai, aj, ak such that {@code i < j < k and ai < ak < aj}. Design an algorithm that
 * takes a list of n numbers as input and checks whether there is a 132 pattern
 * in the list.
 * <p>
 * Note: n will be less than 15,000.
 * <p>
 * Example 1:
 * Input: [1, 2, 3, 4]
 * <p>
 * Output: False
 * <p>
 * Explanation: There is no 132 pattern in the sequence.
 * <p>
 * Example 2:
 * Input: [3, 1, 4, 2]
 * <p>
 * Output: True
 * <p>
 * Explanation: There is a 132 pattern in the sequence: [1, 4, 2].
 * <p>
 * Example 3:
 * Input: [-1, 3, 2, 0]
 * <p>
 * Output: True
 * <p>
 * Explanation: There are three 132 patterns in the sequence: [-1, 3, 2],
 * [-1, 3, 0] and [-1, 2, 0].
 *
 * @author Johnny
 */
public class Solution456 {
    public boolean find132pattern(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(nums[0]);

        int j = 1;
        while (j < nums.length) {
            if (nums[j] >= stack.peek()) {
                stack.push(nums[j]);
            } else {
                if (stack.isEmpty()) {
                    stack.push(nums[j]);
                } else if (stack.size() == 1) {
                    stack.pop();
                    stack.push(nums[j]);
                } else {
                    int top = stack.pop();
                    while (!stack.isEmpty()) {
                        int small = stack.peek();
                        int k = j;
                        while (k < nums.length) {
                            if (nums[k] > small && nums[k] < top) {
                                return true;
                            }
                            k++;
                        }
                        if (!stack.isEmpty()) {
                            stack.pop();
                        }
                    }

                    while (!stack.isEmpty()) {
                        stack.pop();
                    }
                    stack.push(nums[j]);
                }
            }
            j++;
        }

        return false;
    }
}
