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
        assertEquals(3, result2.size());
        assertEquals(1, result2.get(0).start);
        assertEquals(6, result2.get(0).end);
        assertEquals(8, result2.get(1).start);
        assertEquals(10, result2.get(1).end);
        assertEquals(15, result2.get(2).start);
        assertEquals(18, result2.get(2).end);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
