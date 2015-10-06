/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.TreeNode;
import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

/**
 * Binary Tree Preorder Traversal.
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * 
 * For example:
 * Given binary tree {1,#,2,3},
 *    1
 *     \
 *      2
 *     /
 *    3
 * return [1,2,3].
 * 
 * Note: Recursive solution is trivial, could you do it iteratively?
 * 
 * @author Johnny
 */
public class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        //Divide and conquer
        //return preorderDivideConquer(root);
        
        //Recursion
        //List<Integer> result = new ArrayList<Integer>();
        //preorderIterate(root, result);
        //return result;   
        
        //No recursion, use stack
        return preorderStack(root);
    }
    
    private List<Integer> preorderStack(TreeNode root) {        
        List<Integer> result = new ArrayList<Integer>();
        
        if (root == null) {
            return result;
        }
            
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.empty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        
        return result;
    }
    private void preorderIterate(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        
        list.add(root.val);
        preorderIterate(root.left, list);
        preorderIterate(root.right, list);        
    }
    
    private List<Integer> preorderDivideConquer(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }
        
        List<Integer> left = preorderDivideConquer(root.left);
        List<Integer> right = preorderDivideConquer(root.right);
        
        result.add(root.val);
        result.addAll(left);
        result.addAll(right);
        return result;
    }
}
