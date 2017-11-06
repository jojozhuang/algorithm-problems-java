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

import johnny.algorithm.leetcode.Solution273;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution273Test {
    
    public Solution273Test() {
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
     * Test of numberToWords method, of class Solution273.
     */
    @Test
    public void testNumberToWords() {
        System.out.println("numberToWords");
        int num = 0;
        Solution273 instance = new Solution273();
        String expResult = "Zero";
        String result = instance.numberToWords(num);
        assertEquals(expResult, result);
        
        assertEquals("One Hundred", instance.numberToWords(100));        
        assertEquals("One Thousand", instance.numberToWords(1000));
        assertEquals("Two Thousand", instance.numberToWords(2000));
        assertEquals("One Thousand One Hundred", instance.numberToWords(1100));
        assertEquals("One Million", instance.numberToWords(1000000));
        assertEquals("Two Million", instance.numberToWords(2000000));
        assertEquals("One Billion", instance.numberToWords(1000000000));
        assertEquals("One Hundred Twenty Three", instance.numberToWords(123));
        assertEquals("Twelve Thousand Three Hundred Forty Five", instance.numberToWords(12345));
        assertEquals("Fifty Thousand Eight Hundred Sixty Eight", instance.numberToWords(50868));
        assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven", instance.numberToWords(1234567));
        assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred", instance.numberToWords(1234500));
        assertEquals("One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand One", instance.numberToWords(1234567001));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
