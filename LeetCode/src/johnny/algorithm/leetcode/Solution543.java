package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.TreeNode;

/**
 * Diameter of Binary Tree
 * 
 * Given a binary tree, you need to compute the length of the diameter of the 
 * tree. The diameter of a binary tree is the length of the longest path 
 * between any two nodes in a tree. This path may or may not pass through the
 * root.
 * 
 * Example:
 * Given a binary tree 
 *          1
 *         / \
 *        2   3
 *       / \   
 *      4   5    
 * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
 * 
 * Note: The length of path between two nodes is represented by the number of 
 * edges between them.
 * 
 * @author Johnny
 */
public class Solution543 {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // length = count of nodes - 1
        return helper(root)[1] - 1;
    }
    
    // returns the count of nodes
    private int[] helper(TreeNode root) {
        // ans[0] is the count of nodes on the single path
        // ans[1] is the count of nodes on the longest path
        int[] ans = new int[]{0,0}; 
        if (root == null) {
            return ans;
        }
        
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        ans[0] = Math.max(left[0],right[0]) + 1;
        ans[1] = Math.max(left[0]+right[0] + 1, Math.max(left[1], right[1]));
        return ans;
    }
}
