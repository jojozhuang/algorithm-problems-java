package johnny.leetcode.algorithm;

import java.util.Stack;
import johnny.algorithm.common.TreeNode;

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
    // inorder, iterative
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        int count = 0;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            count++;
            if (count == k) {
                return curr.val;
            }
            curr = curr.right;
        }
        
        return Integer.MIN_VALUE;
    }
}
