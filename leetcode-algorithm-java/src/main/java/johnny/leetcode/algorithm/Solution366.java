package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Find Leaves of Binary Tree.
 * Given a binary tree, find all leaves and then remove those leaves.
 * Then repeat the previous steps until the tree is empty.
 * <p>
 * Example:
 * Given binary tree
 * 1
 * / \
 * 2   3
 * / \
 * 4   5
 * Returns [4, 5, 3], [2], [1].
 * <p>
 * <p>
 * Explanation:
 * 1. Remove the leaves [4, 5, 3] from the tree
 * <p>
 * 1
 * /
 * 2
 * 2. Remove the leaf [2] from the tree
 * <p>
 * 1
 * 3. Remove the leaf [1] from the tree
 * <p>
 * []
 * Returns [4, 5, 3], [2], [1].
 *
 * @author Johnny
 */
public class Solution366 {
    //http://www.cnblogs.com/grandyang/p/5616158.html
    //https://discuss.leetcode.com/topic/49194/10-lines-simple-java-solution-using-recursion-with-explanation
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        height(root, ans);
        return ans;
    }

    private int height(TreeNode root, List<List<Integer>> ans) {
        if (root == null) {
            return -1;
        }

        int level = 1 + Math.max(height(root.left, ans), height(root.right, ans));
        if (ans.size() < level + 1) {
            ans.add(new ArrayList<>());
        }
        ans.get(level).add(root.val);
        return level;
    }

    public List<List<Integer>> findLeaves3(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        while (root != null) {
            List<Integer> leaves = new ArrayList<>();
            root = remove(root, leaves);
            res.add(leaves);
        }
        return res;
    }

    private TreeNode remove(TreeNode node, List<Integer> leaves) {
        if (node == null) {
            return null;
        }
        if (node.left == null && node.right == null) {
            leaves.add(node.val);
            return null;
        }
        node.left = remove(node.left, leaves);
        node.right = remove(node.right, leaves);
        return node;
    }
}
