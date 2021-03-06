package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * 776. Split BST
 * Given a Binary Search Tree (BST) with root node root, and a target value V, split the tree into two subtrees where one subtree has nodes that are all smaller or equal to the target value, while the other subtree has all nodes that are greater than the target value.  It's not necessarily the case that the tree contains a node with value V.
 * <p>
 * Additionally, most of the structure of the original tree should remain.  Formally, for any child C with parent P in the original tree, if they are both in the same subtree after the split, then node C should still have the parent P.
 * <p>
 * You should output the root TreeNode of both subtrees after splitting, in any order.
 * <p>
 * Example 1:
 * <p>
 * Input: root = [4,2,6,1,3,5,7], V = 2
 * Output: [[2,1],[4,3,6,null,null,5,7]]
 * Explanation:
 * Note that root, output[0], and output[1] are TreeNode objects, not arrays.
 * <p>
 * The given tree [4,2,6,1,3,5,7] is represented by the following diagram:
 * <p>
 * 4
 * /   \
 * 2      6
 * / \    / \
 * 1   3  5   7
 * <p>
 * while the diagrams for the outputs are:
 * <p>
 * 4
 * /   \
 * 3      6      and    2
 * / \           /
 * 5   7         1
 * Note:
 * <p>
 * The size of the BST will not exceed 50.
 * The BST is always valid and each node's value is different.
 *
 * @author Johnny
 */
public class Solution776 {
    public TreeNode[] splitBST(TreeNode root, int V) {
        TreeNode sP = new TreeNode(0), bP = new TreeNode(0);
        split(root, V, sP, bP);
        return new TreeNode[]{sP.right, bP.left};
    }

    private void split(TreeNode node, int v, TreeNode sP, TreeNode bP) {
        if (node == null) return;
        if (node.val <= v) {
            sP.right = node;
            TreeNode right = node.right;
            node.right = null;
            split(right, v, node, bP);
        } else {
            bP.left = node;
            TreeNode left = node.left;
            node.left = null;
            split(left, v, sP, node);
        }
    }
}
