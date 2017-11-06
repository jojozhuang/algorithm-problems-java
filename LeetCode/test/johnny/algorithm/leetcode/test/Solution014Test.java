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

import johnny.algorithm.leetcode.Solution014;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution014Test {
    
    public Solution014Test() {
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
     * Test of longestCommonPrefix method, of class Solution014.
     */
    @Test
    public void testLongestCommonPrefix() {
        System.out.println("longestCommonPrefix");
        String[] strs = null;
        Solution014 instance = new Solution014();
        String expResult = "";
        String result = instance.longestCommonPrefix(strs);
        assertEquals(expResult, result);
        assertEquals("a", instance.longestCommonPrefix(new String[]{"a"}));
        assertEquals("", instance.longestCommonPrefix(new String[]{"", "abc", "abb"}));
        assertEquals("", instance.longestCommonPrefix(new String[]{"a", "b", "c"}));
        assertEquals("a", instance.longestCommonPrefix(new String[]{"a", "a", "a"}));
        assertEquals("ab", instance.longestCommonPrefix(new String[]{"abc", "ab", "ab"}));
        assertEquals("ab", instance.longestCommonPrefix(new String[]{"abcdef", "abc", "abb"}));
        assertEquals("abc", instance.longestCommonPrefix(new String[]{"abcdef", "abce", "abc123"}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
