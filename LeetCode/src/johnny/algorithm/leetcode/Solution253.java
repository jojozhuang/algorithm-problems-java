package johnny.algorithm.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import johnny.algorithm.leetcode.common.Interval;

/**
 * Meeting Rooms II.
 * 
 * Given an array of meeting time intervals consisting of start and 
 * end times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number 
 * of conference rooms required.
 * 
 * For example,
 * Given [[0, 30],[5, 10],[15, 20]],
 * return 2.
 * 
 * @author Johnny
 */
public class Solution253 {
    // PriorityQueue, store the end value
    public int minMeetingRooms(Interval[] intervals) {  
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        
        Arrays.sort(intervals, (a, b)->(a.start - b.start));
         
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(intervals[0].end);
        for (int i = 1; i < intervals.length; i++) {
            int first = pq.peek();
            Interval curr = intervals[i];
            if (first <= curr.start) {
                pq.poll();
                pq.offer(curr.end);
            } else {
                pq.offer(curr.end);
            }
        }  
        
        return pq.size(); 
    }
    
    // PriorityQueue, store intervals
    public int minMeetingRooms2(Interval[] intervals) {  
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        
        Arrays.sort(intervals, (a, b)->(a.start - b.start));
         
        PriorityQueue<Interval> pq = new PriorityQueue<>((a, b)->(a.end - b.end));
        pq.offer(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            Interval first = pq.poll(); // take the first one which as the smallest end value
            Interval curr = intervals[i];
            if (first.end <= curr.start) {
                first.end = curr.end;
            } else {
                pq.offer(curr);
            }
            pq.offer(first);
        }  
        return pq.size(); 
    }
}
