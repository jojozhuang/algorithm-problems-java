package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import johnny.leetcode.algorithm.common.Interval;
import java.util.List;
import java.util.Queue;

/**
 * Insert Interval.
 * Given a set of non-overlapping intervals, insert a new interval into the 
 * intervals (merge if necessary).
 * 
 * You may assume that the intervals were initially sorted according to their
 * start times.
 * 
 * Example 1:
 * Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].
 * 
 * Example 2:
 * Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].
 * 
 * This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
 * 
 * @author Johnny
 */
public class Solution057 {
    //https://discuss.leetcode.com/topic/7808/short-and-straight-forward-java-solution/2
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if (newInterval == null) {
            return intervals;
        }
        
        List<Interval> res = new ArrayList<Interval>();
        if (intervals == null || intervals.size() == 0) {
            res.add(newInterval);
            return res;
        }
        
        int i = 0;
        // add all the intervals ending before newInterval starts
        while (i < intervals.size() && intervals.get(i).end < newInterval.start) {
            res.add(intervals.get(i++));
        }
        // merge all overlapping intervals to one considering newInterval
        while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
            newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
            i++;
        }
        res.add(newInterval); // add the union of intervals we got
        // add all the rest
        while (i < intervals.size()) {
            res.add(intervals.get(i++));
        } 
        return res;
    }
    
    public List<Interval> insert3(List<Interval> intervals, Interval newInterval) {
        if (newInterval == null) {
            return intervals;
        }
        
        List<Interval> res = new ArrayList<Interval>();
        if (intervals == null || intervals.size() == 0) {
            res.add(newInterval);
            return res;
        }

        for (int i = 0; i < intervals.size(); i++) {
            Interval curr = intervals.get(i);
            if (newInterval == null) {
                res.add(curr);
                continue;
            }
            if (curr.start > newInterval.end) {
                res.add(newInterval);
                res.add(curr);
                newInterval = null;
            } else if (curr.end < newInterval.start) {
                res.add(curr);
            } else {
                newInterval.start = Math.min(newInterval.start, curr.start);
                newInterval.end = Math.max(newInterval.end, curr.end);
            }
        }
        
        if (newInterval != null) {
            res.add(newInterval);
        }
        return res;
    }
    
    public List<Interval> insert2(List<Interval> intervals, Interval newInterval) {
        if (newInterval == null) {
            return intervals;
        }
        
        List<Interval> res = new ArrayList<Interval>();
        if (intervals == null || intervals.size() == 0) {
            res.add(newInterval);
            return res;
        }
        
        Queue<Interval> queue = new LinkedList<Interval>();
        for (Interval item: intervals) {
            queue.offer(item);
        }
        
        boolean newadded = false;
        while (!queue.isEmpty()) {
            Interval curr = queue.poll();
            if (newInterval.end < curr.start) {
                res.add(newInterval);
                res.add(curr);
                newadded = true;
                break;
            } else if (curr.end < newInterval.start) {
                res.add(curr);
            } else {
                newInterval.start = Math.min(newInterval.start, curr.start);
                newInterval.end = Math.max(newInterval.end, curr.end);
            }
        }    
        
        if (!newadded) {
            res.add(newInterval);
        } else {
             while(!queue.isEmpty()) {
                res.add(queue.poll());
            }
        }
        
        return res;
    }   
}
