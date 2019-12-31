package johnny.leetcode.algorithm;

import johnny.leetcode.algorithm.common.TreeNode;

/**
 * Binary Tree Longest Consecutive Sequence.
 * 
 * Given a binary tree, find the length of the longest consecutive sequence path.
 * 
 * The path refers to any sequence of nodes from some starting node to any node
 * in the tree along the parent-child connections. The longest consecutive path
 * need to be from parent to child (cannot be the reverse).
 * 
 * For example,
 *    1
 *     \
 *      3
 *     / \
 *    2   4
 *         \
 *          5
 * Longest consecutive sequence path is 3-4-5, so return 3.
 *    2
 *     \
 *      3
 *     / 
 *    2    
 *   / 
 *  1
 * Longest consecutive sequence path is 2-3,not 3-2-1, so return 2.
 * 
 * @author Johnny
 */
public class Solution298 {
    public int longestConsecutive(TreeNode root) {
        return helper(root)[1];
    }
    
    private int[] helper(TreeNode root) {
        if (root == null) {
            return new int[]{0,0};
        }
        int[] ans = new int[]{1,1};
        if (root.left == null && root.right == null) {
            return new int[]{1,1};
        }
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        if (root.left != null && root.val + 1 == root.left.val) {
            ans[0] = 1 + left[0];
        }
        if (root.right != null && root.val + 1 == root.right.val) {
            ans[0] = Math.max(ans[0], 1 + right[0]);
        }
        ans[1] = Math.max(ans[0], Math.max(left[1], right[1]));
        return ans;
    }
    
    public int longestConsecutive2(TreeNode root) {
        if (root == null){
            return 0;
        }
        return findLongest(root, 0, root.val - 1);
    }
    
    private int findLongest(TreeNode root, int length, int preVal){
        if (root == null){
            return length;
        }
        
        int currLen = 0;
        if (preVal + 1 == root.val) {
            currLen = length + 1;
        } else {
            currLen = 1;
        }
        
        int left = findLongest(root.left, currLen, root.val);
        int right = findLongest(root.right, currLen, root.val);

        return Math.max(currLen, Math.max(left, right));
    }
}
