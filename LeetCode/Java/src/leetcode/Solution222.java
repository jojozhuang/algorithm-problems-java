/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import leetcode.common.TreeNode;

/**
 * Count Complete Tree Nodes.
 * 
 * Given a complete binary tree, count the number of nodes.
 * 
 * Definition of a complete binary tree from Wikipedia:
 * In a complete binary tree every level, except possibly the last, is completely
 * filled, and all nodes in the last level are as far left as possible. It can 
 * have between 1 and 2h nodes inclusive at the last level h.
 * 
 * @author Johnny
 */
public class Solution222 {
    //timeout
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int high1 = 0, high2 = 0;
        TreeNode left = root, right = root;
        while(left != null) {
            high1++;
            left = left.left;
        }
        while(right != null) {
            high2++;
            right = right.right;
        }
        if (high1 == high2) {
            return (int)Math.pow(2, high1) - 1;
        }
        
        return countNodes(root.left) + countNodes(root.right) + 1;        
    }
    //timeout
    public int countNodes2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int count = 0;
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            count++;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        
        return count;
    }
}
