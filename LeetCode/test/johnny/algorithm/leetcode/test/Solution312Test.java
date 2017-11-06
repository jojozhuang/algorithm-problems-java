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

import johnny.algorithm.leetcode.Solution312;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution312Test {
    
    public Solution312Test() {
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
     * Test of maxCoins method, of class Solution312.
     */
    @Test
    public void testMaxCoins() {
        System.out.println("maxCoins");
        int[] nums = null;
        Solution312 instance = new Solution312();
        int expResult = 0;
        int result = instance.maxCoins(nums);
        assertEquals(expResult, result);
        
        assertEquals(167, instance.maxCoins(new int[]{3, 1, 5, 8}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
