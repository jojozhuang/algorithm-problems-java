package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution253;
import johnny.algorithm.leetcode.common.Interval;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution253Test {
    
    public Solution253Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of minMeetingRooms method, of class Solution253.
     */
    @Test
    public void testMinMeetingRooms() {
        System.out.println("minMeetingRooms");
        Solution253 instance = new Solution253();

        assertEquals(0, instance.minMeetingRooms(null));
        
        Interval[] intervals2 = Interval.buildArray(new int[][] {{0,30},{5,10},{15,20}});
        assertEquals(2, instance.minMeetingRooms(intervals2));
        
         Interval[] intervals3 =Interval.buildArray(new int[][] {{5,10},{15,20}});
        assertEquals(1, instance.minMeetingRooms(intervals3));
    }
}
