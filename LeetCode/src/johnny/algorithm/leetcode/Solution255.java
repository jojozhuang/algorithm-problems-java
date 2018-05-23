package johnny.algorithm.leetcode;

import java.util.Stack;

/**
 * Verify Preorder Sequence in Binary Search Tree.
 * 
 * Given an array of numbers, verify whether it is the correct preorder 
 * traversal sequence of a binary search tree.
 * 
 * You may assume each number in the sequence is unique.
 * Follow up:
 * Could you do it using only constant space complexity?
 * 
 * @author Johnny
 */
public class Solution255 {
    // Stack
    public boolean verifyPreorder(int[] preorder) {
        if (preorder == null || preorder.length == 0) {
            return true;
        }
        int low = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for (int num : preorder) {
            if (num < low) {
                return false;
            }
            while (!stack.isEmpty() && num > stack.peek()) {
                low = stack.pop();
            }
            stack.push(num);
        }
        
        return true;
    }
    
    // Recursive
    public boolean verifyPreorder2(int[] preorder) {
        if (preorder == null || preorder.length == 0) {
            return false;
        }
        
        return helper(preorder, 0, preorder.length - 1, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    
    private boolean helper(int[] preorder, int start, int end, int max, int min) {
        if (start > end) {
            return true;
        }
        
        int root = preorder[start];
        if (root < min || root > max) {
            return false;
        }
        
        int rightindex = start;
        while (rightindex <= end && preorder[rightindex] <= root) {
            rightindex++;
        }
        boolean left = helper(preorder, start + 1, rightindex - 1, root, min);
        boolean right = helper(preorder, rightindex, end, max, root);
        return left && right;
    }
}
