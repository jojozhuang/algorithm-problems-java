package johnny.algorithm.leetcode;

import java.util.Stack;

/**
 * 1021. Best Sightseeing Pair
User Accepted: 810
User Tried: 1449
Total Accepted: 831
Total Submissions: 2578
Difficulty: Medium
Given an array A of positive integers, A[i] represents the value of the i-th sightseeing spot, and two sightseeing spots i and j have distance j - i between them.

The score of a pair (i < j) of sightseeing spots is (A[i] + A[j] + i - j) : the sum of the values of the sightseeing spots, minus the distance between them.

Return the maximum score of a pair of sightseeing spots.

 

Example 1:

Input: [8,1,5,2,6]
Output: 11
Explanation: i = 0, j = 2, A[i] + A[j] + i - j = 8 + 5 + 0 - 2 = 11
 

Note:

2 <= A.length <= 50000
1 <= A[i] <= 1000

 * @author Johnny
 */
public class SolutionA1021 {
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
}
