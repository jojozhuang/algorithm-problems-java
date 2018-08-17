package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.TreeNode;

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
    // no recursion, log(n), binary, the root node is the pivot
    public int closestValue2(TreeNode root, double target) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int closest = root.val;
        while (root != null){
            if (Math.abs(root.val - target) < Math.abs(closest - target)) {
                closest = root.val;
            }
            if (closest == target){
                break;
            }
            root = target < root.val ? root.left : root.right;
        }
        return closest;
    }
    
    // recursion, use the feature of BST
    public int closestValue3(TreeNode root, double target) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        
        TreeNode child = target < root.val ? root.left : root.right;
        if(child == null) {
            return root.val;
        }
        int closest = closestValue(child, target);
        return Math.abs(root.val - target) < Math.abs(closest - target) ? root.val : closest;
    }

    // recursion, also valid for Binary Search, not only for BST
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
        
        if (diffroot <= diffleft) {
            return diffroot <= diffright ? root.val : right;
        } else {
            return diffleft <= diffright ? left : right;
        }
    }
}
