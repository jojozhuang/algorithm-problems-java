package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.Stack;

/**
 * Recover Binary Search Tree.
 * <p>
 * Two elements of a binary search tree (BST) are swapped by mistake.
 * <p>
 * Recover the tree without changing its structure.
 * <p>
 * Note:
 * A solution using O(n) space is pretty straight forward. Could you devise a constant space solution?
 * confused what "{1,#,2,3}" means? read more on how binary tree is serialized on OJ.
 *
 * @author Johnny
 */
public class Solution099 {
    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = null;

    public void recoverTree(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root);
        if (first != null && second != null) {
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        if (prev == null) {
            prev = root;
        } else {
            if (root.val < prev.val) { // inorder, current must be larger than previous
                if (first == null) {
                    first = prev;
                }
                second = root;
            }
            prev = root;
        }

        inorder(root.right);
    }

    //https://leetcode.com/discuss/90848/java-easy-iterative-o-n-space-and-time-solution
    public void recoverTree2(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode first, second, prev;
        first = second = prev = null;//initialized to null to check if has been assigned value before
        Stack<TreeNode> stack = new Stack<>();
        pushLeft(stack, root);
        while (!stack.isEmpty()) {
            root = stack.pop();//root is current node
            pushLeft(stack, root.right);
            if (prev != null && prev.val > root.val) {
                if (first == null) {
                    first = prev;//first gets updated for the first time only
                }
                second = root;// second gets updated every time prev>root
            }
            prev = root;
        }
        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;
    }

    private void pushLeft(Stack<TreeNode> stack, TreeNode root) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }
}
