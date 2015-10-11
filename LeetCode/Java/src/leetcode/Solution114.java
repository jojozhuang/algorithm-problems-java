/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.TreeNode;

/**
 * Flatten Binary Tree to Linked List.
 * Given a binary tree, flatten it to a linked list in-place.
 * 
 * For example,
 * Given
 * 
 *          1
 *         / \
 *        2   5
 *       / \   \
 *      3   4   6
 * 
 * The flattened tree should look like:
 *    1
 *     \
 *      2
 *       \
 *        3
 *         \
 *          4
 *           \
 *            5
 *             \
 *              6
 * 
 * @author Johnny
 */
public class Solution114 {    
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        
        // flatten left
        flatten(root.left);
        // flatten right
        flatten(root.right);
        
        if (root.left != null) {
            TreeNode tail = root.left;
            while(tail.right != null) {
                tail = tail.right;
            }
            TreeNode right = root.right;
            root.right = root.left;
            tail.right = right;
            root.left = null;
        }        
    }
}
