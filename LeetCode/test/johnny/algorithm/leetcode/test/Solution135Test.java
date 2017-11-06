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

import johnny.algorithm.leetcode.Solution135;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution135Test {
    
    public Solution135Test() {
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
     * Test of candy method, of class Solution135.
     */
    @Test
    public void testCandy() {
        System.out.println("candy");
        int[] ratings = null;
        Solution135 instance = new Solution135();
        int expResult = 0;
        int result = instance.candy(ratings);
        assertEquals(expResult, result);
        
        assertEquals(12, instance.candy(new int[]{1,4,3,1,2,3}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
