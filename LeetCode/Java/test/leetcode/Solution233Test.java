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
public class Solution233Test {
    
    public Solution233Test() {
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
     * Test of countDigitOne method, of class Solution233.
     */
    @Test
    public void testCountDigitOne() {
        System.out.println("countDigitOne");
        int n = 0;
        Solution233 instance = new Solution233();
        int expResult = 0;
        int result = instance.countDigitOne(n);
        assertEquals(expResult, result);
        assertEquals(1, instance.countDigitOne(1));
        assertEquals(1, instance.countDigitOne(2));
        assertEquals(1, instance.countDigitOne(1));
        assertEquals(1, instance.countDigitOne(9));
        assertEquals(2, instance.countDigitOne(10));
        assertEquals(4, instance.countDigitOne(11));
        assertEquals(6, instance.countDigitOne(13));
        //assertEquals(767944060, instance.countDigitOne(824883294)); // timeout
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of countDigitOne2 method, of class Solution233.
     */
    @Test
    public void testCountDigitOne2() {
        System.out.println("countDigitOne2");
        int n = 0;
        Solution233 instance = new Solution233();
        int expResult = 0;
        int result = instance.countDigitOne2(n);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.countDigitOne2(1));
        assertEquals(1, instance.countDigitOne2(2));
        assertEquals(1, instance.countDigitOne2(1));
        assertEquals(1, instance.countDigitOne2(9));
        assertEquals(2, instance.countDigitOne2(10));
        assertEquals(4, instance.countDigitOne2(11));
        assertEquals(6, instance.countDigitOne2(13));
        assertEquals(767944060, instance.countDigitOne(824883294));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
