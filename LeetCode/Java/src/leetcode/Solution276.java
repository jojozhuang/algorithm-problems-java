/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Paint Fence.
 * 
 * There is a fence with n posts, each post can be painted with one of the k 
 * colors.
 * 
 * You have to paint all the posts such that no more than two adjacent fence 
 * posts have the same color.
 * 
 * Return the total number of ways you can paint the fence.
 * 
 * Note:
 * n and k are non-negative integers.
 * 
 * @author RZHUANG
 */
public class Solution276 {
    //https://leetcode.com/discuss/56173/o-n-time-java-solution-o-1-space
    public int numWays(int n, int k) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return k;
        }
        
        int diffColorCounts = k * (k - 1);
        int sameColorCounts = k;
        for(int i = 2; i < n; i++) {
            int temp = diffColorCounts;
            diffColorCounts = (diffColorCounts + sameColorCounts) * (k - 1);
            sameColorCounts = temp;
        }
        return diffColorCounts + sameColorCounts;
    }
}
