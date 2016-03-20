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
 * @author Johnny
 */
public class Solution327Test {
    
    public Solution327Test() {
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
     * Test of countRangeSum method, of class Solution327.
     */
    @Test
    public void testCountRangeSum() {
        System.out.println("countRangeSum");
        int[] nums = null;
        int lower = 0;
        int upper = 0;
        Solution327 instance = new Solution327();
        int expResult = 0;
        int result = instance.countRangeSum(nums, lower, upper);
        assertEquals(expResult, result);
        
        assertEquals(3, instance.countRangeSum(new int[]{-2, 5, -1}, -2, 2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
