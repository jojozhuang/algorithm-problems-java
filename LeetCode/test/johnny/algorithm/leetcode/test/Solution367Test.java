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

import johnny.algorithm.leetcode.Solution367;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution367Test {
    
    public Solution367Test() {
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
     * Test of isPerfectSquare method, of class Solution367.
     */
    @Test
    public void testIsPerfectSquare() {
        System.out.println("isPerfectSquare");
        int num = 0;
        Solution367 instance = new Solution367();
        boolean expResult = true;
        boolean result = instance.isPerfectSquare(num);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.isPerfectSquare(1));
        assertEquals(false, instance.isPerfectSquare(2));
        assertEquals(false, instance.isPerfectSquare(3));
        assertEquals(true, instance.isPerfectSquare(4));
        assertEquals(false, instance.isPerfectSquare(6));
        assertEquals(true, instance.isPerfectSquare(9));
        assertEquals(false, instance.isPerfectSquare(10));
        assertEquals(true, instance.isPerfectSquare(100));
        assertEquals(true, instance.isPerfectSquare(808201));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
