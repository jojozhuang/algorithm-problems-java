package johnny.leetcode.algorithm;

import java.util.Arrays;
import johnny.algorithm.common.TreeNode;

/**
 * Convert Sorted Array to Binary Search Tree.
 * Given an array where elements are sorted in ascending order, convert it to 
 * a height balanced BST.
 * 
 * @author Johnny
 */
public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);
        return root;
    }
    
    public TreeNode sortedArrayToBST2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
                
        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid + 1, nums.length);
        
        root.left = sortedArrayToBST(left);
        root.right = sortedArrayToBST(right);
        
        return root;
    }
}
