package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * 1026. Maximum Difference Between Node and Ancestor
 * Given the root of a binary tree, find the maximum value V for which there exists different nodes A and B where V = |A.val - B.val| and A is an ancestor of B.
 * <p>
 * (A node A is an ancestor of B if either: any child of A is equal to B, or any child of A is an ancestor of B.)
 * <p>
 * Example 1:
 * Input: [8,3,10,1,6,null,14,null,null,4,7,13]
 * Output: 7
 * Explanation:
 * We have various ancestor-node differences, some of which are given below :
 * |8 - 3| = 5
 * |3 - 7| = 4
 * |8 - 1| = 7
 * |10 - 13| = 3
 * Among all possible differences, the maximum value of 7 is obtained by |8 - 1| = 7.
 * <p>
 * <p>
 * Note:
 * <p>
 * The number of nodes in the tree is between 2 and 5000.
 * Each node will have value between 0 and 100000.
 *
 * @author Johnny
 */
public class SolutionA1026 {
    int global_max = 0;

    public int maxAncestorDiff(TreeNode root) {
        if (root == null) {
            return global_max;
        }
        helper(root, root.val, root.val);
        return global_max;
    }

    private void helper(TreeNode root, int max, int min) {
        if (root == null) {
            return;
        }

        global_max = Math.max(global_max, Math.abs(max - root.val));
        global_max = Math.max(global_max, Math.abs(min - root.val));

        max = Math.max(max, root.val);
        min = Math.min(min, root.val);
        helper(root.left, max, min);
        helper(root.right, max, min);
    }

    public int maxAncestorDiff2(TreeNode root) {
        if (root == null) {
            return global_max;
        }
        helper(root, root.val, root.val);
        return global_max;
    }

    private void helper2(TreeNode root, int max, int min) {
        if (root == null) {
            return;
        }

        global_max = Math.max(global_max, Math.abs(max - root.val));
        global_max = Math.max(global_max, Math.abs(min - root.val));

        int next_max = Math.max(max, root.val);
        int next_min = Math.min(min, root.val);
        helper(root.left, next_max, next_min);
        helper(root.right, next_max, next_min);
    }
}
