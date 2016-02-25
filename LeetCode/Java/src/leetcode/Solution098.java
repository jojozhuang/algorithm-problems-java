/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.TreeNode;

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
    class BSTResult {
        public int Min = Integer.MIN_VALUE;
        public int Max = Integer.MAX_VALUE;
        public boolean isBST = true;
        public BSTResult(){}
    }
    public boolean isValidBST(TreeNode root) {
        return validateBST(root).isBST;
    }
    private BSTResult validateBST(TreeNode root) {
        BSTResult result = new BSTResult();
        if (root == null) {
            return result;
        }
        if (root.left == null) {
            result.Min = root.val;            
        }
        else {
            BSTResult left = validateBST(root.left);
            if (!left.isBST) {
                result.isBST = false;
                return result;
            }
            if (left.Max >= root.val) {
                result.isBST = false;
                return result;
            }
            result.Min = left.Min;
        }
        
        if (root.right == null) {
            result.Max = root.val;
        }
        else {
            BSTResult right = validateBST(root.right);
            if (!right.isBST) {
                result.isBST = false;
                return result;
            }
            if (right.Min <= root.val) {
                result.isBST = false;
                return result;
            }
            result.Max = right.Max;
        }       
        result.isBST = true;        
        return result;        
    }
    
    public boolean isValidBST2(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean isValidBSTHelper(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        
        if (root.val >= max || root.val <= min) {
            return false;
        }
        
        boolean left = isValidBSTHelper(root.left, min, root.val);
        boolean right = isValidBSTHelper(root.right, root.val, max);
        
        return left && right;
    }    
}
