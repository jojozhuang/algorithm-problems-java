package johnny.leetcode.algorithm;

import johnny.algorithm.common.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Merge Intervals.
 * Given a collection of intervals, merge all overlapping intervals.
 * <p>
 * For example,
 * Given [1,3],[2,6],[8,10],[15,18],
 * return [1,6],[8,10],[15,18].
 *
 * @author Johnny
 */
public class Solution056 {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> ans = new ArrayList<>();
        if (intervals == null || intervals.size() == 0) {
            return ans;
        }

        Collections.sort(intervals, new IntervalComparator());

        Interval curr = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval temp = intervals.get(i);
            if (curr.end < temp.start) {
                ans.add(curr);
                curr = temp;
            } else {
                curr.end = temp.end;
            }
        }

        ans.add(curr);
        return ans;
    }

    private class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval i1, Interval i2) {
            if (i1.start == i2.start) {
                return i1.end - i2.end;
            } else {
                return i1.start - i2.start;
            }
        }
    }
}
