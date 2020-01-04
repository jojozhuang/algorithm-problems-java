package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Invert Binary Tree.
 * Invert a binary tree.
 * <p>
 * 4
 * /   \
 * 2     7
 * / \   / \
 * 1   3 6   9
 * <p>
 * to
 * 4
 * /   \
 * 7     2
 * / \   / \
 * 9   6 3   1
 *
 * @author Johnny
 */
public class Solution226 {
    // Iterative
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode right = node.right;
            node.right = node.left;
            node.left = right;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return root;
    }

    // Recursive
    public TreeNode invertTree2(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
