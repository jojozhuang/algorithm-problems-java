/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

/**
 * Dungeon Game.
 * The demons had captured the princess (P) and imprisoned her in the 
 * bottom-right corner of a dungeon. The dungeon consists of M x N rooms laid 
 * out in a 2D grid. Our valiant knight (K) was initially positioned in the 
 * top-left room and must fight his way through the dungeon to rescue the princess.
 * 
 * The knight has an initial health point represented by a positive integer. 
 * If at any point his health point drops to 0 or below, he dies immediately.
 * 
 * Some of the rooms are guarded by demons, so the knight loses health (negative
 * integers) upon entering these rooms; other rooms are either empty (0's) or 
 * contain magic orbs that increase the knight's health (positive integers).
 * 
 * In order to reach the princess as quickly as possible, the knight decides to 
 * move only rightward or downward in each step.
 * 
 * Write a function to determine the knight's minimum initial health so that he
 * is able to rescue the princess.
 * 
 * For example, given the dungeon below, the initial health of the knight must
 * be at least 7 if he follows the optimal path RIGHT-> RIGHT -> DOWN -> DOWN.
 * 
 * -2 (K)	-3	3
 * -5	-10	1
 * 10	30	-5 (P)
 * 
 * Notes:
 * 
 * The knight's health has no upper bound.
 * Any room can contain threats or power-ups, even the first room the knight 
 * enters and the bottom-right room where the princess is imprisoned.
 * 
 * @author Johnny
 */
public class Solution174 {
    public int calculateMinimumHP(int[][] dungeon) {
        if (dungeon == null || dungeon.length == 0 || dungeon[0].length == 0) {
            return 0;
        }
        
        int m = dungeon.length;
        int n = dungeon[0].length;
        // from P to K, calculate the minimum health value.
        int[][] health = new int[m][n];
        health[m - 1][n - 1] = 1 - dungeon[m - 1][n - 1];
        health[m - 1][n - 1]= Math.max(1, health[m - 1][n - 1]);
        // calculate the boarder first
        for(int i = m - 2; i >=0; i--) { // right board, bottom to top
            health[i][n - 1] = health[i + 1][n - 1] - dungeon[i][n - 1];
            health[i][n - 1] = Math.max(1, health[i][n - 1]);
        }

        for(int j = n - 2; j >=0; j--) { // bottom board, right to left
            health[m - 1][j] = health[m - 1][j + 1]- dungeon[m - 1][j];
            health[m - 1][j] = Math.max(1, health[m - 1][j]);
        }
        
        // from right bottom corner to left top corner
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                health[i][j] = Math.min(health[i + 1][j], health[i][j + 1]) - dungeon[i][j];
                health[i][j] = Math.max(1, health[i][j]);
            }
        }
        
        return health[0][0];
    }
}
