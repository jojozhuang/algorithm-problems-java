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
public class Solution346Test {
    
    public Solution346Test() {
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
     * Test of next method, of class Solution346.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        int val = 0;
        Solution346 instance = new Solution346(3);
        double expResult = 0.0;
        double result = instance.next(val);
        assertEquals(expResult, result, 0.0);
        assertEquals(1.5, instance.next(3), 0.001);
        assertEquals(1, instance.next(0), 0.001);
        assertEquals(2, instance.next(3), 0.001);
        assertEquals(1, instance.next(0), 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
