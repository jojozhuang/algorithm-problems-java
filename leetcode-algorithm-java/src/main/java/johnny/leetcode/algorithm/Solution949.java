package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 949. Largest Time for Given Digits
 * <p>
 * Given an array of 4 digits, return the largest 24 hour time that can be made.
 * <p>
 * The smallest 24 hour time is 00:00, and the largest is 23:59.  Starting from 00:00, a time is larger if more time has elapsed since midnight.
 * <p>
 * Return the answer as a string of length 5.  If no valid time can be made, return an empty string.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,4]
 * Output: "23:41"
 * Example 2:
 * <p>
 * Input: [5,5,5,5]
 * Output: ""
 * <p>
 * <p>
 * Note:
 * <p>
 * A.length == 4
 * 0 <= A[i] <= 9
 *
 * @author Johnny
 */
public class Solution949 {
    public String largestTimeFromDigits(int[] A) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[4];
        // get all valid permutations
        helper(A, visited, list, res);

        if (res.size() == 0) {
            return "";
        } else {
            // sorted by customized comparator
            Collections.sort(res, new TimeComparator());
            // get the largest time
            List<Integer> time = res.get(res.size() - 1);
            // return in string format
            return "" + time.get(0) + time.get(1) + ":" + time.get(2) + time.get(3);
        }
    }

    private void helper(int[] A, boolean[] visited, List<Integer> list, List<List<Integer>> res) {
        if (list.size() == A.length) {
            if (isValid(list)) {
                res.add(new ArrayList<Integer>(list));
                return;
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (visited[i] == false) {
                list.add(A[i]);
                visited[i] = true;
                helper(A, visited, list, res);
                list.remove(list.size() - 1);
                visited[i] = false;
            }
        }
    }

    private boolean isValid(List<Integer> time) {
        if (time.get(0) > 2) {
            return false;
        }

        if (time.get(0) == 2 && time.get(1) > 3) {
            return false;
        }

        if (time.get(2) > 5) {
            return false;
        }

        return true;
    }

    private class TimeComparator implements Comparator<List<Integer>> {
        public int compare(List<Integer> time1, List<Integer> time2) {
            for (int i = 0; i < time1.size(); i++) {
                if (time1.get(i) != time2.get(i)) {
                    return time1.get(i) - time2.get(i);
                }
            }

            return 0;
        }
    }
}
