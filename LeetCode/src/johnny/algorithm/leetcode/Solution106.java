package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.TreeNode;

/**
 * Construct Binary Tree from Inorder and Postorder Traversal.
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 * 
 * Note:
 * You may assume that duplicates do not exist in the tree.
 * 
 * @author Johnny
 */
public class Solution106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || inorder.length == 0 || postorder == null ||
                postorder.length == 0 || inorder.length != postorder.length) {
            return null;
        }
        
        return helper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1); 
    }
    
    private TreeNode helper(int[] inorder, int instart, int inend,
                             int[] postorder, int poststart, int postend) {
        if (instart > inend || poststart > postend) {
            return null;
        }
        
        int rootvalue = postorder[postend];
        TreeNode root = new TreeNode(rootvalue);
        int index = -1;
        for (int i = instart; i <= inend; i++) {
            if (inorder[i] == rootvalue) {
                index = i;
                break;
            }
        }
        
        root.left = helper(inorder, instart, index - 1, postorder, poststart, poststart + (index - instart) - 1);
        root.right = helper(inorder, index + 1, inend, postorder, poststart + (index - instart), postend - 1);
        return root;
    }
}
