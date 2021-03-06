package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * House Robber III.
 * <p>
 * The thief has found himself a new place for his thievery again. There is only
 * one entrance to this area, called the "root." Besides the root, each house
 * has one and only one parent house. After a tour, the smart thief realized
 * that "all houses in this place forms a binary tree". It will automatically
 * contact the police if two directly-linked houses were broken into on the same night.
 * <p>
 * Determine the maximum amount of money the thief can rob tonight without alerting the police.
 * <p>
 * Example 1:
 * 3
 * / \
 * 2   3
 * \   \
 * 3   1
 * Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
 * Example 2:
 * 3
 * / \
 * 4   5
 * / \   \
 * 1   3   1
 * Maximum amount of money the thief can rob = 4 + 5 = 9.
 *
 * @author Johnny
 */
public class Solution337 {
    //https://www.hrwhisper.me/leetcode-house-robber-iii/
    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return helper(root)[0];
    }

    private int[] helper(TreeNode root) {
        int[] res = {0, 0}; // 0: max, 1: max without root
        if (root != null) {
            int[] left = helper(root.left);
            int[] right = helper(root.right);
            res[1] = left[0] + right[0];
            res[0] = Math.max(res[1], left[1] + right[1] + root.val);
        }

        return res;
    }
}
