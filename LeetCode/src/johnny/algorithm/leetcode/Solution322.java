package johnny.algorithm.leetcode;

import java.util.Arrays;

/**
 * Coin Change.
 * 
 * You are given coins of different denominations and a total amount of money 
 * amount. Write a function to compute the fewest number of coins that you need 
 * to make up that amount. If that amount of money cannot be made up by any 
 * combination of the coins, return -1.
 * 
 * Example 1:
 * coins = [1, 2, 5], amount = 11
 * return 3 (11 = 5 + 5 + 1)
 * 
 * Example 2:
 * coins = [2], amount = 3
 * return -1.
 * 
 * Note:
 * You may assume that you have an infinite number of each kind of coin.
 *  
 * @author Johnny
 */
public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0 || amount <= 0) {
            return 0;
        }
        
        // dp[i] = min coins to make up to amount i
        int[] dp = new int[amount + 1]; 
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] >= amount + 1 ? -1 : dp[amount];
    }
    
    //https://discuss.leetcode.com/topic/43276/dp-ac-java-solution-18ms-beating-95/2
    public int coinChange2(int[] coins, int amount) {
        if (coins == null || coins.length == 0 || amount <= 0) {
            return 0;
        }
        
        int[] dp = new int[amount + 1]; 
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
