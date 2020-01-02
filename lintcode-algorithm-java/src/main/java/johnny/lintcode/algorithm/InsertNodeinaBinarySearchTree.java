package johnny.lintcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * Insert Node in a Binary Search Tree.
 * Given a binary search tree and a new tree node, insert the node into the tree. 
 * You should keep the tree still be a valid binary search tree.
 * 
 * Example
 * Given binary search tree as follow, after Insert node 6, the tree should be:
 * 
 *   2             2
 *  / \           / \
 * 1   4   -->   1   4
 *    /             / \ 
 *   3             3   6
 * Challenge
 * Can you do it without recursion?
 *  
 * @author Johnny
 */
public class InsertNodeinaBinarySearchTree {
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        if (node == null) {
            return root;
        }
        if (root == null) {
            return node;
        }
        
        if (root.val < node.val) {
            root.right = insertNode(root.right, node);
        } else {
            root.left = insertNode(root.left, node);
        }
        
        return root;
    }
    
    // no recursion
    public TreeNode insertNode2(TreeNode root, TreeNode node) {
        if (node == null) {
            return root;
        }
        if (root == null) {
            return node;
        }
        
        TreeNode rootcopy = root;
        while(root != null) {
            if (root.val <= node.val && root.right == null) {
                root.right = node;
                break;
            } else if (root.val > node.val && root.left == null) {
                root.left = node;
            } else if (root.val <= node.val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        
        return rootcopy;
    }
}
