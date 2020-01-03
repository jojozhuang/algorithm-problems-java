package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution352;
import johnny.algorithm.common.Interval;

public class Solution352Test extends JunitBase {

    @Test
    public void testAddNum() {
        System.out.println("addNum");
        Solution352 instance = new Solution352();

        instance.addNum(1);
        List<Interval> expect1 = Interval.buildList(new int[][] {{1,1}});
        List<Interval> result1 = instance.getIntervals();
        assertEquals(expect1, result1);

        instance.addNum(3);
        List<Interval> expect2 = Interval.buildList(new int[][] {{1,1},{3,3}});
        List<Interval> result2 = instance.getIntervals();
        assertEquals(expect2, result2);

        instance.addNum(7);
        List<Interval> expect3 = Interval.buildList(new int[][] {{1,1},{3,3},{7,7}});
        List<Interval> result3 = instance.getIntervals();
        assertEquals(expect3, result3);

        instance.addNum(2);
        List<Interval> expect4 = Interval.buildList(new int[][] {{1,3},{7,7}});
        List<Interval> result4 = instance.getIntervals();
        assertEquals(expect4, result4);

        instance.addNum(6);
        List<Interval> expect5 = Interval.buildList(new int[][] {{1,3},{6,7}});
        List<Interval> result5 = instance.getIntervals();
        assertEquals(expect5, result5);

        //["SummaryRanges","addNum","getIntervals","addNum","getIntervals"]
        //[[],[1],[],[0],[]]
        //Expected: [null,null,[[1,1]],null,[[0,1]]]
        Solution352 instance2 = new Solution352();
        instance2.addNum(1);
        List<Interval> expect21 = Interval.buildList(new int[][] {{1,1}});
        List<Interval> result21 = instance2.getIntervals();
        assertEquals(expect21, result21);

        instance2.addNum(0);
        List<Interval> expect22 = Interval.buildList(new int[][] {{0,1}});
        List<Interval> result22 = instance2.getIntervals();
        assertEquals(expect22, result22);

        //["SummaryRanges","addNum","getIntervals","addNum","getIntervals"]
        //[[],[6],[],[6],[]]
        //Expected: [null,null,[[6,6]],null,[[6,6]]]
        Solution352 instance3 = new Solution352();
        instance3.addNum(6);
        List<Interval> expect31 = Interval.buildList(new int[][] {{6,6}});
        List<Interval> result31 = instance3.getIntervals();
        assertEquals(expect31, result31);

        instance3.addNum(6);
        List<Interval> expect32 = Interval.buildList(new int[][] {{6,6}});
        List<Interval> result32 = instance3.getIntervals();
        assertEquals(expect32, result32);
        
        Solution352 instance4 = new Solution352();
        instance4.addNum(1);
        instance4.addNum(0);
        List<Interval> expect41 = Interval.buildList(new int[][] {{0,1}});
        List<Interval> result41 = instance4.getIntervals();
        assertEquals(expect41, result41);

        instance4.addNum(4);
        instance4.addNum(5);
        instance4.addNum(9);
        instance4.addNum(10);
        List<Interval> expect42 = Interval.buildList(new int[][] {{0,1},{4,5},{9,10}});
        List<Interval> result42 = instance4.getIntervals();
        assertEquals(expect42, result42);
        
        instance4.addNum(6);
        List<Interval> expect43 = Interval.buildList(new int[][] {{0,1},{4,6},{9,10}});
        List<Interval> result43 = instance4.getIntervals();
        assertEquals(expect43, result43);
    }
}
