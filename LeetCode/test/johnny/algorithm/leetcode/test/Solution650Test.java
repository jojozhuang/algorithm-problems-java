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

import johnny.algorithm.leetcode.Solution650;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution650Test {
    
    public Solution650Test() {
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
     * Test of minSteps method, of class Solution650.
     */
    @Test
    public void testMinSteps() {
        System.out.println("minSteps");
        int n = 0;
        Solution650 instance = new Solution650();
        int expResult = 0;
        int result = instance.minSteps(n);
        assertEquals(expResult, result);
        
        assertEquals(2, instance.minSteps(2));
        assertEquals(3, instance.minSteps(3));
        assertEquals(4, instance.minSteps(4));
        assertEquals(5, instance.minSteps(5));
        assertEquals(6, instance.minSteps(8));
        assertEquals(6, instance.minSteps(9));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
