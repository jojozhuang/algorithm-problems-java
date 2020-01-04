package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.Stack;

/**
 * 897. Increasing Order Search Tree
 * Given a tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only 1 right child.
 * <p>
 * Example 1:
 * Input: [5,3,6,2,4,null,8,1,null,null,null,7,9]
 * <p>
 * 5
 * / \
 * 3    6
 * / \    \
 * 2   4    8
 * /        / \
 * 1        7   9
 * <p>
 * Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
 * <p>
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
 * \
 * 7
 * \
 * 8
 * \
 * 9
 * Note:
 * <p>
 * The number of nodes in the given tree will be between 1 and 100.
 * Each node will have a unique integer value from 0 to 1000.
 *
 * @author Johnny
 */
public class Solution897 {
    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        return helper(root)[0];
    }

    private TreeNode[] helper(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode[] res = new TreeNode[2];
        // left
        TreeNode[] left = helper(root.left);
        if (left != null) {
            left[1].right = root;
            res[0] = left[0];
            root.left = null; // must set to null
        } else {
            res[0] = root;
        }
        // right
        TreeNode[] right = helper(root.right);
        if (right != null) {
            root.right = right[0];
            res[1] = right[1];
        } else {
            res[1] = root;
        }

        return res;
    }

    public TreeNode increasingBST2(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode newRoot = null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        TreeNode previous = null;
        while (curr != null || !stack.empty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            if (newRoot == null) {
                newRoot = curr;
                previous = newRoot;
            } else {
                previous.left = null;
                curr.left = null;
                previous.right = curr;
                previous = previous.right;
            }

            curr = curr.right;
        }

        return newRoot;
    }
}
