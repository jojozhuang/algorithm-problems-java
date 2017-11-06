/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
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
        Interval[] intervals = null;
        Solution253 instance = new Solution253();
        int expResult = 0;
        int result = instance.minMeetingRooms(intervals);
        assertEquals(expResult, result);
        
        Interval[] intervals2 = new Interval[3];
        intervals2[0] = new Interval(0, 30);
        intervals2[1] = new Interval(5, 10);
        intervals2[2] = new Interval(15, 20);
        assertEquals(2, instance.minMeetingRooms(intervals2));
        
         Interval[] intervals3 = new Interval[2];
        intervals3[0] = new Interval(5, 10);
        intervals3[1] = new Interval(15, 20);
        assertEquals(1, instance.minMeetingRooms(intervals3));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
