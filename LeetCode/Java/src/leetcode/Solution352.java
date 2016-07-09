/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;
import leetcode.common.Interval;

/**
 * Data Stream as Disjoint Intervals.
 * Given a data stream input of non-negative integers a1, a2, ..., an, ..., 
 * summarize the numbers seen so far as a list of disjoint intervals.
 * 
 * For example, suppose the integers from the data stream are 1, 3, 7, 2, 6, ..., 
 * then the summary will be:
 * 
 * [1, 1]
 * [1, 1], [3, 3]
 * [1, 1], [3, 3], [7, 7]
 * [1, 3], [7, 7]
 * [1, 3], [6, 7]
 * Follow up:
 * What if there are lots of merges and the number of disjoint intervals are 
 * small compared to the data stream's size?
 * 
 * @author Johnny
 */
public class Solution352 {
     /** Initialize your data structure here. */
    List<Interval> intervals;
    public Solution352() {
        intervals = new ArrayList<Interval>();
    }
    
    public void addNum(int val) {
        if (intervals.size() == 0) {
            intervals.add(new Interval(val, val));
        } else {
            if (intervals.get(0).start >= val) {
                if (intervals.get(0).start == val) {
                    return;
                } else if (intervals.get(0).start == val + 1) {
                    intervals.get(0).start--;
                } else {
                    intervals.add(0, new Interval(val, val));
                }
            } else if (intervals.get(intervals.size() - 1).end <= val) {
                if (intervals.get(intervals.size() - 1).end == val) {
                    return;
                } else if (intervals.get(intervals.size() - 1).end == val - 1) {
                    intervals.get(intervals.size() - 1).end++;
                } else {
                    intervals.add(new Interval(val, val));
                }
            } else {
                int start = 0;
                int end = intervals.size() - 1;
                while (start + 1 < end) {
                    int mid = start + (end - start) / 2;
                    Interval itv = intervals.get(mid);
                    if (val >= itv.start && val <= itv.end) {
                        break; //ignore
                    } else if (val < itv.start) {
                        end = mid;
                    } else if (val > itv.end) {
                        start = mid;
                    }
                }
                // merge
                if (intervals.get(start).end == val - 1) {
                    intervals.get(start).end++;
                    if (intervals.get(start).end == intervals.get(end).start - 1) {
                        intervals.get(start).end = intervals.get(end).end;
                        intervals.remove(end);
                    }
                } else if (val + 1 == intervals.get(end).start) {
                    intervals.get(end).start--;
                } else {
                    intervals.add(end, new Interval(val, val));
                }
            }
        }        
    }
    
    public List<Interval> getIntervals() {
        return intervals;
    }
}
