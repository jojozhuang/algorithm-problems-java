package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Find Largest Value in Each Tree Row
 * <p>
 * You need to find the largest value in each row of a binary tree.
 * <p>
 * Example:
 * Input:
 * <p>
 * 1
 * / \
 * 3   2
 * / \   \
 * 5   3   9
 * <p>
 * Output: [1, 3, 9]
 *
 * @author Johnny
 */
public class Solution515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helper(root, res, 0);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res, int depth) {
        if (root == null) {
            return;
        }
        if (depth == res.size()) {
            //expand list size
            res.add(root.val);
        } else {
            //or set value
            res.set(depth, Math.max(res.get(depth), root.val));
        }
        helper(root.left, res, depth + 1);
        helper(root.right, res, depth + 1);
    }
}
