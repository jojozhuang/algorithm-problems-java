package johnny.lintcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * Longest Univalue Path
 * Given a binary tree, find the length of the longest path where each node in the path has the same value. This path may or may not pass through the root.
 *
 * Example 1:
 *
 * Input:
 *
 *               5
 *              / \
 *             4   5
 *            / \   \
 *           1   1   5
 * Output:
 *
 * 2
 * Example 2:
 *
 * Input:
 *
 *               1
 *              / \
 *             4   5
 *            / \   \
 *           4   4   5
 * Output:
 *
 * 2
 */
public class LongestUnivaluePath {
    /**
     * @param root:
     * @return: the length of the longest path where each node in the path has the same value
     */
    public int longestUnivaluePath(TreeNode root) {
        return helper(root)[1] - 1;
    }

    private int[] helper(TreeNode root) {
        if (root == null) {
            return new int[]{0,0};
        }

        if (root.left == null && root.right == null) {
            return new int[]{1,1};
        }

        int[] left = helper(root.left);
        int[] right = helper(root.right);

        int[] ans = new int[2];
        if (root.left != null && root.right == null) {
            if (root.val == root.left.val) {
                ans[0] = left[0] + 1;
                ans[1] = Math.max(ans[0], left[1]);
            } else {
                ans[0] = 1;
                ans[1] = left[1];
            }
        } else if (root.left == null && root.right != null) {
            if (root.val == root.right.val) {
                ans[0] = right[0] + 1;
                ans[1] = Math.max(ans[0], right[1]);
            } else {
                ans[0] = 1;
                ans[1] = right[1];
            }
        } else {
            ans[0] = 1;
            if (root.val == root.left.val) {
                ans[0] += left[0];
            }
            if (root.val == root.right.val) {
                ans[0] += right[0];
            }
            ans[1] = Math.max(ans[0], Math.max(left[1], right[1]));
        }

        return ans;
    }
}
