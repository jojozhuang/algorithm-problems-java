package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Binary Tree Right Side View.
 * Given a binary tree, imagine yourself standing on the right side of it,
 * return the values of the nodes you can see ordered from top to bottom.
 * <p>
 * For example:
 * Given the following binary tree,
 * 1            ---
 * /   \
 * 2     3         ---
 * \     \
 * 5     4       ---
 * You should return [1, 3, 4].
 *
 * @author Johnny
 */
public class Solution199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        rightView(root, result, 0);
        return result;
    }

    public void rightView(TreeNode curr, List<Integer> result, int currDepth) {
        if (curr == null) {
            return;
        }
        if (currDepth == result.size()) {
            result.add(curr.val);
        }

        rightView(curr.right, result, currDepth + 1);
        rightView(curr.left, result, currDepth + 1);

    }

    public List<Integer> rightSideView3(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (i == size - 1) {
                    res.add(node.val);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return res;
    }

    public List<Integer> rightSideView2(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }

        List<Integer> left = rightSideView2(root.left);
        List<Integer> right = rightSideView2(root.right);

        res.add(root.val);
        if (right.size() > 0) {
            res.addAll(right);
        }

        if (left.size() > right.size()) {
            for (int i = right.size(); i < left.size(); i++) {
                res.add(left.get(i));
            }
        }

        return res;
    }
}
