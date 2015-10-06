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
    public List<Integer> postorderTraversal(TreeNode root) {
        //Divide and conquer
        //return postorderDivideConquer(root);
        
        //Recursion
        //List<Integer> result = new ArrayList<Integer>();
        //postorderIterate(root, result);
        //return result;
        
        //No recursion, use stack
        return postorderStack(root);
    }
    
    private List<Integer> postorderStack(TreeNode root) {
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
    private void postorderIterate(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        
        postorderIterate(root.left, list);
        postorderIterate(root.right, list);
        list.add(root.val);
    }
    private List<Integer> postorderDivideConquer(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        
        if(root == null) {
            return result;
        }
        
        List<Integer> left = postorderDivideConquer(root.left);
        List<Integer> right = postorderDivideConquer(root.right);
        
        result.addAll(left);
        result.addAll(right);
        result.add(root.val);
        return result;
    }
}
