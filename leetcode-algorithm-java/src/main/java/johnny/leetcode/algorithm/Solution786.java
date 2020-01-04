package johnny.leetcode.algorithm;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 786. K-th Smallest Prime Fraction
 * A sorted list A contains 1, plus some number of primes.  Then, for every p < q in the list, we consider the fraction p/q.
 * <p>
 * What is the K-th smallest fraction considered?  Return your answer as an array of ints, where answer[0] = p and answer[1] = q.
 * <p>
 * Examples:
 * Input: A = [1, 2, 3, 5], K = 3
 * Output: [2, 5]
 * Explanation:
 * The fractions to be considered in sorted order are:
 * 1/5, 1/3, 2/5, 1/2, 3/5, 2/3.
 * The third fraction is 2/5.
 * <p>
 * Input: A = [1, 7], K = 1
 * Output: [1, 7]
 * Note:
 * <p>
 * A will have length between 2 and 2000.
 * Each A[i] will be between 1 and 30000.
 * K will be between 1 and A.length * (A.length + 1) / 2.
 *
 * @author Johnny
 */
public class Solution786 {
    public int[] kthSmallestPrimeFraction(int[] A, int K) {
        int n = A.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(A[a[0]] * A[n - 1 - b[1]], A[n - 1 - a[1]] * A[b[0]]);
            }
        });

        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{i, 0});
        }

        while (--K > 0) {
            int[] p = pq.poll();

            if (++p[1] < n) {
                pq.offer(p);
            }
        }

        return new int[]{A[pq.peek()[0]], A[n - 1 - pq.peek()[1]]};
    }
}
