package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * Subtree of Another Tree
 * <p>
 * Given two non-empty binary trees s and t, check whether tree t has exactly
 * the same structure and node values with a subtree of s. A subtree of s is a
 * tree consists of a node in s and all of this node's descendants. The tree s
 * could also be considered as a subtree of itself.
 * <p>
 * Example 1:
 * Given tree s:
 * <p>
 * 3
 * / \
 * 4   5
 * / \
 * 1   2
 * <p>
 * Given tree t:
 * 4
 * / \
 * 1   2
 * Return true, because t has the same structure and node values with a subtree of s.
 * <p>
 * Example 2:
 * Given tree s:
 * <p>
 * 3
 * / \
 * 4   5
 * / \
 * 1   2
 * /
 * 0
 * <p>
 * Given tree t:
 * 4
 * / \
 * 1   2
 * Return false.
 *
 * @author Johnny
 */
public class Solution572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }

        if (isSame(s, t)) {
            return true;
        }

        if (isSubtree(s.left, t)) {
            return true;
        }

        if (isSubtree(s.right, t)) {
            return true;
        }

        return false;
    }

    private boolean isSame(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 != null) {
            return false;
        }

        if (t1 != null && t2 == null) {
            return false;
        }

        if (t1 == null && t2 == null) {
            return true;
        }

        if (t1.val != t2.val) {
            return false;
        }

        return isSame(t1.left, t2.left) && isSame(t1.right, t2.right);
    }
}
