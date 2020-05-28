package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 986. Interval List Intersections
 * Given two lists of closed intervals, each list of intervals is pairwise disjoint and in sorted order.
 * <p>
 * Return the intersection of these two interval lists.
 * <p>
 * {@code (Formally, a closed interval [a, b] (with a <= b) denotes the set of real numbers x with a <= x <= b.  The intersection of two closed intervals is a set of real numbers that is either empty, or can be represented as a closed interval.  For example, the intersection of [1, 3] and [2, 4] is [2, 3].)}
 * <p>
 * Example 1:
 * Input: A = [[0,2],[5,10],[13,23],[24,25]], B = [[1,5],[8,12],[15,24],[25,26]]
 * Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
 * Reminder: The inputs and the desired output are lists of Interval objects, and not arrays or lists.
 * <p>
 * Note:
 * <pre>{@code
 * 0 <= A.length < 1000
 * 0 <= B.length < 1000
 * 0 <= A[i].start, A[i].end, B[i].start, B[i].end < 10^9
 * }</pre>
 *
 * @author Johnny
 */
public class Solution986 {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        if (A.length == 0 || B.length == 0) {
            return new int[][]{};
        }

        List<int[]> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < A.length && j < B.length) {
            if (A[i][0] == B[j][0]) {
                list.add(new int[]{A[i][0], Math.min(A[i][1], B[j][1])});
                if (A[i][1] < B[j][1]) {
                    i++;
                } else if (A[i][1] > B[j][1]) {
                    j++;
                } else {
                    i++;
                    j++;
                }
            } else if (A[i][0] < B[j][0]) {
                if (A[i][1] < B[j][0]) {
                    i++;
                } else {
                    list.add(new int[]{B[j][0], Math.min(A[i][1], B[j][1])});
                    if (A[i][1] < B[j][1]) {
                        i++;
                    } else if (A[i][1] > B[j][1]) {
                        j++;
                    } else {
                        i++;
                        j++;
                    }
                }
            } else {
                if (A[i][0] > B[j][1]) {
                    j++;
                } else {
                    list.add(new int[]{A[i][0], Math.min(A[i][1], B[j][1])});
                    if (A[i][1] < B[j][1]) {
                        i++;
                    } else if (A[i][1] > B[j][1]) {
                        j++;
                    } else {
                        i++;
                        j++;
                    }
                }
            }
        }
        int[][] ans = new int[list.size()][2];
        for (i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    public int[][] intervalIntersection2(int[][] A, int[][] B) {
        List<int[]> list = new ArrayList<>();
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
            // Let's check if A[i] intersects B[j].
            // lo - the startpoint of the intersection
            // hi - the endpoint of the intersection
            int lo = Math.max(A[i][0], B[j][0]);
            int hi = Math.min(A[i][1], B[j][1]);
            if (lo <= hi) {
                list.add(new int[]{lo, hi});
            }

            // Remove the interval with the smallest endpoint
            if (A[i][1] < B[j][1])
                i++;
            else
                j++;
        }

        int[][] ans = new int[list.size()][2];
        for (i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
