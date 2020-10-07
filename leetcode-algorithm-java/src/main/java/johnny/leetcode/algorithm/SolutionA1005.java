package johnny.leetcode.algorithm;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 1005. Maximize Sum Of Array After K Negations
 * Given an array A of integers, we must modify the array in the following way: we choose an i and replace A[i] with -A[i], and we repeat this process K times in total.  (We may choose the same index i multiple times.)
 * <p>
 * Return the largest possible sum of the array after modifying it in this way.
 * <p>
 * Example 1:
 * Input: A = [4,2,3], K = 1
 * Output: 5
 * Explanation: Choose indices (1,) and A becomes [4,-2,3].
 * <p>
 * Example 2:
 * Input: A = [3,-1,0,2], K = 3
 * Output: 6
 * Explanation: Choose indices (1, 2, 2) and A becomes [3,1,0,2].
 * <p>
 * Example 3:
 * Input: A = [2,-3,-1,5,-4], K = 2
 * Output: 13
 * Explanation: Choose indices (1, 4) and A becomes [2,3,-1,5,4].
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= A.length <= 10000
 * 1 <= K <= 10000
 * -100 <= A[i] <= 100
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1005 {
    public int largestSumAfterKNegations(int[] A, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num: A) {
            pq.add(num);
        }

        for (int i = 0; i < K; i++) {
            pq.add(-pq.poll());
        }

        int sum  = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }

        return sum;
    }

    public int largestSumAfterKNegations2(int[] A, int K) {
        Arrays.sort(A);
        int sum = 0;

        boolean zero = false;
        int min_positive = 101;
        int max_negtive = -101;
        for (int num : A) {
            sum += num;
            if (num == 0) {
                zero = true;
            } else if (num > 0) {
                min_positive = Math.min(min_positive, num);
            } else {
                max_negtive = Math.max(max_negtive, num);
            }
        }

        int count = 0;
        for (int i = 0; i < Math.min(K, A.length); i++) {
            if (A[i] < 0) {
                sum += 2 * (-A[i]);
                count++;
            } else {
                break;
            }
        }

        if (count < K) {
            if (zero) {
                return sum;
            } else {
                if ((K - count) % 2 == 0) {
                    return sum;
                } else {
                    if (min_positive == 101) {
                        sum -= 2 * (-max_negtive);
                    } else if (max_negtive == -101) {
                        sum -= 2 * min_positive;
                    } else {
                        sum -= 2 * Math.min(min_positive, -max_negtive);
                    }
                }
            }
        }

        return sum;
    }
}
