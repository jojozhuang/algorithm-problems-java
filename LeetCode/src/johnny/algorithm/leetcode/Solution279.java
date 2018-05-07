package johnny.algorithm.leetcode;

/**
 * Perfect Squares.
 * 
 * Given a positive integer n, find the least number of perfect square numbers
 * (for example, 1, 4, 9, 16, ...) which sum to n.
 * 
 * For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, 
 * return 2 because 13 = 4 + 9.
 *  
 * @author Johnny
 */
public class Solution279 {
    //http://www.cnblogs.com/grandyang/p/4800552.html
    public int numSquares(int n) {
        if (n < 1) {
            return 0;
        }
        int res = n;
        int num = 2;
        while (num * num <= n) {
            int a = n / (num * num);
            int b = n % (num * num);
            res = Math.min(res, a + numSquares(b));
            ++num;
        }
        return res;
    }
}
