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

import johnny.algorithm.leetcode.Solution066;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution066Test {
    
    public Solution066Test() {
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
     * Test of plusOne method, of class Solution066.
     */
    @Test
    public void testPlusOne() {
        System.out.println("plusOne");
        int[] digits = null;
        Solution066 instance = new Solution066();
        int[] expResult = null;
        int[] result = instance.plusOne(digits);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{1}, instance.plusOne(new int[]{0}));
        assertArrayEquals(new int[]{2}, instance.plusOne(new int[]{1}));
        assertArrayEquals(new int[]{1,0}, instance.plusOne(new int[]{9}));
        assertArrayEquals(new int[]{1,1}, instance.plusOne(new int[]{1,0}));
        assertArrayEquals(new int[]{2,0}, instance.plusOne(new int[]{1,9}));
        assertArrayEquals(new int[]{1,0,0}, instance.plusOne(new int[]{9,9}));
        assertArrayEquals(new int[]{1,0,1}, instance.plusOne(new int[]{1,0,0}));
        assertArrayEquals(new int[]{2,0,0}, instance.plusOne(new int[]{1,9,9}));
        assertArrayEquals(new int[]{9,9,0}, instance.plusOne(new int[]{9,8,9}));
        assertArrayEquals(new int[]{1,0,0,0}, instance.plusOne(new int[]{9,9,9}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
