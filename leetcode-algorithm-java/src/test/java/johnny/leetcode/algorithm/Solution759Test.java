package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution759;
import johnny.leetcode.algorithm.common.Interval;

public class Solution759Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("employeeFreeTime");
        Solution759 instance = new Solution759();

        List<List<Interval>> schedule1 = Interval.buildList(new int[][][] {{{1,2},{5,6}},{{1,3}},{{4,10}}});
        List<Interval> expect1 = Interval.buildList(new int[][] {{3,4}});
        assertEquals(expect1, instance.employeeFreeTime(schedule1));

        List<List<Interval>> schedule2 = Interval.buildList(new int[][][] {{{1,3},{6,7}},{{2,4}},{{2,5},{9,12}}});
        List<Interval> expect2 = Interval.buildList(new int[][] {{5,6},{7,9}});
        assertEquals(expect2, instance.employeeFreeTime(schedule2));
    }
}
