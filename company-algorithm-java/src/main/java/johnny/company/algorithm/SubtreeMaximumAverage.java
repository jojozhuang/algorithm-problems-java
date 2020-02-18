package johnny.company.algorithm;

import johnny.algorithm.common.NaryNode;

/**
 * Subtree with Maximum Average
 *
 * Given an N-ary tree, find the subtree with the maximum average. Return the root of the subtree.
 * A subtree of a tree is the node which have at least 1 child plus all its descendants. The average value of a subtree is the sum of its values, divided by the number of nodes.
 *
 * Example 1:
 *
 * Input:
 *         20
 *      /     \
 *     12     18
 *   / | \   / \
 * 11  2  3 15  8
 *
 * Output: 18
 * Explanation:
 * There are 3 nodes which have children in this tree:
 * 12 => (11 + 2 + 3 + 12) / 4 = 7
 * 18 => (18 + 15 + 8) / 3 = 13.67
 * 20 => (12 + 11 + 2 + 3 + 18 + 15 + 8 + 20) / 8 = 11.125
 *
 * 18 has the maximum average so output 18.
 * Similar questions:
 *
 * https://leetcode.com/problems/maximum-average-subtree
 *
 * https://leetcode.com/discuss/interview-question/349617
 */
public class SubtreeMaximumAverage {
    double max = Double.NEGATIVE_INFINITY;
    NaryNode node = null;
    public NaryNode maximumAverage(NaryNode root) {
        max = Double.NEGATIVE_INFINITY;
        node = null;
        helper(root);
        return node;
    }

    // int[], 0, sum, 1, number of nodes
    private int[] helper(NaryNode root) {
        if (root == null) {
            return new int[]{0,0};
        }

        if (root.children == null || root.children.size() == 0) {
            return new int[]{root.val, 1};
        }

        int sum = root.val;
        int count = 1;
        for (int i = 0; i < root.children.size(); i++) {
            int[] child = helper(root.children.get(i));
            sum += child[0];
            count += child[1];
        }
        double average = (double)sum/count;
        if (count > 1 && average > max) {
            max = average;
            node = root;
        }
        return new int[]{sum, count};
    }
}
