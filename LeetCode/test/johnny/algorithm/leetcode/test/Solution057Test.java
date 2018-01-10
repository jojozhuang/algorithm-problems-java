package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution057;
import johnny.algorithm.leetcode.common.Interval;

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
        List<Interval> expResult2 = new ArrayList<Interval>();
        expResult2.add(new Interval(1,5));
        expResult2.add(new Interval(6,9));
        assertTrue(expResult2.containsAll(result2));
        
        List<Interval> inervals3 = new ArrayList<Interval>();
        inervals3.add(new Interval(1,2));
        inervals3.add(new Interval(3,5));
        inervals3.add(new Interval(6,7));
        inervals3.add(new Interval(8,10));
        inervals3.add(new Interval(12,16));
        List<Interval> result3 = instance.insert(inervals3, new Interval(4,9));
        List<Interval> expResult3 = new ArrayList<Interval>();
        expResult3.add(new Interval(1,2));
        expResult3.add(new Interval(3,10));
        expResult3.add(new Interval(12,16));
        assertTrue(expResult3.containsAll(result3));      
        
        List<Interval> inervals4 = new ArrayList<Interval>();
        List<Interval> result4 = instance.insert(inervals4, new Interval(5,7));
        List<Interval> expResult4 = new ArrayList<Interval>();
        expResult4.add(new Interval(5, 7));
        assertTrue(expResult4.containsAll(result4));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
