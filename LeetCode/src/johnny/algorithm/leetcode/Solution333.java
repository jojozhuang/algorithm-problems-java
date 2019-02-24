package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.TreeNode;

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
    // array with 3 variables
    public int largestBSTSubtree(TreeNode root) {
        return helper(root)[2];
    }
    
    private int[] helper(TreeNode root) {
        // ans[0], max of subtree
        // ans[1], min of subtree
        // ans[2], size
        int[] ans = new int[]{Integer.MIN_VALUE,Integer.MAX_VALUE,0};
        if (root == null) {
            return ans;
        }
        
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        if (root.val >= right[1] ||
            root.val <= left[0]) {
            ans[0] = Integer.MAX_VALUE; // for next round comparison, equivalent to isBTS = false
            ans[1] = Integer.MIN_VALUE; // for next round comparison, equivalent to isBTS = false
            ans[2] = Math.max(left[2], right[2]);
        } else {
            ans[0] = Math.max(root.val, right[0]);
            ans[1] = Math.min(root.val, left[1]);
            ans[2] = left[2] + right[2] + 1;
        }
        return ans;
    }
    
    // array with 4 variables
    // https://www.youtube.com/watch?v=4fiDs7CCxkc
    public int largestBSTSubtree2(TreeNode root) {
        return helper(root)[2];
    }
    
    private int[] helper2(TreeNode root) {
        // ans[0], max of subtree
        // ans[1], min of subtree
        // ans[2], size
        // ans[3], isBST, 1=yes,-1=no
        int[] ans = new int[]{Integer.MIN_VALUE,Integer.MAX_VALUE,0,0};
        if (root == null) {
            return ans;
        }
        
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        if (left[3] == -1 || right[3] == -1 || 
            root.val >= right[1] ||
            root.val <= left[0]) {
            ans[0] = 0; // can be any value
            ans[1] = 0; // can be any value
            ans[2] = Math.max(left[2], right[2]);
            ans[3] = -1;
        } else {
            ans[0] = Math.max(root.val, right[0]);
            ans[1] = Math.min(root.val, left[1]);
            ans[2] = left[2] + right[2] + 1;
            ans[3] = 1;
        }
        return ans;
    }
}
