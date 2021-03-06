package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Average of Levels in Binary Tree
 * <p>
 * Given a non-empty binary tree, return the average value of the nodes on each
 * level in the form of an array.
 * <p>
 * Example 1:
 * Input:
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * <p>
 * Output: [3, 14.5, 11]
 * <p>
 * Explanation:
 * The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on
 * level 2 is 11. Hence return [3, 14.5, 11].
 * <p>
 * Note:
 * The range of node's value is in the range of 32-bit signed integer.
 *
 * @author Johnny
 */
public class Solution637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ans.add(sum / size);
        }

        return ans;
    }
}
