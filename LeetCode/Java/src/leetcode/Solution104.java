/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.TreeNode;

/**
 * Maximum Depth of Binary Tree.
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the 
 * root node down to the farthest leaf node.
 * 
 * @author Johnny
 */
public class Solution104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int left = maxDepth(root.left) + 1;
        int right = maxDepth(root.right) + 1;
        if (left > right) {
            return left;
        }
        else {
            return right;
        }
    }
    /*
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        
        if (root.left == null && root.right == null)
            return 1;
        if (root.left == null && root.right != null)
            return 1 + maxDepth(root.right);
        if (root.left != null && root.right == null)
            return 1 + maxDepth(root.left);
        
        return 1+ Math.max(maxDepth(root.left), maxDepth(root.right));
    }*/
}
