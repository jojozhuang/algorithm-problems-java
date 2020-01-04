package johnny.leetcode.algorithm;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Meeting Rooms II.
 * <p>
 * Given an array of meeting time intervals consisting of start and
 * end times {@code [[s1,e1],[s2,e2],...] (si < ei)}, find the minimum number
 * of conference rooms required.
 * <p>
 * For example,
 * Given [[0, 30],[5, 10],[15, 20]],
 * return 2.
 *
 * @author Johnny
 */
public class Solution253 {
    // PriorityQueue, store the end value
    public int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(intervals[0][1]);
        for (int i = 1; i < intervals.length; i++) {
            int first = pq.peek();
            int[] curr = intervals[i];
            if (first <= curr[0]) {
                pq.poll();
                pq.offer(curr[1]);
            } else {
                pq.offer(curr[1]);
            }
        }
        return pq.size();
    }

    // PriorityQueue, store intervals
    public int minMeetingRooms2(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[1] - b[1]));
        pq.offer(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] first = pq.poll(); // take the first one which has the smallest end value
            int[] curr = intervals[i];
            if (first[1] <= curr[0]) {
                first[1] = curr[1];
            } else {
                pq.offer(curr);
            }
            pq.offer(first);
        }
        return pq.size();
    }
}
