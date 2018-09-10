package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.TreeNode;
import java.util.List;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
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
        LinkedList<Integer> res = new LinkedList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;
        while (!stack.isEmpty() || curr != null) {
            if (curr != null) {
                stack.push(curr);
                res.addFirst(curr.val);     // Reverse the process of preorder
                curr = curr.right;          // Reverse the process of preorder
            } else {
                TreeNode node = stack.pop();
                curr = node.left;           // Reverse the process of preorder
            }
        }
        return res;
    }
    public List<Integer> postorderTraversal6(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        
        if (root == null) {
            return res;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (node.left == null && node.right == null) {
                node = stack.pop();
                res.add(node.val);
                continue;
            }
            
            if (node.right != null) {
                stack.push(node.right);
                node.right = null;
            }
            if (node.left != null) {
                stack.push(node.left);
                node.left = null;
            }
        }
        
        return res;
    }
    // Recursion
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
    
    // reverse mid->right-left => left-right-mid, similar with preorder
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
    
    public List<Integer> postorderTraversal5(TreeNode root) {
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
}
