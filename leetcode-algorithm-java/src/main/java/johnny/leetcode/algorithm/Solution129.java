package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Sum Root to Leaf Numbers.
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path
 * could represent a number.
 * <p>
 * An example is the root-to-leaf path {@code 1->2->3} which represents the number 123.
 * <p>
 * Find the total sum of all root-to-leaf numbers.
 * <p>
 * For example,
 * <p>
 * 1
 * / \
 * 2   3
 * {@code The root-to-leaf path 1->2 represents the number 12.}
 * {@code The root-to-leaf path 1->3 represents the number 13.}
 * <p>
 * Return the sum = 12 + 13 = 25.
 *
 * @author Johnny
 */
public class Solution129 {
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sum = 0;
        TreeNode curr;
        Stack<TreeNode> ws = new Stack<TreeNode>();
        ws.push(root);

        while (!ws.empty()) {
            curr = ws.pop();
            if (curr.right != null) {
                curr.right.val = curr.val * 10 + curr.right.val;
                ws.push(curr.right);
            }

            if (curr.left != null) {
                curr.left.val = curr.val * 10 + curr.left.val;
                ws.push(curr.left);
            }

            if (curr.left == null && curr.right == null) { // leaf node
                sum += curr.val;
            }
        }
        return sum;
    }

    public int sumNumbers3(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int num) {
        if (root == null) {
            return 0;
        }

        num = num * 10 + root.val;
        if (root.left == null && root.right == null) {
            return num;
        }

        return dfs(root.left, num) + dfs(root.right, num);
    }

    public int sumNumbers2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        List<String> list = helper(root);

        int sum = 0;
        for (String item : list) {
            sum += Integer.parseInt(item);
        }
        return sum;
    }

    private List<String> helper(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if (root == null) {
            return res;
        }

        List<String> left = helper(root.left);
        List<String> right = helper(root.right);

        if (left.size() == 0 && right.size() == 0) {
            res.add(String.valueOf(root.val));
            return res;
        }

        for (int i = 0; i < left.size(); i++) {
            res.add(String.valueOf(root.val) + left.get(i));
        }

        for (int i = 0; i < right.size(); i++) {
            res.add(String.valueOf(root.val) + right.get(i));
        }

        return res;
    }
}
