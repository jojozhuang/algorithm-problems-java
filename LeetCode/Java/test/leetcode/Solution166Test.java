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
public class Solution166Test {
    
    public Solution166Test() {
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
     * Test of fractionToDecimal method, of class Solution166.
     */
    @Test
    public void testFractionToDecimal() {
        System.out.println("fractionToDecimal");
        int numerator = 0;
        int denominator = 0;
        Solution166 instance = new Solution166();
        String expResult = "";
        String result = instance.fractionToDecimal(numerator, denominator);
        assertEquals(expResult, result);
        
        assertEquals("0.5", instance.fractionToDecimal(1, 2));
        assertEquals("2", instance.fractionToDecimal(2, 1));
        assertEquals("0.(6)", instance.fractionToDecimal(2, 3));
        assertEquals("0.(3)", instance.fractionToDecimal(1, 3));
        assertEquals("-0.(6)", instance.fractionToDecimal(-2, 3));
        assertEquals("0.(142857)", instance.fractionToDecimal(1, 7));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
