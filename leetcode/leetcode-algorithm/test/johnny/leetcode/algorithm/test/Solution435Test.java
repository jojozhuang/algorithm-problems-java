package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution435;
import johnny.leetcode.algorithm.common.Interval;

public class Solution435Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("eraseOverlapIntervals");
        Solution435 instance = new Solution435();

        Interval[] intervals1 = Interval.buildArray(new int[][] { {1,2}, {2,3}, {3,4}, {1,3} });
        assertEquals(1, instance.eraseOverlapIntervals(intervals1));

        Interval[] intervals2 = Interval.buildArray(new int[][] { {1,2}, {1,2}, {1,2} });
        assertEquals(2, instance.eraseOverlapIntervals(intervals2));

        Interval[] intervals3 = Interval.buildArray(new int[][] { {1,2}, {2,3} });
        assertEquals(0, instance.eraseOverlapIntervals(intervals3));

        Interval[] intervals4 = Interval.buildArray(new int[][] {{1,2}});
        assertEquals(0, instance.eraseOverlapIntervals(intervals4));
        
        Interval[] intervals5 = Interval.buildArray(new int[][] {{1,100},{11,22},{1,11},{2,12}});
        assertEquals(2, instance.eraseOverlapIntervals(intervals5));
    }
}
