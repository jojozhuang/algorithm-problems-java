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

import johnny.algorithm.leetcode.Solution628;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution628Test {
    
    public Solution628Test() {
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
     * Test of maximumProduct method, of class Solution628.
     */
    @Test
    public void testMaximumProduct() {
        System.out.println("maximumProduct");
        Solution628 instance = new Solution628();

        assertEquals(Integer.MIN_VALUE, instance.maximumProduct(new int[]{}));
        assertEquals(Integer.MIN_VALUE, instance.maximumProduct(new int[]{1}));
        assertEquals(6, instance.maximumProduct(new int[]{1,2,3}));
        assertEquals(0, instance.maximumProduct(new int[]{-1,0,1}));
        assertEquals(36, instance.maximumProduct(new int[]{-4,-3,2,3}));
        assertEquals(24, instance.maximumProduct(new int[]{1,2,3,4}));
        assertEquals(0, instance.maximumProduct(new int[]{-4,-3,-2,-1,0}));
        assertEquals(-6, instance.maximumProduct(new int[]{-4,-3,-2,-1}));
        assertEquals(18, instance.maximumProduct(new int[]{-3,-2,0,1,2,3}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
