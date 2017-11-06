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

import johnny.algorithm.leetcode.Solution344;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution344Test {
    
    public Solution344Test() {
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
     * Test of reverseString method, of class Solution344.
     */
    @Test
    public void testReverseString() {
        System.out.println("reverseString");
        String s = "";
        Solution344 instance = new Solution344();
        String expResult = "";
        String result = instance.reverseString(s);
        assertEquals(expResult, result);
        
        assertEquals("a", instance.reverseString("a"));
        assertEquals("ba", instance.reverseString("ab"));
        assertEquals("olleh", instance.reverseString("hello"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
