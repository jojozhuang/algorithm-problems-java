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

import johnny.algorithm.leetcode.Solution541;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution541Test {
    
    public Solution541Test() {
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
     * Test of reverseStr method, of class Solution541.
     */
    @Test
    public void testReverseStr() {
        System.out.println("reverseStr");
        Solution541 instance = new Solution541();

        assertEquals("", instance.reverseStr("", 2));
        assertEquals("a", instance.reverseStr("a", -1));
        assertEquals("a", instance.reverseStr("a", 2));
        assertEquals("ba", instance.reverseStr("ab", 2));
        assertEquals("abc", instance.reverseStr("abc", 1));
        assertEquals("bacdfe", instance.reverseStr("abcdef", 2));
        assertEquals("bacdfeg", instance.reverseStr("abcdefg", 2));
        assertEquals("cbadef", instance.reverseStr("abcdef", 3));
        assertEquals("fedcba", instance.reverseStr("abcdef", 100));
        assertEquals("cbadefhg", instance.reverseStr("abcdefgh", 3));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
