package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.TreeNode;

/**
 * Symmetric Tree.
 * Given a binary tree, check whether it is a mirror of itself 
 * (ie, symmetric around its center).
 * 
 * For example, this binary tree is symmetric:
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * But the following is not:
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 * 
 * @author Johnny
 */
public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
       
        return helper(root.left, root.right);
    }
    
    public boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null && right != null) {
            return false;
        }
        if (left != null && right == null) {
            return false;
        }
        
        if (left.val != right.val) {
            return false;
        }
        
        if (!helper(left.left, right.right)) {
            return false;
        }

        if (!helper(left.right, right.left)) {
            return false;
        }
        
        return true;
    } 
}
