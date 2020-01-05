package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * 1008. Construct Binary Search Tree from Preorder Traversal
 * Return the root node of a binary search tree that matches the given preorder traversal.
 * <p>
 * (Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val.  Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)
 * <p>
 * Example 1:
 * Input: [8,5,1,7,10,12]
 * Output: [8,5,10,1,7,null,12]
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= preorder.length <= 100
 * The values of preorder are distinct.
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1008 {
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, 0, preorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int start, int end) {
        if (start > end || start < 0 || end >= preorder.length) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[start]);

        int index = -1;
        for (int i = start + 1; i <= end; i++) {
            if (preorder[i] > preorder[start]) {
                index = i;
                break;
            }
        }

        if (index == -1) { // no right;
            root.left = helper(preorder, start + 1, end);
        } else {
            root.left = helper(preorder, start + 1, index - 1);
            root.right = helper(preorder, index, end);
        }

        return root;
    }
}
