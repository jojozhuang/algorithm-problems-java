/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.TreeNode;

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
    public int closestValue(TreeNode root, double target) {
        return 0;
    }
}
