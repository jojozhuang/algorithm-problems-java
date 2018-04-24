package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.TreeNode;

/**
 * Inorder Successor in BST.
 * Given a binary search tree and a node in it, find the in-order successor of 
 * that node in the BST.
 * 
 * Note: If the given node has no in-order successor in the tree, return null.
 * 
 * @author Johnny
 */
public class Solution285 {
    //http://www.cnblogs.com/jcliBlogger/p/4829200.html
    //http://www.geeksforgeeks.org/inorder-successor-in-binary-search-tree/
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null || p == null) {
            return null;
        }        
        
        // first case: p.right is not null
        if (p.right != null) {
            //find the leftmost
            TreeNode curr = p.right;
            while (curr != null && curr.left != null) {
                curr = curr.left;
            }
            return curr;            
        }
        
        //another case: p.right is null
        TreeNode succ = p.right;
        while (root != null) {
            if (root.val == p.val) {
                break;
            } else if (root.val < p.val) {
                root = root.right;
            } else {
                succ = root;
                root = root.left;
            }
        }
        
        return succ;
    }
}
