package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * Flatten Binary Tree to Linked List.
 * Given a binary tree, flatten it to a linked list in-place.
 * <p>
 * For example,
 * Given
 * <p>
 * 1
 * / \
 * 2   5
 * / \   \
 * 3   4   6
 * <p>
 * The flattened tree should look like:
 * 1
 * \
 * 2
 * \
 * 3
 * \
 * 4
 * \
 * 5
 * \
 * 6
 *
 * @author Johnny
 */
public class Solution114 {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        // flatten left
        flatten(root.left);
        // flatten right
        flatten(root.right);

        if (root.left != null) {
            TreeNode tail = root.left;
            while (tail.right != null) {
                tail = tail.right;
            }
            TreeNode right = root.right;
            root.right = root.left;
            tail.right = right;
            root.left = null;
        }
    }
}
