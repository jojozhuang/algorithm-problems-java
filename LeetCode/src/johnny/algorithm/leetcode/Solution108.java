package johnny.algorithm.leetcode;

import java.util.Arrays;
import johnny.algorithm.leetcode.common.TreeNode;

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
                
        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid + 1, nums.length);
        
        root.left = sortedArrayToBST(left);
        root.right = sortedArrayToBST(right);
        
        return root;
    }
}
