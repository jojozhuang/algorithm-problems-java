package johnny.leetcode.algorithm;

import johnny.algorithm.common.Interval;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Solution352Test extends JunitBase {

    @Test
    public void testSummaryRanges() {
        System.out.println("SummaryRanges");
        Solution352 instance = new Solution352();

        instance.addNum(1);
        int[][] expect1 = new int[][] {{1,1}};
        assertArrayEquals(expect1, instance.getIntervals());

        instance.addNum(3);
        int[][] expect2 = new int[][] {{1,1},{3,3}};
        assertArrayEquals(expect2, instance.getIntervals());

        instance.addNum(7);
        int[][] expect3 = new int[][] {{1,1},{3,3},{7,7}};
        assertArrayEquals(expect3, instance.getIntervals());

        instance.addNum(2);
        int[][] expect4 = new int[][] {{1,3},{7,7}};
        assertArrayEquals(expect4, instance.getIntervals());

        instance.addNum(6);
        int[][]expect5 = new int[][] {{1,3},{6,7}};
        assertArrayEquals(expect5, instance.getIntervals());

        //["SummaryRanges","addNum","getIntervals","addNum","getIntervals"]
        //[[],[1],[],[0],[]]
        //Expected: [null,null,[[1,1]],null,[[0,1]]]
        Solution352 instance2 = new Solution352();
        instance2.addNum(1);
        int[][] expect21 = new int[][] {{1,1}};
        assertArrayEquals(expect21, instance2.getIntervals());

        instance2.addNum(0);
        int[][] expect22 = new int[][] {{0,1}};
        assertArrayEquals(expect22, instance2.getIntervals());

        //["SummaryRanges","addNum","getIntervals","addNum","getIntervals"]
        //[[],[6],[],[6],[]]
        //Expected: [null,null,[[6,6]],null,[[6,6]]]
        Solution352 instance3 = new Solution352();
        instance3.addNum(6);
        int[][] expect31 = new int[][] {{6,6}};
        assertArrayEquals(expect31, instance3.getIntervals());

        instance3.addNum(6);
        int[][] expect32 = new int[][] {{6,6}};
        assertArrayEquals(expect32, instance3.getIntervals());

        Solution352 instance4 = new Solution352();
        instance4.addNum(1);
        instance4.addNum(0);
        int[][] expect41 = new int[][] {{0,1}};
        assertArrayEquals(expect41, instance4.getIntervals());

        instance4.addNum(4);
        instance4.addNum(5);
        instance4.addNum(9);
        instance4.addNum(10);
        int[][] expect42 = new int[][] {{0,1},{4,5},{9,10}};
        assertArrayEquals(expect42, instance4.getIntervals());
        
        instance4.addNum(7);
        int[][] expect43 = new int[][] {{0,1},{4,5},{7,7},{9,10}};
        assertArrayEquals(expect43, instance4.getIntervals());
    }
}
