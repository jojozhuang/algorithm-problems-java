/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution325;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution325Test {
    
    public Solution325Test() {
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
     * Test of maxSubArrayLen method, of class Solution325.
     */
    @Test
    public void testMaxSubArrayLen() {
        System.out.println("maxSubArrayLen");
        int[] nums = null;
        int k = 0;
        Solution325 instance = new Solution325();
        int expResult = 0;
        int result = instance.maxSubArrayLen(nums, k);
        assertEquals(expResult, result);
        
        assertEquals(4, instance.maxSubArrayLen(new int[]{1, -1, 5, -2, 3}, 3));
        assertEquals(2, instance.maxSubArrayLen(new int[]{-2, -1, 2, 1}, 1));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
