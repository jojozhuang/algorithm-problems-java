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
        List<Interval> intervals = null;
        Solution252 instance = new Solution252();
        boolean expResult = false;
        boolean result = instance.canAttendMeetings(intervals);
        assertEquals(expResult, result);
        
        List<Interval> intervals2 = new ArrayList<Interval>(0);
        intervals2.add(new Interval(0, 30));
        intervals2.add(new Interval(5, 10));
        intervals2.add(new Interval(15, 20));        
        assertEquals(false, instance.canAttendMeetings(intervals2));
        
        List<Interval> intervals3 = new ArrayList<Interval>(0);
        intervals3.add(new Interval(5, 10));
        intervals3.add(new Interval(15, 20));        
        assertEquals(true, instance.canAttendMeetings(intervals3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
