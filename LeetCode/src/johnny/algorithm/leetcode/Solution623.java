package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.TreeNode;

/**
 * Add One Row to Tree
 * 
 * Given the root of a binary tree, then value v and depth d, you need to add a 
 * row of nodes with value v at the given depth d. The root node is at depth 1.
 * 
 * The adding rule is: given a positive integer depth d, for each NOT null tree 
 * nodes N in depth d-1, create two tree nodes with value v as N's left subtree 
 * root and right subtree root. And N's original left subtree should be the left 
 * subtree of the new left subtree root, its original right subtree should be 
 * the right subtree of the new right subtree root. If depth d is 1 that means 
 * there is no depth d-1 at all, then create a tree node with value v as the 
 * new root of the whole original tree, and the original tree is the new root's 
 * left subtree.
 * 
 * Example 1:
 * Input: 
 * A binary tree as following:
 *      4
 *    /   \
 *   2     6
 *  / \   / 
 * 3   1 5   
 *
 * v = 1
 * 
 * d = 2
 * 
 * Output: 
 * 
 *       4
 *      / \
 *     1   1
 *    /     \
 *   2       6
 *  / \     / 
 * 3   1   5   
 * 
 * Example 2:
 * Input: 
 * A binary tree as following:
 * 
 *     4
 *    /   
 *   2    
 *  / \   
 * 3   1    
 * 
 * v = 1
 * 
 * d = 3
 * 
 * Output: 
 * 
 *       4
 *      /   
 *     2
 *    / \    
 *   1   1
 *  /     \  
 * 3       1
 * 
 * Note:
 * 1. The given d is in range [1, maximum depth of the given tree + 1].
 * 2. The given binary tree has at least one tree node.
 * 
 * @author Johnny
 */
public class Solution623 {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode newRoot = new TreeNode(v);
            newRoot.left = root;
            return newRoot;
        }
        
        helper(root, v, d - 2);
        
        return root;
    }
    
    private void helper(TreeNode root, int v, int level) {
        if (root == null) {
            return;
        }
        if (level == 0) {
            TreeNode left = root.left;
            TreeNode right = root.right;
            root.left = new TreeNode(v);
            root.left.left = left;
            root.right = new TreeNode(v);
            root.right.right = right;
        } else {
            helper(root.left, v, level-1);
            helper(root.right, v, level-1);
        }
    }
    
    public TreeNode addOneRow2(TreeNode root, int v, int d) {
        if (d == 0 || d == 1) {
            TreeNode newroot = new TreeNode(v);
            newroot.left = d == 1 ? root : null;
            newroot.right = d == 0 ? root : null;
            return newroot;
        }
        if (root != null && d >= 2) {
            root.left  = addOneRow(root.left,  v, d > 2 ? d - 1 : 1);
            root.right = addOneRow(root.right, v, d > 2 ? d - 1 : 0);
        }
        return root;
    }
}
