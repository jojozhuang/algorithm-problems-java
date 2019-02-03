package johnny.algorithm.leetcode;

/**
 * 850. Rectangle Area II
 * 
 * We are given a list of (axis-aligned) rectangles.  Each rectangle[i] = [x1, y1, x2, y2] , where (x1, y1) are the coordinates of the bottom-left corner, and (x2, y2) are the coordinates of the top-right corner of the ith rectangle.

Find the total area covered by all rectangles in the plane.  Since the answer may be too large, return it modulo 10^9 + 7.



Example 1:

Input: [[0,0,2,2],[1,0,2,3],[1,0,3,1]]
Output: 6
Explanation: As illustrated in the picture.
Example 2:

Input: [[0,0,1000000000,1000000000]]
Output: 49
Explanation: The answer is 10^18 modulo (10^9 + 7), which is (10^9)^2 = (-7)^2 = 49.
Note:

1 <= rectangles.length <= 200
rectanges[i].length = 4
0 <= rectangles[i][j] <= 10^9
The total area covered by all rectangles will never exceed 2^63 - 1 and thus will fit in a 64-bit signed integer.

 * @author Johnny
 */
public class Solution850 {
    public int rectangleArea(int[][] rectangles) {
        int N = rectangles.length;

        long ans = 0;
        for (int subset = 1; subset < (1<<N); ++subset) {
            int[] rec = new int[]{0, 0, 1_000_000_000, 1_000_000_000};
            int parity = -1;
            for (int bit = 0; bit < N; ++bit)
                if (((subset >> bit) & 1) != 0) {
                    rec = intersect(rec, rectangles[bit]);
                    parity *= -1;
                }
            ans += parity * area(rec);
        }

        long MOD = 1_000_000_007;
        ans %= MOD;
        if (ans < 0) ans += MOD;
        return (int) ans;
    }

    public long area(int[] rec) {
        long dx = Math.max(0, rec[2] - rec[0]);
        long dy = Math.max(0, rec[3] - rec[1]);
        return dx * dy;
    }

    public int[] intersect(int[] rec1, int[] rec2) {
        return new int[]{
            Math.max(rec1[0], rec2[0]),
            Math.max(rec1[1], rec2[1]),
            Math.min(rec1[2], rec2[2]),
            Math.min(rec1[3], rec2[3]),
        };
    }
}
