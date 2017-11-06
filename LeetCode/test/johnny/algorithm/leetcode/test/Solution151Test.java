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

import johnny.algorithm.leetcode.Solution151;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution151Test {
    
    public Solution151Test() {
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
     * Test of reverseWords method, of class Solution151.
     */
    @Test
    public void testReverseWords() {
        System.out.println("reverseWords");
        String s = "";
        Solution151 instance = new Solution151();
        String expResult = "";
        String result = instance.reverseWords(s);
        assertEquals(expResult, result);
        
        assertEquals("vc", instance.reverseWords(" vc "));
        assertEquals("aa", instance.reverseWords(" aa "));
        assertEquals("the blue", instance.reverseWords("   blue   the  "));
        assertEquals("the sky is blue", instance.reverseWords("blue is sky the"));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
