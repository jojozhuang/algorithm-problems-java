/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;
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
public class Solution228Test {
    
    public Solution228Test() {
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
     * Test of summaryRanges method, of class Solution228.
     */
    @Test
    public void testSummaryRanges() {
        System.out.println("summaryRanges");
        int[] nums = null;
        Solution228 instance = new Solution228();
        List<String> expResult = new ArrayList<String>();
        List<String> result = instance.summaryRanges(nums);
        assertEquals(expResult, result);
        
        List<String> expResult2 = new ArrayList<String>();
        expResult2.add("1");
        assertEquals(expResult2, instance.summaryRanges(new int[]{1}));
        
        List<String> expResult3 = new ArrayList<String>();
        expResult3.add("1->2");
        assertEquals(expResult3, instance.summaryRanges(new int[]{1,2}));
        
        List<String> expResult4 = new ArrayList<String>();
        expResult4.add("1->2");
        expResult4.add("4");
        assertEquals(expResult4, instance.summaryRanges(new int[]{1,2,4}));
        
        List<String> expResult5 = new ArrayList<String>();
        expResult5.add("0->2");
        expResult5.add("4->5");
        expResult5.add("7");
        assertEquals(expResult5, instance.summaryRanges(new int[]{0,1,2,4,5,7}));
        
        List<String> expResult6 = new ArrayList<String>();
        expResult6.add("0->2");
        expResult6.add("4");
        expResult6.add("6->7");
        assertEquals(expResult6, instance.summaryRanges(new int[]{0,1,2,4,6,7}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
