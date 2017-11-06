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

import johnny.algorithm.leetcode.Solution645;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution645Test {
    
    public Solution645Test() {
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
     * Test of findErrorNums method, of class Solution645.
     */
    @Test
    public void testFindErrorNums() {
        System.out.println("findErrorNums");
        int[] nums = null;
        Solution645 instance = new Solution645();
        int[] expResult = new int[2];
        int[] result = instance.findErrorNums(nums);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{2,3}, instance.findErrorNums(new int[]{1,2,2,4}));
        assertArrayEquals(new int[]{3,2}, instance.findErrorNums(new int[]{1,3,3,4}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
