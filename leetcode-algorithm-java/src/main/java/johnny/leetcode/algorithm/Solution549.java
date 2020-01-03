package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 *549. Binary Tree Longest Consecutive Sequence II
 *Given a binary tree, you need to find the length of Longest Consecutive Path in Binary Tree.

Especially, this path can be either increasing or decreasing. For example, [1,2,3,4] and [4,3,2,1] are both considered valid, but the path [1,2,4,3] is not valid. On the other hand, the path can be in the child-Parent-child order, where not necessarily be parent-child order.

Example 1:
Input:
        1
       / \
      2   3
Output: 2
Explanation: The longest consecutive path is [1, 2] or [2, 1].
Example 2:
Input:
        2
       / \
      1   3
Output: 3
Explanation: The longest consecutive path is [1, 2, 3] or [3, 2, 1].
Note: All the values of tree nodes are in the range of [-1e7, 1e7].
 * @author Johnny
 */
public class Solution549 {
    public int longestConsecutive(TreeNode root) {
        return helper(root)[2];
    }
    private int[] helper(TreeNode root) {
        if (root == null) {
            return new int[]{0,0,0};
        }
        int[] ans = new int[]{1,1,1};
        if (root.left == null && root.right == null) {
            return new int[]{1,1,1};
        }

        int[] left = helper(root.left);
        if (root.left != null) {
            if (root.val + 1 == root.left.val) {
                ans[0] = 1 + left[0];
            }
            if (root.val - 1 == root.left.val) {
                ans[1] = 1 + left[1];
            }
        }
        
        int[] right = helper(root.right);
        if (root.right != null) {
            if (root.val + 1 == root.right.val) {
                ans[0] = Math.max(ans[0], 1 + right[0]);
            }
            if (root.val - 1 == root.right.val) {
                ans[1] = Math.max(ans[1], 1 + right[1]);
            }
        }
        
        ans[2] = Math.max(ans[2], left[2]);
        ans[2] = Math.max(ans[2], right[2]);
        ans[2] = Math.max(ans[2], ans[0] + ans[1] - 1);
        return ans;
    }
    
    int maxval = 0;
    public int longestConsecutive2(TreeNode root) {
        longestPath(root);
        return maxval;
    }
    private int[] longestPath(TreeNode root) {
        if (root == null) {
            return new int[] {0,0};
        }
        int inc = 1, dec = 1;
        if (root.left != null) {
            int[] left = longestPath(root.left);
            if (root.val == root.left.val + 1) {
                dec = left[1] + 1;
            } else if (root.val == root.left.val - 1) {
                inc = left[0] + 1;
            }
        }
        if (root.right != null) {
            int[] right = longestPath(root.right);
            if (root.val == root.right.val + 1) {
                dec = Math.max(dec, right[1] + 1);
            } else if (root.val == root.right.val - 1) {
                inc = Math.max(inc, right[0] + 1);
            }
        }
        maxval = Math.max(maxval, dec + inc - 1);
        return new int[] {inc, dec};
    }
}
