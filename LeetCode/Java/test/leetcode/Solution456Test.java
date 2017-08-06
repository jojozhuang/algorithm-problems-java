/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author i857285
 */
public class Solution456Test {
    
    public Solution456Test() {
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
     * Test of find132pattern method, of class Solution456.
     */
    @Test
    public void testFind132pattern() {
        System.out.println("find132pattern");
        int[] nums = null;
        Solution456 instance = new Solution456();
        boolean expResult = false;
        boolean result = instance.find132pattern(nums);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.find132pattern(new int[]{-2,1,2,-2,1,2}));
        assertEquals(true, instance.find132pattern(new int[]{3,5,0,3,4}));
        assertEquals(false, instance.find132pattern(new int[]{1,2,3,4}));
        assertEquals(true, instance.find132pattern(new int[]{3,1,4,2}));
        assertEquals(true, instance.find132pattern(new int[]{-1,3,2,0}));
        assertEquals(false, instance.find132pattern(new int[]{2,2,2,2}));
        assertEquals(false, instance.find132pattern(new int[]{2,3,2,0}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
