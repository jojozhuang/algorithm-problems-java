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
    public int minMeetingRooms(Interval[] intervals) {  
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        
        Arrays.sort(intervals, new IntervalComparator());
         
        PriorityQueue<Integer> minHeap = new PriorityQueue();  
        for(int i = 0; i < intervals.length; i++) {  
            if(minHeap.size() == 0) {  
                minHeap.add(intervals[i].end);  
                continue;  
            }  
            if(minHeap.peek() <= intervals[i].start) {  
                minHeap.poll();  
                minHeap.add(intervals[i].end);  
            } else {  
                minHeap.add(intervals[i].end);  
            }  
        }  
        return minHeap.size(); 
    }
    public int minMeetingRooms2(Interval[] intervals) {  
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        
        Arrays.sort(intervals, new IntervalComparator());
         
        PriorityQueue<Integer> minHeap = new PriorityQueue();  
        int rooms = 0;  
        for(int i = 0; i < intervals.length; i++) {  
            if(minHeap.size() == 0) {  
                minHeap.add(intervals[i].end);  
                rooms++;  
                continue;  
            }  
            if(minHeap.peek() <= intervals[i].start) {  
                minHeap.poll();  
                minHeap.add(intervals[i].end);  
            } else {  
                minHeap.add(intervals[i].end);  
                rooms++;  
            }  
        }  
        return rooms; 
    }
    
    private class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval i1, Interval i2) {
            return i1.start - i2.start;
        }
    }
}
