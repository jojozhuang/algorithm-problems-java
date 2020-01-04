package johnny.leetcode.algorithm;

/**
 * 1140. Stone Game II
 * Alex and Lee continue their games with piles of stones.  There are a number of piles arranged in a row, and each pile has a positive integer number of stones piles[i].  The objective of the game is to end with the most stones.
 * <p>
 * Alex and Lee take turns, with Alex starting first.  Initially, M = 1.
 * <p>
 * On each player's turn, that player can take all the stones in the first X remaining piles, where 1 <= X <= 2M.  Then, we set M = max(M, X).
 * <p>
 * The game continues until all the stones have been taken.
 * <p>
 * Assuming Alex and Lee play optimally, return the maximum number of stones Alex can get.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: piles = [2,7,9,4,4]
 * Output: 10
 * Explanation:  If Alex takes one pile at the beginning, Lee takes two piles, then Alex takes 2 piles again. Alex can get 2 + 4 + 4 = 10 piles in total. If Alex takes two piles at the beginning, then Lee can take all three piles left. In this case, Alex get 2 + 7 = 9 piles in total. So we return 10 since it's larger.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= piles.length <= 100
 * 1 <= piles[i] <= 10 ^ 4
 *
 * @author Johnny
 */
public class SolutionA1140 {
    public int stoneGameII(int[] piles) {
        return 0;
    }
}
