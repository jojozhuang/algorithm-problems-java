package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.TreeNode;

/**
 * Binary Tree Tilt
 * Given a binary tree, return the tilt of the whole tree.
 * 
 * The tilt of a tree node is defined as the absolute difference between the sum 
 * of all left subtree node values and the sum of all right subtree node values. 
 * Null node has tilt 0.
 * 
 * The tilt of the whole tree is defined as the sum of all nodes' tilt.
 * 
 * Example:
 * Input: 
 *        1
 *      /   \
 *     2     3
 * 
 * Output: 1
 * Explanation: 
 * Tilt of node 2 : 0
 * Tilt of node 3 : 0
 * Tilt of node 1 : |2-3| = 1
 * Tilt of binary tree : 0 + 0 + 1 = 1
 * 
 * Note:
 * 1. The sum of node values in any subtree won't exceed the range of 32-bit integer.
 * 2. All the tilt values won't exceed the range of 32-bit integer.
 * 
 * @author Johnny
 */
public class Solution563 {
    int totalTilt = 0;
    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        totalTilt = 0;
        helper(root);
        
        return totalTilt;
    }
    
    private int[] helper(TreeNode root) {
        if (root == null) {
            return new int[]{0,0};
        }
        
        int[] res = new int[2];
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        
        res[0] = left[0] + right[0] + root.val;
        res[1] = Math.abs(left[0] - right[0]);
        totalTilt += res[1];
        return res;
    }
}
