/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import leetcode.common.Interval;
import java.util.List;

/**
 * Merge Intervals.
 * Given a collection of intervals, merge all overlapping intervals.
 * 
 * For example,
 * Given [1,3],[2,6],[8,10],[15,18],
 * return [1,6],[8,10],[15,18].
 * 
 * @author Johnny
 */
public class Solution056 {
    public List<Interval> merge(List<Interval> inervals) {
        if (inervals == null || inervals.size() == 0) {
            return inervals;
        }
        
        Collections.sort(inervals, new IntervalComparator());
        
        List<Interval> res = new ArrayList<Interval>();
        Interval prev = inervals.get(0);
        
        for (int i = 1; i < inervals.size(); i++) {
            Interval curr = inervals.get(i);
            if (prev.end < curr.start) {
                res.add(prev);
                prev = curr;
            } else {
                Interval merge = new Interval(prev.start, Math.max(prev.end, curr.end));
                prev = merge;
            }
        }
        res.add(prev);
        
        return res;
    }
    
    private class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
        }
    }
}
