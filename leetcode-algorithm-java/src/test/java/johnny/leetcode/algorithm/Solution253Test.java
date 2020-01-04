package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution253Test extends JunitBase {

    @Test
    public void testMinMeetingRooms() {
        System.out.println("minMeetingRooms");
        Solution253 instance = new Solution253();

        assertEquals(0, instance.minMeetingRooms(null));
        assertEquals(2, instance.minMeetingRooms(new int[][] {{0,30},{5,10},{15,20}}));
        assertEquals(1, instance.minMeetingRooms(new int[][] {{5,10},{15,20}}));
        assertEquals(2, instance.minMeetingRooms(new int[][]{{2,15},{36,45},{9,29},{16,23},{4,9}}));
    }
}
