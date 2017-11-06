/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;
import java.util.LinkedList;
import java.util.Queue;
import johnny.algorithm.leetcode.common.TreeNode;

/**
 * Invert Binary Tree.
 * Invert a binary tree.
 * 
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 
 * to
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 * 
 * @author Johnny
 * 
 */
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        // write your code here
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode right = node.right;
            node.right = node.left;
            node.left = right;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return root;
    }
    public TreeNode invertTree2(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        TreeNode left = invertTree2(root.right);
        TreeNode right = invertTree2(root.left);
        root.left = left;
        root.right = right;
        
        return root;
    }
}
