package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

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
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null) {
            return null;
        }
        
        if (p.val >= root.val) {
            return inorderSuccessor(root.right, p);
        }
        
        TreeNode left = inorderSuccessor(root.left, p);
        if (left != null) {
            return left;
        } else {
            return root;
        }
    }
}
