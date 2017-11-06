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

import johnny.algorithm.leetcode.Solution292;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution292Test {
    
    public Solution292Test() {
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
     * Test of canWinNim method, of class Solution292.
     */
    @Test
    public void testCanWinNim() {
        System.out.println("canWinNim");
        int n = 0;
        Solution292 instance = new Solution292();
        boolean expResult = false;
        boolean result = instance.canWinNim(n);
        assertEquals(false, instance.canWinNim(4));
        assertEquals(true, instance.canWinNim(3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
