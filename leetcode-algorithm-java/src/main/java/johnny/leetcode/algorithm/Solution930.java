package johnny.leetcode.algorithm;

/**
 * 930. Binary Subarrays With Sum
 * n an array A of 0s and 1s, how many non-empty subarrays have sum S?
 * <p>
 * Example 1:
 * Input: A = [1,0,1,0,1], S = 2
 * Output: 4
 * Explanation:
 * The 4 subarrays are bolded below:
 * [1,0,1,0,1]
 * [1,0,1,0,1]
 * [1,0,1,0,1]
 * [1,0,1,0,1]
 * <p>
 * Note:
 * <pre>{@code
 * A.length <= 30000
 * 0 <= S <= A.length
 * A[i] is either 0 or 1.
 * }</pre>
 *
 * @author Johnny
 */
public class Solution930 {
    public int numSubarraysWithSum(int[] A, int S) {
        int su = 0;
        for (int x : A) su += x;

        // indexes[i] = location of i-th one (1 indexed)
        int[] indexes = new int[su + 2];
        int t = 0;
        indexes[t++] = -1;
        for (int i = 0; i < A.length; ++i)
            if (A[i] == 1)
                indexes[t++] = i;
        indexes[t] = A.length;

        int ans = 0;
        if (S == 0) {
            for (int i = 0; i < indexes.length - 1; ++i) {
                // w: number of zeros between consecutive ones
                int w = indexes[i + 1] - indexes[i] - 1;
                ans += w * (w + 1) / 2;
            }
            return ans;
        }

        for (int i = 1; i < indexes.length - S; ++i) {
            int j = i + S - 1;
            int left = indexes[i] - indexes[i - 1];
            int right = indexes[j + 1] - indexes[j];
            ans += left * right;
        }

        return ans;
    }
}
