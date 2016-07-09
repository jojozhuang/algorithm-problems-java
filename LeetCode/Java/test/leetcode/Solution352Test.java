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
public class Solution352Test {
    
    public Solution352Test() {
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
     * Test of addNum method, of class Solution352.
     */
    @Test
    public void testAddNum() {
        System.out.println("addNum");
        Solution352 instance = new Solution352();
        instance.addNum(1);
        List<Interval> expResult2 = new ArrayList<Interval>();
        expResult2.add(new Interval(1,1));
        List<Interval> result2 = instance.getIntervals();
        assertTrue(expResult2.containsAll(result2) && result2.containsAll(expResult2));
        
        instance.addNum(3);        
        List<Interval> result3 = instance.getIntervals();
        expResult2.add(new Interval(3,3));
        assertTrue(expResult2.containsAll(result3) && result3.containsAll(expResult2));
        
        instance.addNum(7);        
        List<Interval> result4 = instance.getIntervals();
        expResult2.add(new Interval(7,7));
        assertTrue(expResult2.containsAll(result4) && result4.containsAll(expResult2));
        
        instance.addNum(2);        
        List<Interval> result5 = instance.getIntervals();
        expResult2.remove(0);
        expResult2.remove(0);
        expResult2.add(0, new Interval(1,3));
        assertTrue(expResult2.containsAll(result5) && result5.containsAll(expResult2));
        
        instance.addNum(6);        
        List<Interval> result6 = instance.getIntervals();
        expResult2.remove(1);
        expResult2.add(new Interval(6,7));
        assertTrue(expResult2.containsAll(result6) && result6.containsAll(expResult2));
        
        //["SummaryRanges","addNum","getIntervals","addNum","getIntervals"]
        //[[],[1],[],[0],[]]
        //Expected: [null,null,[[1,1]],null,[[0,1]]]
        Solution352 instance3 = new Solution352();
        instance3.addNum(1);
        List<Interval> result31 = instance3.getIntervals();
        List<Interval> expResult3 = new ArrayList<Interval>();
        expResult3.add(new Interval(1,1));        
        assertTrue(expResult3.containsAll(result31) && result31.containsAll(expResult3));
        
        instance3.addNum(0);
        List<Interval> result32 = instance3.getIntervals();
        expResult3.remove(0);
        expResult3.add(new Interval(0,1));        
        assertTrue(expResult3.containsAll(result32) && result32.containsAll(expResult3));
        
        //["SummaryRanges","addNum","getIntervals","addNum","getIntervals"]
        //[[],[6],[],[6],[]]
        //Expected: [null,null,[[6,6]],null,[[6,6]]]
        Solution352 instance4 = new Solution352();
        instance4.addNum(6);
        List<Interval> result41 = instance4.getIntervals();
        List<Interval> expResult4 = new ArrayList<Interval>();
        expResult4.add(new Interval(6,6));        
        assertTrue(expResult4.containsAll(result41) && result41.containsAll(expResult4));
        
        instance4.addNum(6);
        List<Interval> result42 = instance4.getIntervals();
        assertTrue(expResult4.containsAll(result42) && result42.containsAll(expResult4));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }   
}
