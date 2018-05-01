package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution252;
import johnny.algorithm.leetcode.common.Interval;

public class Solution252Test extends JunitBase {

    @Test
    public void testCanAttendMeetings() {
        System.out.println("canAttendMeetings");
        Solution252 instance = new Solution252();

        assertEquals(true, instance.canAttendMeetings(null));

        Interval[] intervals1 = Interval.buildArray(new int[][] {{0,30},{5,10},{15,20}});
        assertEquals(false, instance.canAttendMeetings(intervals1));

        Interval[] intervals2 = Interval.buildArray(new int[][] {{5,10},{15,20}});
        assertEquals(true, instance.canAttendMeetings(intervals2));
    }
}
