package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.TreeNode;

/**
 * Binary Tree Maximum Path Sum.
 * Given a binary tree, find the maximum path sum.
 * 
 * The path may start and end at any node in the tree.
 * 
 * For example:
 * Given the below binary tree,
 * 
 *        1
 *       / \
 *      2   3
 * Return 6.
 * 
 * @author Johnny
 */
public class Solution124 {
    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return helper(root)[1];
    }
    
    // [0]: single path, [1] max path
    private int[] helper(TreeNode root) {
        if (root == null) {
            return new int[]{0, Integer.MIN_VALUE};
        }
        
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        
        int singlePath = Math.max(left[0], right[0]) + root.val;
        singlePath = Math.max(singlePath, 0);
        
        int maxPath = Math.max(left[1], right[1]);
        maxPath = Math.max(maxPath, left[0] + right[0] + root.val);
        
        return new int[] { singlePath, maxPath};
    }
    
    public int maxPathSum2(TreeNode root) {
        return maxPathHelper(root).maxPath;
    }
    
    private ResultType maxPathHelper(TreeNode root) {
        if (root == null) {
            return new ResultType(0, Integer.MIN_VALUE);
        }
        
        ResultType left = maxPathHelper(root.left);
        ResultType right = maxPathHelper(root.right);
        
        int singlePath = Math.max(left.singlePath, right.singlePath) + root.val;
        singlePath = Math.max(singlePath, 0);
        
        int maxPath = Math.max(left.maxPath, right.maxPath);
        maxPath = Math.max(maxPath, left.singlePath + right.singlePath + root.val);
        
        return new ResultType(singlePath, maxPath);
    }
    
    private class ResultType {
        int singlePath, maxPath;
        ResultType(int singlePath, int maxPath) {
            this.singlePath = singlePath;
            this.maxPath = maxPath;
        }
    }
}
