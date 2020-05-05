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
    public int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        int start = Integer.MAX_VALUE, end = Integer.MIN_VALUE;
        for (int[] interval : intervals) {
            start = Math.min(start, interval[0]);
            end = Math.max(end, interval[1]);
        }

        int[] meetings = new int[end - start + 1];
        for (int i = 0; i < intervals.length; i++) {
            meetings[intervals[i][0] - start]++;
            meetings[intervals[i][1] - start]--;
        }

        // go through and find the maximum
        int max = 0;
        int count = 0;
        for (int i = 0; i < meetings.length; i++) {
            count += meetings[i];
            max = Math.max(max, count);
        }

        return max;
    }
    // PriorityQueue, store the end value
    public int minMeetingRooms3(int[][] intervals) {
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
