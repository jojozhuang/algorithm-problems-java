/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import johnny.algorithm.leetcode.common.Interval;

/**
 * Meeting Rooms.
 * 
 * Given an array of meeting time intervals consisting of start and end times 
 * [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend 
 * all meetings.
 * 
 * For example,
 * Given [[0, 30],[5, 10],[15, 20]], return false. 
 * 
 * @author Johnny
 */
public class Solution252 {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals == null || intervals.size() == 0) {
            return false;
        }
        
        Collections.sort(intervals, new IntervalComparator());
        
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i - 1).end > intervals.get(i).start) {
                return false;
            }
        }
        
        return true;
    }
    
    private class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval i1, Interval i2) {
            return i1.start - i2.start;
        }
    }
}
