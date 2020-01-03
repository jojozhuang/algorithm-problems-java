package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * Validate Binary Search Tree.
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * 
 * Assume a BST is defined as follows:
 * 
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 * 
 * @author Johnny
 */
public class Solution098 { 
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean helper(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        
        if (root.val >= max || root.val <= min) {
            return false;
        }
        
        boolean left = helper(root.left, min, root.val);
        boolean right = helper(root.right, root.val, max);
        
        return left && right;
    }
}
