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

import johnny.algorithm.leetcode.Solution010;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution010Test {
    
    public Solution010Test() {
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
     * Test of isMatch method, of class Solution010.
     */
    @Test
    public void testIsMatch() {
        System.out.println("isMatch");
        String s = "";
        String p = "";
        Solution010 instance = new Solution010();
        boolean expResult = true;
        boolean result = instance.isMatch(s, p);
        assertEquals(expResult, result);
        assertEquals(false, instance.isMatch("aa","a"));
        assertEquals(true, instance.isMatch("aa","aa"));
        assertEquals(false, instance.isMatch("aaa","aa"));
        assertEquals(true, instance.isMatch("aa","a*"));
        assertEquals(true, instance.isMatch("aa",".*"));
        assertEquals(true, instance.isMatch("ab",".*"));
        assertEquals(true, instance.isMatch("aab","c*a*b"));
        assertEquals(true, instance.isMatch("aaa","ab*ac*a"));
        //assertEquals(true, instance.isMatch("abcd","d*"));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
