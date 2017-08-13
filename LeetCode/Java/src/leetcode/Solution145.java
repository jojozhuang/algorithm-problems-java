/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.TreeNode;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * Binary Tree Postorder Traversal.
 * Given a binary tree, return the postorder traversal of its nodes' values.
 * 
 * For example:
 * Given binary tree {1,#,2,3},
 *    1
 *     \
 *      2
 *     /
 *    3
 * return [3,2,1].
 * 
 * Note: Recursive solution is trivial, could you do it iteratively?
 * 
 * @author Johnny
 */
public class Solution145 {
    // divide and conquer
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        
        if(root == null) {
            return res;
        }
        
        List<Integer> left = postorderTraversal(root.left);
        List<Integer> right = postorderTraversal(root.right);
        
        res.addAll(left);
        res.addAll(right);
        res.add(root.val);
        return res;
    }
    
    // reverse mid->right-left => left-right-mid
    public List<Integer> postorderTraversal3(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        
        if (root == null) {
            return res;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        Collections.reverse(res);
        
        return res;
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        
        if (root == null) {
            return res;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        
        while(!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (node.left == null) {
                if (node.right != null) {
                    stack.push(node.right);
                    node.right = null;
                } else {
                    res.add(node.val);
                    stack.pop();
                }
            } else {
                if (node.right != null) {
                    stack.push(node.right);
                    node.right = null;
                } 
                stack.push(node.left);
                node.left = null;
            }            
        }
        
        return res;
    }
    private List<Integer> postorderTraversal4(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        
        if (root == null) {
            return result;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode prev = null;
        TreeNode curr = root;
        
        stack.push(root);
        while(!stack.empty()) {
            curr = stack.peek();
            if (prev == null || prev.left == curr || prev.right == curr) { //Traverse down the tree
                if (curr.left != null) {
                    stack.push(curr.left);
                } else if (curr.right != null) {
                    stack.push(curr.right);
                }
            }
            else if (curr.left == prev) { // Traverse up the tree from the left
                if (curr.right != null) {
                    stack.push(curr.right);
                }
            }
            else { // Traverse up the tree from the right
                result.add(curr.val);
                stack.pop();
            }
            prev = curr;
        }
        return result;
    }    
}
