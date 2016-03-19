/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;
import leetcode.common.Interval;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution057Test {
    
    public Solution057Test() {
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
     * Test of insert method, of class Solution057.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        List<Interval> intervals = null;
        Interval newInterval = null;
        Solution057 instance = new Solution057();
        List<Interval> expResult = null;
        List<Interval> result = instance.insert(intervals, newInterval);
        assertEquals(expResult, result);
        
        List<Interval> inervals2 = new ArrayList<Interval>();
        inervals2.add(new Interval(1,3));
        inervals2.add(new Interval(6,9));
        List<Interval> result2 = instance.insert(inervals2, new Interval(2,5));
        assertEquals(2, result2.size());
        assertEquals(1, result2.get(0).start);
        assertEquals(5, result2.get(0).end);
        assertEquals(6, result2.get(1).start);
        assertEquals(9, result2.get(1).end);
        
        List<Interval> inervals3 = new ArrayList<Interval>();
        inervals3.add(new Interval(1,2));
        inervals3.add(new Interval(3,5));
        inervals3.add(new Interval(6,7));
        inervals3.add(new Interval(8,10));
        inervals3.add(new Interval(12,16));
        List<Interval> result3 = instance.insert(inervals3, new Interval(4,9));
        assertEquals(3, result3.size());
        assertEquals(1, result3.get(0).start);
        assertEquals(2, result3.get(0).end);
        assertEquals(3, result3.get(1).start);
        assertEquals(10, result3.get(1).end);
        assertEquals(12, result3.get(2).start);
        assertEquals(16, result3.get(2).end);
        
        List<Interval> inervals4 = new ArrayList<Interval>();
        List<Interval> result4 = instance.insert(inervals4, new Interval(5,7));
        assertEquals(1, result4.size());
        assertEquals(5, result4.get(0).start);
        assertEquals(7, result4.get(0).end);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
