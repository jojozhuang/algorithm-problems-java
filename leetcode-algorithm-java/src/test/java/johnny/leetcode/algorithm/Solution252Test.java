package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution252Test extends JunitBase {

    @Test
    public void testCanAttendMeetings() {
        System.out.println("canAttendMeetings");
        Solution252 instance = new Solution252();

        assertEquals(true, instance.canAttendMeetings(null));
        assertEquals(false, instance.canAttendMeetings(new int[][] {{0,30},{5,10},{15,20}}));
        assertEquals(true, instance.canAttendMeetings(new int[][] {{5,10},{15,20}}));
    }
}
