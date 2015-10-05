/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution070Test {
    
    public Solution070Test() {
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
     * Test of climbStairs method, of class Solution070.
     */
    @Test
    public void testClimbStairs() {
        System.out.println("climbStairs");
        int n = 0;
        Solution070 instance = new Solution070();
        int expResult = 0;
        int result = instance.climbStairs2(n);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.climbStairs2(1));
        assertEquals(2, instance.climbStairs2(2));
        assertEquals(3, instance.climbStairs2(3));
        assertEquals(5, instance.climbStairs2(4));
        assertEquals(8, instance.climbStairs2(5));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
