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

import johnny.algorithm.leetcode.Solution056;
import johnny.algorithm.leetcode.common.Interval;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution056Test {
    
    public Solution056Test() {
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
     * Test of merge method, of class Solution056.
     */
    @Test
    public void testMerge() {
        System.out.println("merge");
        List<Interval> inervals = null;
        Solution056 instance = new Solution056();
        List<Interval> expResult = null;
        List<Interval> result = instance.merge(inervals);
        assertEquals(expResult, result);
        
        List<Interval> inervals2 = new ArrayList<Interval>();
        inervals2.add(new Interval(1,3));
        inervals2.add(new Interval(2,6));
        inervals2.add(new Interval(8,10));
        inervals2.add(new Interval(15,18));
        List<Interval> result2 = instance.merge(inervals2);
        
        List<Interval> expResult2 = new ArrayList<Interval>();
        expResult2.add(new Interval(1,6));
        expResult2.add(new Interval(8,10));
        expResult2.add(new Interval(15,18));
        assertTrue(expResult2.containsAll(result2));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
