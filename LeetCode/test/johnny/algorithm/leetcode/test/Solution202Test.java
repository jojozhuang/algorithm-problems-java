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

import johnny.algorithm.leetcode.Solution202;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution202Test {
    
    public Solution202Test() {
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
     * Test of isHappy method, of class Solution202.
     */
    @Test
    public void testIsHappy() {
        System.out.println("isHappy");
        int n = 0;
        Solution202 instance = new Solution202();
        boolean expResult = false;
        boolean result = instance.isHappy(n);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.isHappy(7));
        assertEquals(true, instance.isHappy(10));
        assertEquals(true, instance.isHappy(19));
        assertEquals(false, instance.isHappy(33));
        assertEquals(false, instance.isHappy(11));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
