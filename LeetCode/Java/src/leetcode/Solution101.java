/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.TreeNode;

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
        if (root==null)
            return true;
        
        if (root.left==null&&root.right==null)
            return true;
        if (root.left==null&&root.right!=null)
            return false;
        if (root.left!=null&&root.right==null)
            return false;  
        
        if (!isSymmetricNode(root.left, root.right))
            return false;
        
        return true;
    }
    
    public boolean isSymmetricNode(TreeNode p, TreeNode q) {
        if (p==null&&q==null)
            return true;
        if (p==null&&q!=null)
            return false;
        if (p!=null&&q==null)
            return false;
        
        if (p.val != q.val)
            return false;
        
        if (!isSymmetricNode(p.left, q.right))
            return false;

        if (!isSymmetricNode(p.right, q.left))
            return false;
        
        return true;

    } 
}
