/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import leetcode.common.TreeNode;

/**
 * Path Sum III
 * 
 * You are given a binary tree in which each node contains an integer value.
 * 
 * Find the number of paths that sum to a given value.
 * The path does not need to start or end at the root or a leaf, but it must go 
 * downwards (traveling only from parent nodes to child nodes).
 * 
 * The tree has no more than 1,000 nodes and the values are in the 
 * range -1,000,000 to 1,000,000.
 * 
 * Example:
 * 
 * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
 * 
 *       10
 *      /  \
 *     5   -3
 *    / \    \
 *   3   2   11
 *  / \   \
 * 3  -2   1
 *
 * Return 3. The paths that sum to 8 are:
 *
 * 1.  5 -> 3
 * 2.  5 -> 2 -> 1
 * 3. -3 -> 11
 * 
 * @author Johnny
 */
public class Solution437 {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        
        return helper(root, sum, sum);
    }
    
    private int helper(TreeNode root, int sum, int originalSum) {
        if (root == null) {
            return 0;
        }
        
        if ((originalSum >= 0 && sum < 0) ||
            (originalSum < 0 && sum >= 0)) {
            return helper(root, originalSum, originalSum);
        }
        
        int count = 0;
        if (root.val == sum) {
            count++;
        }
        
        if (root.val == originalSum && sum != originalSum) {
            count++;
        }
        
        int left = helper(root.left, sum - root.val, originalSum);
        int right = helper(root.right, sum - root.val, originalSum);
        
        return left + right + count;
    }  
}
