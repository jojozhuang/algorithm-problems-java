package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1027. Longest Arithmetic Sequence
 * Given an array A of integers, return the length of the longest arithmetic subsequence in A.
 * <p>
 * Recall that a subsequence of A is a list A[i_1], A[i_2], ..., A[i_k] with 0 <= i_1 < i_2 < ... < i_k <= A.length - 1, and that a sequence B is arithmetic if B[i+1] - B[i] are all the same value (for 0 <= i < B.length - 1).
 * <p>
 * Example 1:
 * <p>
 * Input: [3,6,9,12]
 * Output: 4
 * Explanation:
 * The whole array is an arithmetic sequence with steps of length = 3.
 * Example 2:
 * <p>
 * Input: [9,4,7,2,10]
 * Output: 3
 * Explanation:
 * The longest arithmetic subsequence is [4,7,10].
 * Example 3:
 * <p>
 * Input: [20,1,15,3,10,5,8]
 * Output: 4
 * Explanation:
 * The longest arithmetic subsequence is [20,15,10,5].
 * <p>
 * <p>
 * Note:
 * <p>
 * 2 <= A.length <= 2000
 * 0 <= A[i] <= 10000
 *
 * @author Johnny
 */
public class SolutionA1027 {
    public int longestArithSeqLength(int[] A) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (!map.containsKey(A[i])) {
                map.put(A[i], new ArrayList<>());
            }
            map.get(A[i]).add(i);
        }

        int ans = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int diff = A[j] - A[i];
                int next = A[j] + diff;
                int count = 2;
                int index = j;
                while (map.containsKey(next)) {
                    // binary search the minimum index which is larger than j
                    List<Integer> list = map.get(next);
                    if (list.get(0) > index) {
                        count++;
                        next += diff;
                        index = list.get(0);
                    } else if (list.get(list.size() - 1) < index) {
                        break;
                    } else {
                        int start = 0;
                        int end = list.size() - 1;
                        while (start < end) {
                            int mid = start + (end - start) / 2;
                            if (list.get(mid) > index) {
                                end = mid;
                            } else {
                                start = mid + 1;
                            }
                        }
                        if (list.get(start) > index) {
                            count++;
                            next += diff;
                            index = list.get(start);
                        } else {
                            break;
                        }
                    }
                }
                ans = Math.max(ans, count);
            }
        }

        return ans;
    }

    public int longestArithSeqLength2(int[] A) {
        int ans = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int diff = A[j] - A[i];
                int next = A[j] + diff;
                int count = 2;
                for (int k = j + 1; k < A.length; k++) {
                    if (A[k] == next) {
                        count++;
                        next = A[k] + diff;
                    }
                }
                ans = Math.max(ans, count);
            }
        }

        return ans;
    }
}
