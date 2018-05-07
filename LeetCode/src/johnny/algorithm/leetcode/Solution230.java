package johnny.algorithm.leetcode;

import java.util.Stack;
import johnny.algorithm.leetcode.common.TreeNode;

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
            return Integer.MIN_VALUE;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        int count = 0;
        
        while(!stack.isEmpty() || p != null) {
            if(p != null) {
                stack.push(p);  // Just like recursion
                p = p.left;
                
            } else {
               TreeNode node = stack.pop();
               if(++count == k) return node.val; 
               p = node.right;
            }
        }
        
        return Integer.MIN_VALUE;
    }
    //inorder
    public int kthSmallest3(TreeNode root, int k) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        int count = 0;
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (node.left == null) {
                count++;
                stack.pop();
                if (count == k) {
                    return node.val;
                }
                if (node.right != null) {
                    stack.push(node.right);
                    node.right = null;
                }
            } else {
                stack.push(node.left);
                node.left = null;
            }
        }
        
        return Integer.MIN_VALUE;
    }
    
    public int kthSmallest2(TreeNode root, int k) {
        if (root == null) {
            return Integer.MIN_VALUE;
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
