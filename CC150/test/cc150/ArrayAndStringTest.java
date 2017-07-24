/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc150;

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
public class ArrayAndStringTest {
    
    public ArrayAndStringTest() {
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
     * Test of replaceSpaces method, of class ArrayAndString.
     */
    @Test
    public void testReplaceSpaces() {
        System.out.println("replaceSpaces");
        char[] str = {'a'};
        int length = str.length;
        ArrayAndString instance = new ArrayAndString();
        char[] ret1 = instance.replaceSpaces(str, length);
        char[] expResult1 = {'a'};
        assertArrayEquals(expResult1, ret1);
        
        char[] str2 = {'a', ' '};
        char[] ret2 = instance.replaceSpaces(str2, str2.length);
        char[] expResult2 = {'a','%','2','0'};
        assertArrayEquals(expResult2, ret2);
        
        char[] str3 = {'a', ' ', ' '};
        char[] ret3 = instance.replaceSpaces(str3, str3.length);
        char[] expResult3 = {'a','%','2','0','%','2','0'};
        assertArrayEquals(expResult3, ret3);
        
        char[] str4 = { ' ', 'a', ' ', ' ', 'b'};
        char[] ret4 = instance.replaceSpaces(str4, str4.length);
        char[] expResult4 = {'%','2','0','a','%','2','0','%','2','0','b'};
        assertArrayEquals(expResult4, ret4);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of compressBad method, of class ArrayAndString.
     */
    @Test
    public void testCompress() {
        System.out.println("compressBad");
        String str = "";
        ArrayAndString instance = new ArrayAndString();
        String expResult = "";
        String result = instance.compress(str);
        assertEquals(expResult, result);
        
        assertEquals("ab", instance.compress("ab"));
        assertEquals("abb", instance.compress("abb"));
        assertEquals("a1b1c5", instance.compress("abccccc"));
        assertEquals("a2b1c5a3", instance.compress("aabcccccaaa"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isUniqueChars method, of class ArrayAndString.
     */
    @Test
    public void testIsUniqueChars() {
        System.out.println("isUniqueChars");
        String str = "";
        ArrayAndString instance = new ArrayAndString();
        boolean expResult = false;
        boolean result = instance.isUniqueChars(str);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.isUniqueChars("a"));
        assertEquals(true, instance.isUniqueChars("ab"));
        assertEquals(false, instance.isUniqueChars("aba"));
        assertEquals(true, instance.isUniqueChars("abc"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of rotate method, of class ArrayAndString.
     */
    @Test
    public void testRotate() {
        System.out.println("rotate");
        int[][] matrix = null;
        int n = 0;
        ArrayAndString instance = new ArrayAndString();
        instance.rotate(matrix, n);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
