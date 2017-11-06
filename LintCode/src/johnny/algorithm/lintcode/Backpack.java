/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode;

/**
 * Backpack.
 * Given n items with size Ai, an integer m denotes the size of a backpack. 
 * How full you can fill this backpack?
 * 
 * Example
 * If we have 4 items with size [2, 3, 5, 7], the backpack size is 11, we can 
 * select [2, 3, 5], so that the max size we can fill this backpack is 10. 
 * If the backpack size is 12. we can select [2, 3, 7] so that we can fulfill the backpack.
 * 
 * You function should return the max size we can fill in the given backpack.
 *  
 * @author Johnny
 */
public class Backpack {
    public int backPack(int m, int[] A) {
        if (A == null || A.length == 0) return 0;

        final int M = m;
        final int N = A.length;
        int[][] bp = new int[N + 1][M + 1];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= M; j++) {
                if (A[i] > j) {
                    bp[i + 1][j] = bp[i][j];
                } else {
                    bp[i + 1][j] = Math.max(bp[i][j], bp[i][j - A[i]] + A[i]);
                }
            }
        }

        return bp[N][M];
    }
}
