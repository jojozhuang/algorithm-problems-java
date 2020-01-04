package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * 687. Longest Univalue Path
 * Given a binary tree, find the length of the longest path where each node in the path has the same
 * value. This path may or may not pass through the root.
 * <p>
 * Note: The length of path between two nodes is represented by the number of edges between them.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * <p>
 * 5
 * / \
 * 4   5
 * / \   \
 * 1   1   5
 * Output:
 * <p>
 * 2
 * Example 2:
 * <p>
 * Input:
 * <p>
 * 1
 * / \
 * 4   5
 * / \   \
 * 4   4   5
 * Output:
 * <p>
 * 2
 * Note: The given binary tree has not more than 10000 nodes. The height of the tree is not more than
 * 1000.
 *
 * @author Johnny
 */
public class Solution687 {
    int len = 0; // global variable

    public int longestUnivaluePath(TreeNode root) {
        int[] ans = new int[1];
        helper(root, ans);
        return ans[0];
    }

    private int helper(TreeNode root, int[] ans) {
        if (root == null) {
            return 0;
        }

        int left = helper(root.left, ans);
        int right = helper(root.right, ans);
        int pl = 0;
        int pr = 0;

        if (root.left != null && root.left.val == root.val) {
            pl = left + 1;
        }
        if (root.right != null && root.right.val == root.val) {
            pr = right + 1;
        }
        ans[0] = Math.max(ans[0], pl + pr);
        return Math.max(pl, pr);
    }

    public int longestUnivaluePath2(TreeNode root) {
        if (root == null) return 0;
        len = 0;
        getLen(root, root.val);
        return len;
    }

    private int getLen(TreeNode node, int val) {
        if (node == null) {
            return 0;
        }
        int left = getLen(node.left, node.val);
        int right = getLen(node.right, node.val);
        len = Math.max(len, left + right);
        if (val == node.val) {
            return Math.max(left, right) + 1;
        }
        return 0;
    }
}