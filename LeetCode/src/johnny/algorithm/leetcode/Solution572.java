/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.TreeNode;

/**
 * Subtree of Another Tree
 * 
 * Given two non-empty binary trees s and t, check whether tree t has exactly 
 * the same structure and node values with a subtree of s. A subtree of s is a 
 * tree consists of a node in s and all of this node's descendants. The tree s 
 * could also be considered as a subtree of itself.
 * 
 * Example 1:
 * Given tree s:
 * 
 *     3
 *    / \
 *   4   5
 *  / \
 * 1   2
 * 
 * Given tree t:
 *   4 
 *  / \
 * 1   2
 * Return true, because t has the same structure and node values with a subtree of s.
 *
 * Example 2:
 * Given tree s:
 *
 *     3
 *    / \
 *   4   5
 *  / \
 * 1   2
 *   /
 *  0
 * 
 * Given tree t:
 *   4
 *  / \
 * 1   2
 * Return false.
 * 
 * @author Johnny
 */
public class Solution572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }

        if (isSame(s, t)) {
            return true;
        }
        
        if (isSubtree(s.left, t)) {
            return true;
        }

        if (isSubtree(s.right, t)) {
            return true;
        }
        
        return false;
    }
    
    private boolean isSame(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 != null) {
            return false;
        }
        
        if (t1 != null && t2 == null) {
            return false;
        }
        
        if (t1 == null && t2 == null) {
            return true;
        }
        
        if (t1.val != t2.val) {
            return false;
        }
        
        return isSame(t1.left, t2.left) && isSame(t1.right, t2.right);        
    }
}
