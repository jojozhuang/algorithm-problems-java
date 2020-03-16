package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 1382. Balance a Binary Search Tree
 *
 * Given a binary search tree, return a balanced binary search tree with the same node values.
 *
 * A binary search tree is balanced if and only if the depth of the two subtrees of every node never differ by more than 1.
 *
 * If there is more than one answer, return any of them.
 *
 * Example 1:
 * 1                   2
 *  \                /  \
 *   2              1    3
 *    \      =>           \
 *     3                   4
 *      \
 *       4
 * Input: root = [1,null,2,null,3,null,4,null,null]
 * Output: [2,1,3,null,null,null,4]
 * Explanation: This is not the only correct answer, [3,1,4,null,2,null,null] is also correct.
 *
 * Constraints:
 *
 * The number of nodes in the tree is between 1 and 10^4.
 * The tree nodes will have distinct values between 1 and 10^5.
 *
 */
public class SolutionA1382 {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = inorder(root);
        return build(list);
    }

    private List<Integer> inorder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        list.addAll(inorder(root.left));
        list.add(root.val);
        list.addAll(inorder(root.right));
        return list;
    }

    private TreeNode build(List<Integer> list) {
        return helper(list, 0, list.size() - 1);
    }

    private TreeNode helper(List<Integer> list, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = helper(list, start, mid - 1);
        root.right = helper(list, mid + 1, end);
        return root;
    }
}
