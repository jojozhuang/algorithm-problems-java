package johnny.leetcode.algorithm;

import java.util.TreeSet;

/**
 * Max Sum of Rectangle No Larger Than K.
 * <p>
 * Given a non-empty 2D matrix matrix and an integer k, find the max sum of a
 * rectangle in the matrix such that its sum is no larger than k.
 * <p>
 * Example:
 * <p>
 * Given matrix = [
 * [1,  0, 1],
 * [0, -2, 3]
 * ]
 * k = 2
 * <p>
 * The answer is 2. Because the sum of rectangle [[0, 1], [-2, 3]] is 2 and 2
 * is the max number no larger than k (k = 2).
 * <p>
 * Note:
 * The rectangle inside the matrix must have an area larger than 0.
 * What if the number of rows is much larger than the number of columns?
 *
 * @author Johnny
 */
public class Solution363 {
    //http://www.cnblogs.com/grandyang/p/5617660.html
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int row = matrix.length;
        if (row == 0) return 0;
        int col = matrix[0].length;
        int m = Math.min(row, col);
        int n = Math.max(row, col);
        //indicating sum up in every row or every column
        boolean colIsBig = col > row;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            int[] array = new int[n];
            // sum from row j to row i
            for (int j = i; j >= 0; j--) {
                int val = 0;
                TreeSet<Integer> set = new TreeSet<Integer>();
                set.add(0);
                //traverse every column/row and sum up
                for (int l = 0; l < n; l++) {
                    array[l] = array[l] + (colIsBig ? matrix[j][l] : matrix[l][j]);
                    val = val + array[l];
                    //use  TreeMap to binary search previous sum to get possible result 
                    Integer subres = set.ceiling(val - k);
                    if (null != subres) {
                        res = Math.max(res, val - subres);
                    }
                    set.add(val);
                }
            }
        }
        return res;
    }
}
