package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * 993. Cousins in Binary Tree
In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.

Two nodes of a binary tree are cousins if they have the same depth, but have different parents.

We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.

Return true if and only if the nodes corresponding to the values x and y are cousins.

Example 1:

Input: root = [1,2,3,4], x = 4, y = 3
Output: false
Example 2:

Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
Output: true
Example 3:

Input: root = [1,2,3,null,4], x = 2, y = 3
Output: false
 
Note:

The number of nodes in the tree will be between 2 and 100.
Each node has a unique integer value from 1 to 100.
 * @author Johnny
 */
public class Solution993 {
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) {
            return false;
        }

        if (root.val == x || root.val == y) {
            return false;
        }

        int[] find1 = helper(root.left, root, x, 0);
        if (find1 == null) {
            find1 = helper(root.right, root, x, 0);
        }

        int[] find2 = helper(root.left, root, y, 0);
        if (find2 == null) {
            find2 = helper(root.right, root, y, 0);
        }

        if (find1[0] != find2[0] && find1[1] == find2[1]) {
            return true;
        }

        return false;

    }

    private int[] helper(TreeNode root, TreeNode parent, int target, int depth) {
        if (root == null) {
            return null;
        }

        if (root.val == target) {
            return new int[]{parent.val, depth};
        }

        int[] left = helper(root.left, root, target, depth + 1);
        if (left != null) {
            return left;
        }
        int[] right = helper(root.right, root, target, depth + 1);
        if (right != null) {
            return right;
        }

        return null;
    }
}
