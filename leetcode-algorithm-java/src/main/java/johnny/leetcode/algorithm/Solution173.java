package johnny.leetcode.algorithm;

import java.util.Stack;
import johnny.leetcode.algorithm.common.TreeNode;

/**
 * Binary Search Tree Iterator.
 * Implement an iterator over a binary search tree (BST). Your iterator will be 
 * initialized with the root node of a BST.
 * 
 * Calling next() will return the next smallest number in the BST.
 * 
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) 
 * memory, where h is the height of the tree.
 * 
 * @author Johnny
 */
public class Solution173 {
    private Stack<TreeNode> stack = new Stack<TreeNode>();
    private TreeNode curr;
    public Solution173(TreeNode root) {
        curr = root;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return (curr != null || !stack.isEmpty());
    }

    /** @return the next smallest number */
    public int next() {
        while (curr != null) {
            stack.push(curr);
            curr = curr.left;
        }
        
        curr = stack.pop();
        int res = curr.val;
        curr = curr.right;
        return res;
    }
}
/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
