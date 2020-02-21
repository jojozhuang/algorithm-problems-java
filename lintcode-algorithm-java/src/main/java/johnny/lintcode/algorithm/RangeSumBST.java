package johnny.lintcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Range Sum of BST
 * Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
 *
 * The binary search tree is guaranteed to have unique values.
 *
 * The number of nodes in the tree is at most 10000.
 * The final answer is guaranteed to be less than 2^31.
 *
 * Have you met this question in a real interview?
 * Example
 * Example 1:
 *
 * Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
 * Output: 32
 * Example 2:
 *
 * Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
 * Output: 23
 *
 * @author Johnny
 */
public class RangeSumBST {
    /**
     * @param root: the root node
     * @param L: an integer
     * @param R: an integer
     * @return: the sum
     */
    public int rangeSumBST(TreeNode root, int L, int R) {
        int[] sum = new int[1];
        helper(root, L, R, sum);
        return sum[0];
    }

    private void helper(TreeNode root, int L, int R, int[] sum) {
        if (root == null) {
            return;
        }

        if (root.val >= L && root.val <= R) {
            sum[0] += root.val;
        }

        if (L < root.val) {
            helper(root.left, L, R, sum);
        }
        if (R > root.val) {
            helper(root.right, L, R, sum);
        }
    }
}
