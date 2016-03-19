/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import leetcode.common.Interval;
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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if (newInterval == null) {
            return intervals;
        }
        List<Interval> res = new ArrayList<Interval>();
        
        Queue<Interval> queue = new LinkedList<Interval>();
        for(Interval item: intervals) {
            queue.offer(item);
        }
        
        boolean newadded = false;
        while(!queue.isEmpty()) {
            Interval curr = queue.poll();
            if (newInterval.end < curr.start) {
                res.add(newInterval);
                res.add(curr);
                newadded = true;
                break;
            }
            if (curr.end < newInterval.start) {
                res.add(curr);
                continue;
            }
            
            newInterval = new Interval(Math.min(curr.start, newInterval.start), 
                    Math.max(curr.end, newInterval.end));
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
