package johnny.lintcode.algorithm;

/**
 * Backpack II.
 * 
 * Given n items with size Ai and value Vi, and a backpack with size m. 
 * What's the maximum value can you put into the backpack?
 * 
 * Example
 * Given 4 items with size [2, 3, 5, 7] and value [1, 5, 2, 4], and a backpack 
 * with size 10. The maximum value is 9.
* 
 * @author Johnny
 */
public class Backpack2 {
    public int backPack2(int m, int[] A, int V[]) {
        if (A == null || A.length == 0 || V == null || V.length == 0 || m <= 0) {
            return 0;
        }
        
        int[][] bp = new int[A.length + 1][m + 1];
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j <= m; j++) {
                if (A[i] > j) {
                    bp[i + 1][j] = bp[i][j];
                } else {
                    bp[i + 1][j] = Math.max(bp[i][j], bp[i][j - A[i]] + V[i]);
                }
            }
        }
        
        return bp[A.length][m];
    }
}
