/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.TreeNode;

/**
 * Closest Binary Search Tree Value.
 * 
 * Given a non-empty binary search tree and a target value, find the value in
 * the BST that is closest to the target.
 * 
 * Note:
 * 
 * Given target value is a floating point.
 * You are guaranteed to have only one unique value in the BST that is closest 
 * to the target.
 * 
 * @author Johnny
 */
public class Solution270 {
    public int closestValue(TreeNode root, double target) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        
        if (root.left == null && root.right == null) {
            return root.val;
        }
        
        int left = closestValue(root.left, target);
        int right = closestValue(root.right, target);
        
        double diffroot = Math.abs(root.val - target);
        double diffleft = Math.abs(left - target);
        double diffright = Math.abs(right - target);
        
        if (diffroot < diffleft) {
            return diffroot < diffright ? root.val : right;
        } else {
            return diffleft < diffright ? left : right;
        }
    }
}
