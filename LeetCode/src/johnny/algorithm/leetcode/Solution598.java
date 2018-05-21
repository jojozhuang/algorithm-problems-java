package johnny.algorithm.leetcode;

/**
 * Range Addition II
 * 
 * Given an m * n matrix M initialized with all 0's and several update operations.
 * 
 * Operations are represented by a 2D array, and each operation is represented 
 * by an array with two positive integers a and b, which means M[i][j] should be
 * added by one for all 0 <= i < a and 0 <= j < b.
 * 
 * You need to count and return the number of maximum integers in the matrix 
 * after performing all the operations.
 * 
 * Example 1:
 * Input: 
 * m = 3, n = 3
 * operations = [[2,2],[3,3]]
 * Output: 4
 * 
 * Explanation: 
 * Initially, M = 
 * [[0, 0, 0],
 *  [0, 0, 0],
 *  [0, 0, 0]]
 * 
 * After performing [2,2], M = 
 * [[1, 1, 0],
 *  [1, 1, 0],
 *  [0, 0, 0]]
 * 
 * After performing [3,3], M = 
 * [[2, 2, 1],
 *  [2, 2, 1],
 *  [1, 1, 1]]
 * 
 * So the maximum integer in M is 2, and there are four of it in M. So return 4.
 * 
 * Note:
 * 1. The range of m and n is [1,40000].
 * 2. The range of a is [1,m], and the range of b is [1,n].
 * 3. The range of operations size won't exceed 10,000.
 * 
 * @author Johnny
 */
public class Solution598 {
    // O(k)
    public int maxCount(int m, int n, int[][] ops) {
        if (ops== null || ops.length == 0 || ops[0].length == 0) {
            return m * n;
        }
        
        for (int[] op: ops) {
            m = Math.min(m, op[0]);
            n = Math.min(n, op[1]);
        }
        return m * n;
    }
    // Brute force, m*n*k, k is the length of ops.
    public int maxCount2(int m, int n, int[][] ops) {
        if (ops== null || ops.length == 0 || ops[0].length == 0) {
            return m * n;
        }
        
        int[][] arr = new int[m][n];
        for (int[] op: ops) {
            for (int i = 0; i < op[0]; i++) {
                for (int j = 0; j < op[1]; j++) {
                    arr[i][j] += 1;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == arr[0][0])
                    count++;
            }
        }
        return count;
    }
}
