/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import johnny.algorithm.leetcode.common.TreeNode;

/**
 * Closest Binary Search Tree Value II.
 * Given a non-empty binary search tree and a target value, find k values 
 * in the BST that are closest to the target.
 * 
 * Note:
 * 
 * Given target value is a floating point.
 * You may assume k is always valid, that is: k ≤ total nodes.
 * You are guaranteed to have only one unique set of k values in the BST that 
 * are closest to the target.
 *  
 * 
 * Follow up:
 * Assume that the BST is balanced, could you solve it in less than O(n) 
 * runtime (where n = total nodes)?
 * 
 * Hint:
 * 
 * Consider implement these two helper functions:
 * getPredecessor(N), which returns the next smaller node to N.
 * getSuccessor(N), which returns the next larger node to N.
 * Try to assume that each node has a parent pointer, it makes the problem much
 * easier.
 * Without parent pointer we just need to keep track of the path from the root
 * to the current node using a stack.
 * You would need two stacks to track the path in finding predecessor and 
 * successor node separately.
 * 
 * @author Johnny
 */
public class Solution272 {
    //http://www.cnblogs.com/jcliBlogger/p/4771342.html
    //https://segmentfault.com/a/1190000003797291
    public List<Integer> closestKValues(TreeNode root, double target, int k) {
        if (root == null) {
            return new ArrayList<Integer>();
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(root != null){
            stack.push(root);
            root = root.left;
        }
        while (!stack.isEmpty()){
            TreeNode curr = stack.pop();
            if(queue.size() < k){
                queue.offer(curr.val);
            } else {
                int first = queue.peek();
                if(Math.abs(first - target) > Math.abs(curr.val - target)){
                    queue.poll();
                    queue.offer(curr.val);
                } else {
                    break;
                }
            }

            if(curr.right != null){
                curr = curr.right;
                while(curr != null){
                    stack.push(curr);
                    curr = curr.left;
                }
            }
        }

        return (List<Integer>)queue;
    }
}
