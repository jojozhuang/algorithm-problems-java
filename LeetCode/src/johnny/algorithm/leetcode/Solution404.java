package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.TreeNode;

/**
 * Sum of Left Leaves
 * 
 * Find the sum of all left leaves in a given binary tree.
 * 
 * Example:
 *    3
 *   / \
 *  9  20
 *    /  \
 *   15   7
 * There are two left leaves in the binary tree, with values 9 and 15 
 * respectively. Return 24.
 * 
 * @author Johnny
 */
public class Solution404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftSum = 0;
        int rightSum = sumOfLeftLeaves(root.right);
        TreeNode left = root.left;
        while(left != null && left.left != null) {
            rightSum += sumOfLeftLeaves(left.right);
            left = left.left;
        }
        if (left != null) {
            if (left.right == null) {
                leftSum = left.val;
            } else {
                rightSum += sumOfLeftLeaves(left.right);
            }
        }
        
        return leftSum + rightSum;   
    } 
}
