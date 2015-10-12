/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Stack;
import leetcode.common.TreeNode;

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
    private Stack<TreeNode> stack = new Stack<>();
    private TreeNode curt;
    public Solution173(TreeNode root) {
        curt = root;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return (curt != null || !stack.isEmpty());
    }

    /** @return the next smallest number */
    public int next() {
        while(curt != null) {
            stack.push(curt);
            curt = curt.left;
        }
        
        curt = stack.pop();
        TreeNode node = curt;
        curt = curt.right;
        return node.val;
    }
}
/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
