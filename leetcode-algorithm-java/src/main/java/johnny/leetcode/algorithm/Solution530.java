package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import johnny.leetcode.algorithm.common.TreeNode;

/**
 * Minimum Absolute Difference in BST
 * 
 * Given a binary search tree with non-negative values, find the minimum 
 * absolute difference between values of any two nodes.
 * 
 * Example:
 * 
 * Input:
 * 
 *  1
 *   \
 *    3
 *   /
 *  2
 * 
 * Output:
 * 1
 * 
 * Explanation:
 * The minimum absolute difference is 1, which is the difference between 2 and 
 * 1 (or between 2 and 3).
 * 
 * Note: There are at least two nodes in this BST.
 * 
 * @author Johnny
 */
public class Solution530 {
    int ans = Integer.MAX_VALUE;
    int prev = 0;
    boolean isFirst = true;
    // recursive
    public int getMinimumDifference(TreeNode root) {
        ans = Integer.MAX_VALUE;
        isFirst = true;
        inorderHelper(root);
        return ans;
    }
    private void inorderHelper(TreeNode root) {
        if (root == null) {
            return;
        }
        
        inorderHelper(root.left);
        if (isFirst) {
            isFirst = false;
        } else {
            ans = Math.min(ans, root.val - prev);
        }
        prev = root.val;
        inorderHelper(root.right);
    }
    // inorder, iterative, time: O(n): space: O(1)
    public int getMinimumDifference3(TreeNode root) {
        int ans = Integer.MAX_VALUE;
        int prev = root.val;
        boolean isFirst = true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            if (isFirst) {
                isFirst = false;
            } else {
                ans = Math.min(ans, curr.val - prev);
            }
            prev = curr.val;
            curr = curr.right;
        }
        
        return ans;
    }
    // inorder, time: O(n), space: O(n)
    public int getMinimumDifference2(TreeNode root) {
        List<Integer> list = inorder(root);
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            ans = Math.min(ans, list.get(i) - list.get(i-1));
        }
        return ans;
    }
    
    private List<Integer> inorder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        
        List<Integer> left = inorder(root.left);
        List<Integer> right = inorder(root.right);
        list.addAll(left);
        list.add(root.val);
        list.addAll(right);
        return list;
    }
}