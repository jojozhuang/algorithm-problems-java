/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.TreeNode;

/**
 * House Robber III.
 * 
 * The thief has found himself a new place for his thievery again. There is only
 * one entrance to this area, called the "root." Besides the root, each house 
 * has one and only one parent house. After a tour, the smart thief realized 
 * that "all houses in this place forms a binary tree". It will automatically 
 * contact the police if two directly-linked houses were broken into on the same night.
 * 
 * Determine the maximum amount of money the thief can rob tonight without alerting the police.
 * 
 * Example 1:
 *      3
 *     / \
 *    2   3
 *     \   \ 
 *      3   1
 * Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
 * Example 2:
 *      3
 *     / \
 *    4   5
 *   / \   \ 
 *  1   3   1
 * Maximum amount of money the thief can rob = 4 + 5 = 9.
 * 
 * @author Johnny
 */
public class Solution337 {
    //https://www.hrwhisper.me/leetcode-house-robber-iii/
    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        return dfs(root)[0];
    }
    
    private int[] dfs(TreeNode root) {
        int dp[] = {0, 0}; //d[0]: max, d[1]: max without root
        if(root != null){
            int[] dp_L = dfs(root.left);
            int[] dp_R = dfs(root.right);
            dp[1] = dp_L[0] + dp_R[0];
            dp[0] = Math.max(dp[1] ,dp_L[1] + dp_R[1] + root.val);
        }
        return dp;
    }
}
