package johnny.company.algorithm;

import java.util.Stack;

/**
 * Next Greater Element
 *
 * Given an array, print the Next Greater Number for every element. The Next Greater Number of a
 * number x is the first greater number to its right next in the array,
 *
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=621720
 *
 * 给一个乱序数组， 返回每个数字之后第一个比他大的数， 没有的话返回-1，
 * eg input [4, 2, 5, 12,3] 返回[5, 5, 12, -1, -1]
 *
 */

public class NextGreaterElement {
    public int[] nextGreaterElements(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }

        Stack<Integer> stack = new Stack<>();

        int[] ans = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
                stack.push(nums[i]);
            } else {
                ans[i] = stack.peek();
                stack.push(nums[i]);
            }
        }

        return ans;
    }

}
