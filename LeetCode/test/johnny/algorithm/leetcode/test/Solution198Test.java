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

import johnny.algorithm.leetcode.Solution198;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution198Test {
    
    public Solution198Test() {
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
     * Test of rob method, of class Solution198.
     */
    @Test
    public void testRob() {
        System.out.println("rob");
        int[] nums = null;
        Solution198 instance = new Solution198();
        int expResult = 0;
        int result = instance.rob(nums);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.rob(new int[]{1}));
        assertEquals(2, instance.rob(new int[]{1,2}));
        assertEquals(3, instance.rob(new int[]{1,3,1}));
        assertEquals(2, instance.rob(new int[]{1,1,1,1}));
        assertEquals(4, instance.rob(new int[]{1,2,3}));
        assertEquals(13, instance.rob(new int[]{1,4,5,6,7}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
