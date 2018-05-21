package johnny.algorithm.leetcode;

import java.util.Deque;
import java.util.LinkedList;

import johnny.algorithm.leetcode.common.TreeNode;

/**
 * 654. Maximum Binary Tree
 * Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

The root is the maximum number in the array.
The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
Construct the maximum tree by the given array and output the root node of this tree.

Example 1:
Input: [3,2,1,6,0,5]
Output: return the tree root node representing the following tree:

      6
    /   \
   3     5
    \    / 
     2  0   
       \
        1
Note:
The size of the given array will be in the range [1,1000].
 * @author Johnny
 */
public class Solution654 {
    // Stack, O(n)
    public TreeNode constructMaximumBinaryTree2(int[] nums) {
        Deque<TreeNode> stack = new LinkedList<>();
        for(int i = 0; i < nums.length; i++) {
            TreeNode curr = new TreeNode(nums[i]);
            while(!stack.isEmpty() && stack.peek().val < nums[i]) {
                curr.left = stack.pop();
            }
            if(!stack.isEmpty()) {
                stack.peek().right = curr;
            }
            stack.push(curr);
        }
        
        return stack.isEmpty() ? null : stack.removeLast();
    }
    
    // Naive, divide and conquer,O(n*l), l is the depth of tree.
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return helper(nums, 0, nums.length - 1);
    }
    
    private TreeNode helper(int[] nums, int start, int end) {
        if (start < 0 || end >= nums.length || start > end) {
            return null;
        }
        
        int indexMax = getLarget(nums, start, end);
        if (indexMax == -1) {
            return null;
        }
        TreeNode root = new TreeNode(nums[indexMax]);
        root.left = helper(nums, start, indexMax - 1);
        root.right = helper(nums, indexMax+1, end);
        
        return root;
    }
    
    private int getLarget(int[] nums, int start, int end) {
        if (start < 0 || end >= nums.length || start > end) {
            return -1;
        }
        
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = start; i <= end; i++) {
            if (nums[i] > max) {
                index = i;
                max = nums[i];
            }
        }
        return index;
    }
}
