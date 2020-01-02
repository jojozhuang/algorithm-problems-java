package johnny.lintcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * Binary Tree Longest Consecutive Sequence
 * Given a binary tree, find the length of the longest consecutive sequence path.
 *
 * The path refers to any sequence of nodes from some starting node to any node in the tree along the parent-child connections.
 * The longest consecutive path need to be from parent to child (cannot be the reverse).
 * 
 * Example
 * Example 1:
 *
 * Input:
 *    1
 *     \
 *      3
 *     / \
 *    2   4
 *         \
 *          5
 * Output:3
 * Explanation:
 * Longest consecutive sequence path is 3-4-5, so return 3.
 * Example 2:
 *
 * Input:
 *    2
 *     \
 *      3
 *     /
 *    2
 *   /
 *  1
 * Output:2
 * Explanation:
 * Longest consecutive sequence path is 2-3,not 3-2-1, so return 2.
 * 
 * @author Johnny
 */
public class LongestConsecutive {
    public int longestConsecutive(TreeNode root) {
        int[] max = new int[1];
        helper(root, null, 0, max);
        return max[0];
    }

    private void helper(TreeNode root, TreeNode parent, int len, int[] max) {
        if (root == null) {
            max[0] = Math.max(max[0], len);
            return;
        }

        max[0] = Math.max(max[0], len);
        if (parent == null) {
            helper(root.left, root, 1, max);
            helper(root.right, root, 1, max);
        } else {
            if (root.val == parent.val + 1) {
                helper(root.left, root, len + 1, max);
                helper(root.right, root, len + 1, max);
            } else {
                helper(root, null, 0, max);
            }
        }
    }
}
