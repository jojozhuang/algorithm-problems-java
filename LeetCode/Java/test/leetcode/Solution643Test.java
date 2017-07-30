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
public class Solution643Test {
    
    public Solution643Test() {
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
     * Test of findMaxAverage method, of class Solution643.
     */
    @Test
    public void testFindMaxAverage() {
        System.out.println("findMaxAverage");
        int[] nums = null;
        int k = 0;
        Solution643 instance = new Solution643();
        double expResult = 0.0;
        double result = instance.findMaxAverage(nums, k);
        assertEquals(expResult, result, 0.0);
        
        assertEquals(3, instance.findMaxAverage(new int[]{1,2,3}, 1), 0.0000001);
        assertEquals(2.5, instance.findMaxAverage(new int[]{1,2,3}, 2), 0.0000001);
        assertEquals(12.75, instance.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4), 0.0000001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
