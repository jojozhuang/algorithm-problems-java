/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.TreeNode;

/**
 * Largest BST Subtree.
 * Given a binary tree, find the largest subtree which is a 
 * Binary Search Tree (BST), where largest means subtree with largest number 
 * of nodes in it.
 * 
 * Note:
 * A subtree must include all of its descendants.
 * Here's an example:
 *     10
 *     / \
 *    5  15
 *   / \   \ 
 *  1   8   7
 * The Largest BST Subtree in this case is the highlighted one. 
 * The return value is the subtree's size, which is 3.
 * Hint:
 * You can recursively use algorithm similar to 98. Validate Binary Search Tree
 * at each node of the tree, which will result in O(nlogn) time complexity.
 * Follow up:
 * Can you figure out ways to solve it with O(n) time complexity?
 * 
 * @author Johnny
 */
public class Solution333 {
    //http://buttercola.blogspot.com/2016/02/leetcode-largest-bst-subtree.html
    int max = 0;
    public int largestBSTSubtree(TreeNode root) {
        if (root == null) {
            return 0;
        }
         
        helper(root);
         
        return max;
    }
    
    private State helper(TreeNode root) {
        State curr = new State();
        if (root == null) {
            curr.isBST = true;
            return curr;
        }
         
        State left = helper(root.left);
        State right = helper(root.right);
         
        curr.lower = Math.min(root.val, Math.min(left.lower, right.lower));
        curr.upper = Math.max(root.val, Math.max(left.upper, right.upper));
         
        if (left.isBST && root.val > left.upper && right.isBST && root.val < right.lower) {
            curr.size = left.size + right.size + 1;
            curr.isBST = true;
            max = Math.max(max, curr.size);
        } else {
            curr.size = 0;
        }
         
        return curr;
    }
    
    private class State {
        int size = 0;
        int lower = Integer.MAX_VALUE;
        int upper = Integer.MIN_VALUE;
        boolean isBST = false;
    }
}
