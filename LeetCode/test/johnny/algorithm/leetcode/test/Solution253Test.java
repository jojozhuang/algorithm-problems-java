package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution253;
import johnny.algorithm.leetcode.common.Interval;

public class Solution253Test extends JunitBase {

    @Test
    public void testMinMeetingRooms() {
        System.out.println("minMeetingRooms");
        Solution253 instance = new Solution253();

        assertEquals(0, instance.minMeetingRooms(null));

        Interval[] intervals2 = Interval.buildArray(new int[][] {{0,30},{5,10},{15,20}});
        assertEquals(2, instance.minMeetingRooms(intervals2));

        Interval[] intervals3 =Interval.buildArray(new int[][] {{5,10},{15,20}});
        assertEquals(1, instance.minMeetingRooms(intervals3));
        
        Interval[] intervals4 = Interval.buildArray(new int[][]{{2,15},{36,45},{9,29},{16,23},{4,9}});
        assertEquals(2, instance.minMeetingRooms(intervals4));
    }
}
