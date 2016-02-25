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
        return (maxDepth(root) != -1);
    }
    
    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }
        else {
            return Math.max(left, right) + 1;
        }
    }    
}
