package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution252;
import johnny.algorithm.leetcode.common.Interval;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution252Test {
    
    public Solution252Test() {
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
     * Test of canAttendMeetings method, of class Solution252.
     */
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
