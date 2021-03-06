package johnny.leetcode.algorithm;

import johnny.algorithm.common.Interval;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Find Right Interval
 * <p>
 * Given a set of intervals, for each of the interval i, check if there exists
 * an interval j whose start point is bigger than or equal to the end point of
 * the interval i, which can be called that j is on the "right" of i.
 * <p>
 * For any interval i, you need to store the minimum interval j's index, which
 * means that the interval j has the minimum start point to build the "right"
 * relationship for interval i. If the interval j doesn't exist, store -1 for
 * the interval i. Finally, you need output the stored value of each interval
 * as an array.
 * <p>
 * Note:
 * 1. You may assume the interval's end point is always bigger than its start point.
 * 2. You may assume none of these intervals have the same start point.
 * <p>
 * Example 1:
 * Input: [ [1,2] ]
 * Output: [-1]
 * Explanation: There is only one interval in the collection, so it outputs -1.
 * <p>
 * Example 2:
 * Input: [ [3,4], [2,3], [1,2] ]
 * Output: [-1, 0, 1]
 * Explanation: There is no satisfied "right" interval for [3,4].
 * For [2,3], the interval [3,4] has minimum-"right" start point;
 * For [1,2], the interval [2,3] has minimum-"right" start point.
 * <p>
 * Example 3:
 * Input: [ [1,4], [2,3], [3,4] ]
 * Output: [-1, 2, -1]
 * Explanation: There is no satisfied "right" interval for [1,4] and [3,4].
 * For [2,3], the interval [3,4] has minimum-"right" start point.
 *
 * @author Johnny
 */
public class Solution436 {
    public int[] findRightInterval(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[]{};
        }

        int[] ans = new int[intervals.length];
        Arrays.fill(ans, -1); // default value
        // clone and sort
        Interval[] clone = intervals.clone();
        Arrays.sort(clone, (a, b) -> (a.start - b.start));
        // original position
        Map<Interval, Integer> map = new HashMap<>();
        for (int i = 0; i < intervals.length; i++) {
            map.put(intervals[i], i);
        }

        // find right for each interval
        for (int i = 0; i < intervals.length; i++) {
            Interval curr = intervals[i];
            // binary search
            int start = 0;
            int end = clone.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                Interval midIntv = clone[mid];
                if (curr.end == midIntv.start) {
                    ans[i] = map.get(midIntv);
                    break; // must be the exact candidate, can stop searching
                } else if (midIntv.end < curr.start) {
                    start = mid + 1;
                } else if (midIntv.start > curr.end) {
                    ans[i] = map.get(midIntv); // can be a candidate
                    end = mid - 1;
                } else { // has intersection, cannot be the candidate
                    start = mid + 1;
                }
            }
        }

        return ans;
    }


    public int[] findRightInterval2(Interval[] intervals) {
        int[] result = new int[intervals.length];
        java.util.NavigableMap<Integer, Integer> intervalMap = new TreeMap<>();

        for (int i = 0; i < intervals.length; ++i) {
            intervalMap.put(intervals[i].start, i);
        }

        for (int i = 0; i < intervals.length; ++i) {
            Map.Entry<Integer, Integer> entry = intervalMap.ceilingEntry(intervals[i].end);
            result[i] = (entry != null) ? entry.getValue() : -1;
        }

        return result;
    }
}
