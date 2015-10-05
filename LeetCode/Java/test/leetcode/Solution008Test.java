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
public class Solution008Test {
    
    public Solution008Test() {
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
     * Test of atoi method, of class Solution008.
     */
    @Test
    public void testAtoi() {
        System.out.println("atoi");
        String str = "";
        Solution008 instance = new Solution008();
        int expResult = 0;
        int result = instance.atoi(str);
        assertEquals(expResult, result);
               
        assertEquals(123, instance.atoi("123"));
        assertEquals(2, instance.atoi("2"));
        assertEquals(0, instance.atoi("0"));
        assertEquals(-1, instance.atoi("-1"));       
        assertEquals(100, instance.atoi("100"));
        assertEquals(-900, instance.atoi("-900"));
        assertEquals(2147483647, instance.atoi("2147483647"));
        assertEquals(-2147483648, instance.atoi("-2147483648"));
        assertEquals(2147483647, instance.atoi("2147483648"));
        assertEquals(-2147483648, instance.atoi("-2147483649"));
        assertEquals(2147483647, instance.atoi("17412221212132343145345363847412"));
        assertEquals(-2147483648, instance.atoi("-18463847748498509509412"));
        assertEquals(10011000, instance.atoi("0010011000"));
        assertEquals(-23456, instance.atoi("-0023456"));
        assertEquals(0, instance.atoi("00000000"));
        assertEquals(0, instance.atoi("-00000000000000"));
        assertEquals(2147483647, instance.atoi("002147483647"));
        assertEquals(-2147483648, instance.atoi("-0002147483648"));
        assertEquals(2147483647, instance.atoi("002147483648"));
        assertEquals(-2147483648, instance.atoi("-0002147483649"));
        assertEquals(1, instance.atoi("1+"));
        assertEquals(1, instance.atoi("+1"));
        assertEquals(1, instance.atoi("1-"));
        assertEquals(0, instance.atoi("+-2"));
        assertEquals(10, instance.atoi("    010"));
        assertEquals(-9900, instance.atoi("    -00009900"));
        assertEquals(-134900, instance.atoi("-000134900   "));
        assertEquals(0, instance.atoi("-  00045657   "));
        assertEquals(-12, instance.atoi("  -0012a42"));
        assertEquals(0, instance.atoi("sdfsd  -0012a42"));
        assertEquals(0, instance.atoi("00-0012a42"));
        assertEquals(89, instance.atoi("089-0012a42"));
        assertEquals(-2147483647, instance.atoi("-2147483647"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
