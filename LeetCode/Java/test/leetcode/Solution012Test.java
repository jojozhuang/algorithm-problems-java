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
public class Solution012Test {
    
    public Solution012Test() {
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
     * Test of intToRoman method, of class Solution012.
     */
    @Test
    public void testIntToRoman() {
        System.out.println("intToRoman");
        int num = 0;
        Solution012 instance = new Solution012();
        String expResult = "";
        String result = instance.intToRoman(num);
        assertEquals(expResult, result);
        
        assertEquals("", instance.intToRoman(-1));
        assertEquals("I", instance.intToRoman(1));
        assertEquals("II", instance.intToRoman(2));
        assertEquals("III", instance.intToRoman(3));
        assertEquals("IV", instance.intToRoman(4));
        assertEquals("V", instance.intToRoman(5));
        assertEquals("VI", instance.intToRoman(6));
        assertEquals("VII", instance.intToRoman(7));
        assertEquals("VIII", instance.intToRoman(8));
        assertEquals("IX", instance.intToRoman(9));
        assertEquals("X", instance.intToRoman(10));
        assertEquals("XI", instance.intToRoman(11));
        assertEquals("XIV", instance.intToRoman(14));
        assertEquals("XV", instance.intToRoman(15));
        assertEquals("XXI", instance.intToRoman(21));
        assertEquals("XXXIX", instance.intToRoman(39));
        assertEquals("XL", instance.intToRoman(40));
        assertEquals("XLVI", instance.intToRoman(46));
        assertEquals("XLVIII", instance.intToRoman(48));
        assertEquals("XLIX", instance.intToRoman(49));
        assertEquals("L", instance.intToRoman(50));
        assertEquals("LI", instance.intToRoman(51));
        assertEquals("LV", instance.intToRoman(55));
        assertEquals("LXXXVIII", instance.intToRoman(88));
        assertEquals("LXXXIX", instance.intToRoman(89));
        assertEquals("XC", instance.intToRoman(90));
        assertEquals("XCIII", instance.intToRoman(93));
        assertEquals("XCVIII", instance.intToRoman(98));
        assertEquals("XCIX", instance.intToRoman(99));
        assertEquals("C", instance.intToRoman(100));
        assertEquals("CI", instance.intToRoman(101));
        assertEquals("CIX", instance.intToRoman(109));
        assertEquals("CXXXIX", instance.intToRoman(139));
        assertEquals("CXL", instance.intToRoman(140));
        assertEquals("CL", instance.intToRoman(150));
        assertEquals("CLXXXIX", instance.intToRoman(189));
        assertEquals("CCIX", instance.intToRoman(209));
        assertEquals("CDXLIII", instance.intToRoman(443));
        assertEquals("CDXCIII", instance.intToRoman(493));
        assertEquals("CDXCIX", instance.intToRoman(499));        
        assertEquals("D", instance.intToRoman(500));
        assertEquals("CMXCIX", instance.intToRoman(999));
        assertEquals("M", instance.intToRoman(1000));
        assertEquals("MMMDCLXXXIX", instance.intToRoman(3689));
        assertEquals("MMMCMXCIX", instance.intToRoman(3999));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
