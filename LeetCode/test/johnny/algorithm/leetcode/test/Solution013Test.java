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

import johnny.algorithm.leetcode.Solution013;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution013Test {
    
    public Solution013Test() {
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
     * Test of romanToInt method, of class Solution013.
     */
    @Test
    public void testRomanToInt() {
        System.out.println("romanToInt");
        String s = "";
        Solution013 instance = new Solution013();
        int expResult = 0;
        int result = instance.romanToInt(s);
        assertEquals(expResult, result);
        
        assertEquals(0, instance.romanToInt(""));
        assertEquals(1, instance.romanToInt("I"));
        assertEquals(2, instance.romanToInt("II"));
        assertEquals(3, instance.romanToInt("III"));
        assertEquals(4, instance.romanToInt("IV"));
        assertEquals(5, instance.romanToInt("V"));
        assertEquals(6, instance.romanToInt("VI"));
        assertEquals(7, instance.romanToInt("VII"));
        assertEquals(8, instance.romanToInt("VIII"));
        assertEquals(9, instance.romanToInt("IX"));
        assertEquals(10, instance.romanToInt("X"));
        assertEquals(11, instance.romanToInt("XI"));
        assertEquals(14, instance.romanToInt("XIV"));
        assertEquals(15, instance.romanToInt("XV"));
        assertEquals(21, instance.romanToInt("XXI"));
        assertEquals(39, instance.romanToInt("XXXIX"));
        assertEquals(40, instance.romanToInt("XL"));
        assertEquals(46, instance.romanToInt("XLVI"));
        assertEquals(48, instance.romanToInt("XLVIII"));
        assertEquals(49, instance.romanToInt("XLIX"));
        assertEquals(50, instance.romanToInt("L"));
        assertEquals(51, instance.romanToInt("LI"));
        assertEquals(55, instance.romanToInt("LV"));
        assertEquals(88, instance.romanToInt("LXXXVIII"));
        assertEquals(89, instance.romanToInt("LXXXIX"));
        assertEquals(90, instance.romanToInt("XC"));
        assertEquals(93, instance.romanToInt("XCIII"));
        assertEquals(98, instance.romanToInt("XCVIII"));
        assertEquals(99, instance.romanToInt("XCIX"));
        assertEquals(100, instance.romanToInt("C"));
        assertEquals(101, instance.romanToInt("CI"));
        assertEquals(109, instance.romanToInt("CIX"));
        assertEquals(139, instance.romanToInt("CXXXIX"));
        assertEquals(140, instance.romanToInt("CXL"));
        assertEquals(150, instance.romanToInt("CL"));
        assertEquals(189, instance.romanToInt("CLXXXIX"));
        assertEquals(209, instance.romanToInt("CCIX"));
        assertEquals(443, instance.romanToInt("CDXLIII"));
        assertEquals(493, instance.romanToInt("CDXCIII"));
        assertEquals(499, instance.romanToInt("CDXCIX"));        
        assertEquals(500, instance.romanToInt("D"));
        assertEquals(999, instance.romanToInt("CMXCIX"));
        assertEquals(1000, instance.romanToInt("M"));
        assertEquals(3689, instance.romanToInt("MMMDCLXXXIX"));
        assertEquals(3999, instance.romanToInt("MMMCMXCIX"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
