/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.TreeNode;

/**
 * Count Univalue Subtrees.
 * Given a binary tree, count the number of uni-value subtrees.
 * 
 * A Uni-value subtree means all nodes of the subtree have the same value.
 * 
 * For example:
 * Given binary tree, 
 *               5
 *              / \
 *             1   5
 *            / \   \
 *           5   5   5
 *   
 * return 4.
 * 
 * @author Johnny
 */
public class Solution250 {
    //http://www.voidcn.com/blog/pointbreak1/article/p-4357160.html
    private int count = 0;
    public int countUnivalSubtrees(TreeNode root) {
        if (root == null) {
            return 0;
        }
        isUniSubtree(root);
        return count;
    }
    
    private boolean isUniSubtree(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        if (root.left == null && root.right == null) {
            count++;
            return true;
        }
        
        boolean left = isUniSubtree(root.left);
        boolean right = isUniSubtree(root.right);
        
        if (left && right && 
                (root.left == null || root.val == root.left.val) && 
                (root.right == null || root.val == root.right.val)) {
            count++;
            return true;
        }
        
        return false;
    }
}
