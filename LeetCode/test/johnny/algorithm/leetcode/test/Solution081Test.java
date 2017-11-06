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

import johnny.algorithm.leetcode.Solution081;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution081Test {
    
    public Solution081Test() {
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
     * Test of search method, of class Solution081.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        int[] nums = null;
        int target = 0;
        Solution081 instance = new Solution081();
        boolean expResult = false;
        boolean result = instance.search(nums, target);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.search(new int[] { 1 }, 1));
        assertEquals(false, instance.search(new int[] { 1 }, 0));
        assertEquals(true, instance.search(new int[] { 2, 1 }, 1));
        assertEquals(true, instance.search(new int[] { 2, 1 }, 2));
        assertEquals(false, instance.search(new int[] { 2, 1 }, 3));
        assertEquals(true, instance.search(new int[] { 2, 1, 1 }, 1));
        assertEquals(true, instance.search(new int[] { 1, 1, 2, 1 }, 2));
        assertEquals(false, instance.search(new int[] { 1, 1, 2, 1 }, 0));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
