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

import johnny.algorithm.leetcode.Solution279;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution279Test {
    
    public Solution279Test() {
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
     * Test of numSquares method, of class Solution279.
     */
    @Test
    public void testNumSquares() {
        System.out.println("numSquares");
        int n = 0;
        Solution279 instance = new Solution279();
        int expResult = 0;
        int result = instance.numSquares(n);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.numSquares(4));
        assertEquals(3, instance.numSquares(12));
        assertEquals(2, instance.numSquares(13));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
