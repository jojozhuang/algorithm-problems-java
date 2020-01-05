package johnny.leetcode.algorithm;

import java.util.Stack;

/**
 * 1021. Best Sightseeing Pair
 * User Accepted: 810
 * User Tried: 1449
 * Total Accepted: 831
 * Total Submissions: 2578
 * Difficulty: Medium
 * Given an array A of positive integers, A[i] represents the value of the i-th sightseeing spot, and two sightseeing spots i and j have distance j - i between them.
 * <p>
 * {@code The score of a pair (i < j) of sightseeing spots is (A[i] + A[j] + i - j) : the sum of the values of the sightseeing spots, minus the distance between them.}
 * <p>
 * Return the maximum score of a pair of sightseeing spots.
 * <p>
 * Example 1:
 * Input: [8,1,5,2,6]
 * Output: 11
 * Explanation: i = 0, j = 2, A[i] + A[j] + i - j = 8 + 5 + 0 - 2 = 11
 * <p>
 * Note:
 * <pre>{@code
 * 2 <= A.length <= 50000
 * 1 <= A[i] <= 1000
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1014 {
    public int maxScoreSightseeingPair(int[] A) {
        int max = 0;
        int prev = 0;
        for (int i = 1; i < A.length; i++) {
            max = Math.max(max, A[i] + A[prev] - (i - prev));
            if (A[i] >= A[prev] || A[i] >= A[prev] - (i - prev)) {
                prev = i;
            }
        }
        return max;
    }

    //
    public int maxScoreSightseeingPair4(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        stack.push(0);
        for (int i = 1; i < A.length; i++) {
            int top = stack.peek();
            max = Math.max(max, A[i] + A[top] - (i - top));
            if (A[i] >= A[top] || A[i] >= A[top] - (i - top)) {
                stack.pop();
                stack.push(i);
            }
        }
        return max;
    }

    //
    public int maxScoreSightseeingPair3(int[] A) {
        int n = A.length;
        int start = 0;
        int end = n - 1;
        int max = 0;
        while (start < end) {
            max = Math.max(max, A[start] + A[end] - (end - start));
            if (A[start] < A[end]) {
                start++;
            } else if (A[start] > A[end]) {
                end--;
            } else {
                if (A[start + 1] <= A[end - 1]) {
                    end--;
                } else {
                    start++;
                }
            }
        }

        return max;
    }

    //
    public int maxScoreSightseeingPair2(int[] A) {
        int max = 0;
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int score = A[i] + A[j] - (j - i);
                max = Math.max(max, score);
            }
        }

        return max;
    }
}
