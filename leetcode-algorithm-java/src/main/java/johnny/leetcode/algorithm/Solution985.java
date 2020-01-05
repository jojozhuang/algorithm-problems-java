package johnny.leetcode.algorithm;

/**
 * 985. Sum of Even Numbers After Queries
 * We have an array A of integers, and an array queries of queries.
 * <p>
 * For the i-th query val = queries[i][0], index = queries[i][1], we add val to A[index].  Then, the answer to the i-th query is the sum of the even values of A.
 * <p>
 * (Here, the given index = queries[i][1] is a 0-based index, and each query permanently modifies the array A.)
 * <p>
 * Return the answer to all queries.  Your answer array should have answer[i] as the answer to the i-th query.
 * <p>
 * Example 1:
 * Input: A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
 * Output: [8,6,2,4]
 * Explanation:
 * At the beginning, the array is [1,2,3,4].
 * After adding 1 to A[0], the array is [2,2,3,4], and the sum of even values is 2 + 2 + 4 = 8.
 * After adding -3 to A[1], the array is [2,-1,3,4], and the sum of even values is 2 + 4 = 6.
 * After adding -4 to A[0], the array is [-2,-1,3,4], and the sum of even values is -2 + 4 = 2.
 * After adding 2 to A[3], the array is [-2,-1,3,6], and the sum of even values is -2 + 6 = 4.
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * 1 <= queries.length <= 10000
 * -10000 <= queries[i][0] <= 10000
 * 0 <= queries[i][1] < A.length
 * }</pre>
 *
 * @author Johnny
 */
public class Solution985 {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        if (A == null || A.length == 0) {
            return A;
        }

        int sum = 0;
        for (int val : A) {
            if (val % 2 == 0) {
                sum += val;
            }
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int previous = A[query[1]];
            A[query[1]] += query[0];
            if (A[query[1]] % 2 == 0) {
                if (previous % 2 != 0) {
                    sum += A[query[1]];
                } else {
                    sum += query[0];
                }
            } else {
                if (previous % 2 != 0) {
                    sum += 0;
                } else {
                    sum -= previous;
                }
            }
            ans[i] = sum;
        }

        return ans;
    }

    public int[] sumEvenAfterQueries2(int[] A, int[][] queries) {
        int S = 0;
        for (int x : A)
            if (x % 2 == 0)
                S += x;

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; ++i) {
            int val = queries[i][0], index = queries[i][1];
            if (A[index] % 2 == 0) S -= A[index];
            A[index] += val;
            if (A[index] % 2 == 0) S += A[index];
            ans[i] = S;
        }

        return ans;
    }
}
