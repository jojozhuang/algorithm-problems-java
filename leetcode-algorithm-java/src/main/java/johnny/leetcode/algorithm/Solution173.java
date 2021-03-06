package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.Stack;

/**
 * Binary Search Tree Iterator.
 * Implement an iterator over a binary search tree (BST). Your iterator will be
 * initialized with the root node of a BST.
 * <p>
 * Calling next() will return the next smallest number in the BST.
 * <p>
 * Note: next() and hasNext() should run in average O(1) time and uses O(h)
 * memory, where h is the height of the tree.
 *
 * @author Johnny
 */
public class Solution173 {
    private Stack<TreeNode> stack;
    private TreeNode curr;

    public Solution173(TreeNode root) {
        stack = new Stack<>();
        curr = root;
    }

    public boolean hasNext() {
        return (curr != null || !stack.isEmpty());
    }

    public int next() {
        while (curr != null) {
            stack.push(curr);
            curr = curr.left;
        }

        curr = stack.pop();
        int val = curr.val;
        curr = curr.right;
        return val;
    }
}
/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
