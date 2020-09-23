package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 1022. Sum of Root To Leaf Binary Numbers
 * {@code Given a binary tree, each node has value 0 or 1.  Each root-to-leaf path represents a binary number starting with the most significant bit.  For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.}
 * <p>
 * For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.
 * <p>
 * Return the sum of these numbers.
 * <p>
 * Example 1:
 * Input: [1,0,1,0,1,0,1]
 * Output: 22
 * Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
 * <p>
 * Note:
 * <p>
 * The number of nodes in the tree is between 1 and 1000.
 * node.val is 0 or 1.
 * The answer will not exceed 2^31 - 1.
 *
 * @author Johnny
 */
public class SolutionA1022 {
    public int sumRootToLeaf2(TreeNode root) {
        List<String> list = new ArrayList<>();
        helper(root, "", list);

        int sum = 0;
        for (String str : list) {
            int val = 0;
            for (int i = str.length() - 1; i >= 0; i--) {
                val += (str.charAt(i) - '0') << (str.length() - i - 1);
            }
            sum += val;
        }

        return sum;
    }

    private void helper(TreeNode root, String str, List<String> list) {
        if (root == null) {
            return;
        }

        str = str + root.val;
        if (root.left == null && root.right == null) {
            list.add(str);
            return;
        }

        helper(root.left, str, list);
        helper(root.right, str, list);
    }

    public int sumRootToLeaf(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return helper(root, 0);
    }

    private int helper(TreeNode root, int prev) {
        if (root == null) {
            return 0;
        }

        int curr = prev * 2 + root.val;
        if (root.left == null && root.right == null) {
            return curr;
        }

        int left = helper(root.left, curr);
        int right = helper(root.right, curr);
        return left + right;
    }
}
