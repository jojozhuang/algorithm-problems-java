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
public class Solution006Test {
    
    public Solution006Test() {
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
     * Test of convert method, of class Solution006.
     */
    @Test
    public void testConvert() {
        System.out.println("convert");
        String s = "";
        int nRows = 0;
        Solution006 instance = new Solution006();
        String expResult = "";
        String result = instance.convert(s, nRows);
        assertEquals(expResult, result);
        
        assertEquals(null, instance.convert(null, nRows));
        assertEquals("A", instance.convert("A", 0));
        assertEquals("AB", instance.convert("AB", -1));
        assertEquals("ABC", instance.convert("ABC", 1));
        assertEquals("ACB", instance.convert("ABC", 2));
        assertEquals("ACBD", instance.convert("ABCD", 2));
        assertEquals("ABDC", instance.convert("ABCD", 3));
        assertEquals("AEBDFC", instance.convert("ABCDEF", 3));
        assertEquals("PAHNAPLSIIGYIR", instance.convert("PAYPALISHIRING", 3));
        assertEquals("AGBFHCEIKDJ", instance.convert("ABCDEFGHIJK", 4));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
