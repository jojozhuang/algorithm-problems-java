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
public class Solution264Test {
    
    public Solution264Test() {
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
     * Test of nthUglyNumber method, of class Solution264.
     */
    @Test
    public void testNthUglyNumber() {
        System.out.println("nthUglyNumber");
        int n = 0;
        Solution264 instance = new Solution264();
        int expResult = 0;
        int result = instance.nthUglyNumber(n);
        assertEquals(expResult, result);
        assertEquals(1, instance.nthUglyNumber(1));
        assertEquals(2, instance.nthUglyNumber(2));
        assertEquals(3, instance.nthUglyNumber(3));
        assertEquals(4, instance.nthUglyNumber(4));
        assertEquals(5, instance.nthUglyNumber(5));
        assertEquals(6, instance.nthUglyNumber(6));
        assertEquals(8, instance.nthUglyNumber(7));
        assertEquals(9, instance.nthUglyNumber(8));
        assertEquals(10, instance.nthUglyNumber(9));
        assertEquals(12, instance.nthUglyNumber(10));
        assertEquals(402653184, instance.nthUglyNumber(1352));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}