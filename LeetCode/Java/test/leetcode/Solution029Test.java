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
public class Solution029Test {
    
    public Solution029Test() {
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
     * Test of divide method, of class Solution029.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int dividend = 0;
        int divisor = 1;
        Solution029 instance = new Solution029();
        int expResult = 0;
        int result = instance.divide(dividend, divisor);
        assertEquals(expResult, result);
        
        assertEquals(expResult, instance.divide(13, 0));
        assertEquals(6, instance.divide(13, 2));
        assertEquals(0, instance.divide(1, 2));
        assertEquals(1, instance.divide(4, 4));
        assertEquals(1, instance.divide(7, 4));
        assertEquals(4, instance.divide(4, 1));
        assertEquals(15, instance.divide(63, 4));
        assertEquals(-15, instance.divide(63, -4));
        assertEquals(12, instance.divide(63, 5));
        assertEquals(Integer.MAX_VALUE, instance.divide(Integer.MAX_VALUE, 1));
        assertEquals(-Integer.MAX_VALUE, instance.divide(Integer.MAX_VALUE, -1));
        assertEquals(Integer.MIN_VALUE, instance.divide(Integer.MIN_VALUE, 1));
        assertEquals(Integer.MAX_VALUE, instance.divide(Integer.MIN_VALUE, -1));

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
