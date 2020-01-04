package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * 156.Binary Tree Upside Down.
 * <p>
 * Given a binary tree where all the right nodes are either leaf nodes with a
 * sibling (a left node that shares the same parent node) or empty, flip it
 * upside down and turn it into a tree where the original right nodes turned
 * into left leaf nodes. Return the new root.
 * <p>
 * For example:
 * Given a binary tree {1,2,3,4,5},
 * 1
 * / \
 * 2  3
 * / \
 * 4 5
 * <p>
 * return the root of the binary tree [4,5,2,#,#,3,1].
 * 4
 * /  \
 * 5   2
 * / \
 * 3   1
 *
 * @author Johnny
 */
public class Solution156 {
    //https://lefttree.gitbooks.io/leetcode/content/binaryTree/binaryTreeUpsideDown.html
    //https://leetcode.com/discuss/44718/clean-java-solution
    //http://bangbingsyb.blogspot.com/2014/11/leetcode-binary-tree-upside-down.html
    //http://blog.csdn.net/whuwangyi/article/details/43186045
    public TreeNode upsideDownBinaryTree2(TreeNode root) {
        TreeNode curr = root;
        TreeNode next = null;
        TreeNode temp = null;
        TreeNode prev = null;

        while (curr != null) {
            next = curr.left;

            // swapping nodes now, need temp to keep the previous right child
            curr.left = temp;
            temp = curr.right;
            curr.right = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }

    public TreeNode upsideDownBinaryTree(TreeNode root) {
        if (root == null || root.left == null) {
            return root;
        }

        TreeNode newRoot = upsideDownBinaryTree(root.left);
        root.left.left = root.right;   // node 2 left children
        root.left.right = root;         // node 2 right children
        root.left = null;
        root.right = null;
        return newRoot;
    }
}
