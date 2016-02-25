/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.TreeNode;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Binary Tree Inorder Traversal.
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * 
 * For example:
 * Given binary tree {1,#,2,3},
 *    1
 *     \
 *      2
 *     /
 *    3
 * return [1,3,2].
 * 
 * Note: Recursive solution is trivial, could you do it iteratively?
 * 
 * confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 * 
 * @author Johnny
 */
public class Solution094 {
    //divide and conquer
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        
        if (root == null) {
            return result;
        }
        
        List<Integer> left = inorderTraversal(root.left);
        List<Integer> right = inorderTraversal(root.right);
        
        result.addAll(left);
        result.add(root.val);
        result.addAll(right);
        
        return result;        
    }
    
     public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        
        if (root == null) {
            return result;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        
        while(!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (node.left == null) {
                result.add(node.val);
                stack.pop();
                if (node.right != null) {
                    stack.push(node.right);
                    node.right = null;
                }
            }
             else {
                stack.push(node.left);
                node.left = null;
            }
        }
        
        return result;
     }    
 
    // stack
    private List<Integer> inorderTraversal3(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        
        if (root == null) {
            return result;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curr = root;
        
        while(curr != null || !stack.empty()) {
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            result.add(curr.val);
            curr = curr.right;
        }
        return result;
    }    
}
