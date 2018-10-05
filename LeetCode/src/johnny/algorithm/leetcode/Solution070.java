package johnny.algorithm.leetcode;

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
    // Fibonacci Number
    public int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int first = 1;
        int second = 2;
        int third = 0;

        for (int i = 2; i < n; i++) {
            third = first + second;
            first = second;
            second = third;
        }

        return third;
    }
    // DP
    public int climbStairs2(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Define function, f[i] is the count of ways to climb to level i. 
        // dp[i] = dp[i-1] + dp[i-2]
        int[] dp = new int[n];
        // Initial
        dp[0] = 1;
        dp[1] = 2;
        // Calculate f[i]
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        // Get result
        return dp[n - 1];
    }
    
    // Recursion
    public int climbStairs3(int n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        
        return climbStairs(n-1) + climbStairs(n-2);
    }
}
