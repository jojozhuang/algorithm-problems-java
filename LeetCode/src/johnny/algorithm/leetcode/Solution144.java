package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.TreeNode;
import java.util.List;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

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
        List<Integer> ans = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;
        while (!stack.isEmpty() || curr != null) {
            if (curr != null) {
                stack.push(curr);
                ans.add(curr.val);  // Add before going to children
                curr = curr.left;
            } else {
                TreeNode node = stack.pop();
                curr = node.right;
            }
        }
        return ans;
    }
    
    // create stack
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        
        if (root == null) {
            return ans;
        }
            
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode node = stack.pop();
            ans.add(node.val);
            
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        
        return ans;
    }

    // Divide and conquer (recursion)
    public List<Integer> preorderTraversal3(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        if (root == null) {
            return ans;
        }
        
        List<Integer> left = preorderTraversal(root.left);
        List<Integer> right = preorderTraversal(root.right);
        
        ans.add(root.val);
        ans.addAll(left);
        ans.addAll(right);
        return ans;
    }
}
