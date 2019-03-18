package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.TreeNode;

/**
 * Find Bottom Left Tree Value
 * 
 * Given a binary tree, find the leftmost value in the last row of the tree.
 * 
 * Example 1:
 * Input:
 * 
 *   2
 *  / \
 * 1   3
 * 
 * Output:
 * 1
 * 
 * Example 2: 
 * Input:
 * 
 *      1
 *     / \
 *    2   3
 *   /   / \
 *  4   5   6
 *     /
 *    7
 * 
 * Output:
 * 7
 * 
 * Note: You may assume the tree (i.e., the given root node) is not NULL.
 * 
 * @author Johnny
 */
public class Solution513 {
    public int findBottomLeftValue(TreeNode root) {
        int[] ans = new int[]{0,0}; // level + value
        helper(root, 1, ans);
        return ans[1];
    }
    
    private void helper(TreeNode root, int level, int[] ans) {
        if (level > ans[0]) {
            ans[0] = level;
            ans[1] = root.val;
        }
        
        if (root.left != null) {
            helper(root.left, level + 1, ans);
        }
        if (root.right != null) {
            helper(root.right, level + 1, ans);
        }
    }
    
    public int findBottomRightValue(TreeNode root) {
        return findBottomRightValue(root, 1, new int[]{0,0});
    }
    private int findBottomRightValue(TreeNode root, int depth, int[] res) {
        if (res[1] < depth) {
            res[0] = root.val;
            res[1] = depth;
        }
        if (root.right != null) {
            findBottomRightValue(root.right, depth + 1, res);
        }
        // If found in the right child, then the left child will be ignored.
        if (root.left != null) {
            findBottomRightValue(root.left, depth + 1, res);
        }
        return res[0];
    }
}
