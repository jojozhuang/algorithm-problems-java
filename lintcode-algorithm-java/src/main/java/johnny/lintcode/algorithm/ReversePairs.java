package johnny.lintcode.algorithm;

/**
 * Reverse Pairs
 * <p>
 * For an array A, if i &lt; j, and A [i] &gt; A [j], called (A [i], A [j]) is a
 * reverse pair.
 * <p>
 * return total of reverse pairs in A.
 * <p>
 * Example
 * Given A = [2, 4, 1, 3, 5] , (2, 1), (4, 1), (4, 3) are reverse pairs. return 3
 *
 * @author Johnny
 */
public class ReversePairs {
    public long reversePairs(int[] A) {
        if (A == null || A.length <= 1) {
            return 0;
        }

        int res = 0;
        for (int i = 1; i < A.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (A[j] > A[i]) {
                    res++;
                }
            }
        }

        return res;
    }
}
