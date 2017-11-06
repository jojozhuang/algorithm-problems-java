/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import johnny.algorithm.leetcode.common.TreeNode;

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
    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        
        int diff = Integer.MAX_VALUE;
        
        List<Integer> list = inorderTraversal(root);
        Integer[] array = new Integer[list.size()];
        array = list.toArray(array);
        for (int i = 1; i < array.length; i++) {
            diff = Math.min(array[i] - array[i - 1], diff);
        }
        
        return diff;        
    }
    
    private List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        
        if (root == null) {
            return result;
        }
        
        List<Integer> left = inorderTraversal(root.left);
        List<Integer> right = inorderTraversal(root.right);
        
        result.addAll(left);
        result.add(root.val);
        result.addAll(right);
        
        return result;        
    }
}