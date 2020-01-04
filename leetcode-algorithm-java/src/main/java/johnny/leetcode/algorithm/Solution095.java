package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Unique Binary Search Trees II.
 * Given n, generate all structurally unique BST's (binary search trees) that
 * store values 1...n.
 * <p>
 * For example,
 * Given n = 3, your program should return all 5 unique BST's shown below.
 * <p>
 * 1         3     3      2      1
 * \       /     /      / \      \
 * 3     2     1      1   3      2
 * /     /       \                 \
 * 2     1         2                 3
 * confused what "{1,#,2,3}" means? read more on how binary tree is serialized on OJ.
 *
 * @author Johnny
 */
public class Solution095 {
    public List<TreeNode> generateTrees(int n) {
        if (n <= 0) {
            return new ArrayList<TreeNode>();
        }

        return helper(1, n);
    }

    private List<TreeNode> helper(int start, int end) {
        List<TreeNode> ans = new ArrayList<>();
        if (start > end) {
            ans.add(null);
            return ans;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> lefts = helper(start, i - 1);
            List<TreeNode> rights = helper(i + 1, end);
            for (TreeNode left : lefts) {
                for (TreeNode right : rights) {
                    TreeNode node = new TreeNode(i);
                    node.left = left;
                    node.right = right;
                    ans.add(node);
                }
            }
        }

        return ans;
    }
}
