/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Stack;
import leetcode.common.TreeNode;

/**
 * Kth Smallest Element in a BST.
 * 
 * Given a binary search tree, write a function kthSmallest to find the kth 
 * smallest element in it.
 * 
 * Note: 
 * You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
 * 
 * Follow up:
 * What if the BST is modified (insert/delete operations) often and you need to
 * find the kth smallest frequently? How would you optimize the kthSmallest routine?
* 
 * @author Johnny
 */
public class Solution230 {
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        // inorder
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
        
        int count = 0;
        TreeNode node = null;
        while(count < k && !stack.isEmpty()) {            
            node = stack.pop();
            count++;
            TreeNode right = node.right;
            while(right != null) {
                stack.push(right);
                right = right.left;
            }
        }
        return node.val;
    }
}
