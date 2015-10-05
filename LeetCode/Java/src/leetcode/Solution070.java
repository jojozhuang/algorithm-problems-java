/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Climbing Stairs .
 * 
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can 
 * you climb to the top?
* 
 * @author Johnny
 */
public class Solution070 {
    public int climbStairs(int n) {
        if (n<=0)
            return 0;
        if (n==1)
            return 1;
        if (n==2)
            return 2;
        
        return climbStairs(n-1) + climbStairs(n-2);
    }
    
    public int climbStairs2(int n) {
        if (n<=0)
            return 0;
        if (n==1)
            return 1;
        if (n==2)
            return 2;
        
        int[] ret = new int[n+1];
        ret[0] = 0;
        ret[1] = 1;
        ret[2] = 2;
        
        for (int i=3; i<=n; i++) {
            ret[i] = ret[i-1] + ret[i-2];
        }
        return ret[n];
    }
}
