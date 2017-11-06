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

import johnny.algorithm.leetcode.Solution557;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution557Test {
    
    public Solution557Test() {
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
     * Test of reverseWords method, of class Solution557.
     */
    @Test
    public void testReverseWords() {
        System.out.println("reverseWords");
        Solution557 instance = new Solution557();
 
        assertEquals("", instance.reverseWords(""));
        assertEquals("a", instance.reverseWords("a"));
        assertEquals("ba", instance.reverseWords("ab"));
        assertEquals("ba", instance.reverseWords(" ab "));
        assertEquals("a b", instance.reverseWords("a b"));
        assertEquals("ba dc e", instance.reverseWords("ab cd e"));
        assertEquals("ba dc gfe", instance.reverseWords("ab cd efg"));
        assertEquals("s'teL ekat edoCteeL tsetnoc", instance.reverseWords("Let's take LeetCode contest"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
