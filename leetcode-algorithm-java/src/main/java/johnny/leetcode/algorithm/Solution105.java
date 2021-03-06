package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * Construct Binary Tree from Preorder and Inorder Traversal.
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 * <p>
 * Note:
 * You may assume that duplicates do not exist in the tree.
 *
 * @author Johnny
 */
public class Solution105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0 || inorder == null ||
                inorder.length == 0 || preorder.length != inorder.length) {
            return null;
        }

        return helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int prestart, int preend,
                            int[] inorder, int instart, int inend) {
        if (prestart > preend || instart > inend) {
            return null;
        }

        int rootvalue = preorder[prestart];
        TreeNode root = new TreeNode(rootvalue);
        int index = -1; //Index of current root in inorder
        for (int i = instart; i <= inend; i++) {
            if (inorder[i] == rootvalue) {
                index = i;
                break;
            }
        }

        root.left = helper(preorder, prestart + 1, prestart + (index - instart), inorder, instart, index - 1);
        root.right = helper(preorder, prestart + (index - instart) + 1, preend, inorder, index + 1, inend);
        return root;
    }
}
