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

import johnny.algorithm.leetcode.Solution248;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution248Test {
    
    public Solution248Test() {
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
     * Test of strobogrammaticInRange method, of class Solution248.
     */
    @Test
    public void testStrobogrammaticInRange() {
        System.out.println("strobogrammaticInRange");
        String low = "";
        String high = "";
        Solution248 instance = new Solution248();
        int expResult = 0;
        int result = instance.strobogrammaticInRange(low, high);
        assertEquals(expResult, result);
        
        assertEquals(2, instance.strobogrammaticInRange("1", "8"));
        assertEquals(3, instance.strobogrammaticInRange("2", "70"));
        assertEquals(1, instance.strobogrammaticInRange("88", "88"));
        assertEquals(39, instance.strobogrammaticInRange("0", "10000"));

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
