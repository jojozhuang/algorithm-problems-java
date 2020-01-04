package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * Sum of Left Leaves
 * <p>
 * Find the sum of all left leaves in a given binary tree.
 * <p>
 * Example:
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * There are two left leaves in the binary tree, with values 9 and 15
 * respectively. Return 24.
 *
 * @author Johnny
 */
public class Solution404 {
    // recursive, no helper
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum = root.left.val;
        }
        return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

    // recursive
    public int sumOfLeftLeaves3(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return helper(root.left, true) + helper(root.right, false);
    }

    private int helper(TreeNode root, boolean isLeft) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null && isLeft) {
            return root.val;
        }
        int left = helper(root.left, true);
        int right = helper(root.right, false);
        return left + right;
    }

    // iterative
    public int sumOfLeftLeaves2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftSum = 0;
        int rightSum = sumOfLeftLeaves(root.right);
        TreeNode left = root.left;
        while (left != null && left.left != null) {
            rightSum += sumOfLeftLeaves(left.right);
            left = left.left;
        }
        if (left != null) {
            if (left.right == null) {
                leftSum = left.val;
            } else {
                rightSum += sumOfLeftLeaves(left.right);
            }
        }

        return leftSum + rightSum;
    }
}
