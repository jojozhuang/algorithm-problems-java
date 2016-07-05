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
public class Solution161Test {
    
    public Solution161Test() {
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
     * Test of isOneEditDistance method, of class Solution161.
     */
    @Test
    public void testIsOneEditDistance() {
        System.out.println("isOneEditDistance");
        String s = "";
        String t = "";
        Solution161 instance = new Solution161();
        boolean expResult = true;
        boolean result = instance.isOneEditDistance(s, t);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.isOneEditDistance("", "a"));
        assertEquals(true, instance.isOneEditDistance("a", ""));
        assertEquals(true, instance.isOneEditDistance("b", "a"));
        assertEquals(true, instance.isOneEditDistance("a", "a"));
        assertEquals(false, instance.isOneEditDistance("", "ab"));
        assertEquals(true, instance.isOneEditDistance("abc", "abcd"));
        assertEquals(true, instance.isOneEditDistance("aab", "acb"));
        assertEquals(false, instance.isOneEditDistance("abcd", "abbb"));
        assertEquals(false, instance.isOneEditDistance("ac", "abcde"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
