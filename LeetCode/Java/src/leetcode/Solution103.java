/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import leetcode.common.TreeNode;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Binary Tree Zigzag Level Order Traversal.
 * Given a binary tree, return the zigzag level order traversal of its nodes' 
 * values. (ie, from left to right, then right to left for the next level and 
 * alternate between).
 * 
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its zigzag level order traversal as:
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 * confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 * 
 * @author Johnny
 */
public class Solution103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Stack<Integer> stackLevel = new Stack<Integer>();
        queue.offer(root);
        boolean leftToRight = true;
        
        while(!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int size = queue.size();
            for (int ix = 0; ix < size; ix++) {
                TreeNode node = queue.poll();
                if (leftToRight) {
                    level.add(node.val);
                }
                else {
                    stackLevel.push(node.val);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }                    
            }
            if (leftToRight) {
                result.add(level);
            }
            else {
                while(!stackLevel.isEmpty()) {
                    level.add(stackLevel.pop());
                }
                result.add(level);
            }
            leftToRight = !leftToRight;
        }
        return result;
    }  
}
