package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * Binary Tree Tilt
 * Given a binary tree, return the tilt of the whole tree.
 * <p>
 * The tilt of a tree node is defined as the absolute difference between the sum
 * of all left subtree node values and the sum of all right subtree node values.
 * Null node has tilt 0.
 * <p>
 * The tilt of the whole tree is defined as the sum of all nodes' tilt.
 * <p>
 * Example:
 * Input:
 * 1
 * /   \
 * 2     3
 * <p>
 * Output: 1
 * Explanation:
 * Tilt of node 2 : 0
 * Tilt of node 3 : 0
 * Tilt of node 1 : |2-3| = 1
 * Tilt of binary tree : 0 + 0 + 1 = 1
 * <p>
 * Note:
 * 1. The sum of node values in any subtree won't exceed the range of 32-bit integer.
 * 2. All the tilt values won't exceed the range of 32-bit integer.
 *
 * @author Johnny
 */
public class Solution563 {
    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return helper(root)[1];
    }

    private int[] helper(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }

        if (root.left == null && root.right == null) {
            return new int[]{root.val, 0};
        }

        int[] left = helper(root.left);
        int[] right = helper(root.right);

        int sum = root.val + left[0] + right[0];
        int tilt = left[1] + right[1] + Math.abs(left[0] - right[0]);
        return new int[]{sum, tilt};
    }
}
