/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.TreeNode;

/**
 * Balanced Binary Tree.
 * 
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more 
 * than 1.
* 
 * @author Johnny
 */
public class Solution110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        if (root.left==null&&root.right==null)
            return true;
        if (root.left==null&&root.right!=null) {
            if (maxDepth(root.right)>1)
                return false;
        }
        if (root.left!=null&&root.right==null) {
            if (maxDepth(root.left)>1)
                return false;
        }
        
        if(Math.abs(maxDepth(root.left)-maxDepth(root.right))>1)
            return false;
        else
            return true;
    }
    
    private int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        
        if (root.left == null && root.right == null)
            return 1;
        if (root.left == null && root.right != null)
            return 1 + maxDepth(root.right);
        if (root.left != null && root.right == null)
            return 1 + maxDepth(root.left);
        
        return 1+ Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
