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

import johnny.algorithm.leetcode.Solution520;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution520Test {
    
    public Solution520Test() {
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
     * Test of detectCapitalUse method, of class Solution520.
     */
    @Test
    public void testDetectCapitalUse() {
        System.out.println("detectCapitalUse");
        Solution520 instance = new Solution520();
        assertEquals(true, instance.detectCapitalUse(""));
        assertEquals(true, instance.detectCapitalUse("a"));
        assertEquals(true, instance.detectCapitalUse("A"));
        assertEquals(true, instance.detectCapitalUse("ab"));
        assertEquals(false, instance.detectCapitalUse("aB"));
        assertEquals(true, instance.detectCapitalUse("USA"));
        assertEquals(false, instance.detectCapitalUse("FlaG"));
        assertEquals(true, instance.detectCapitalUse("Leetcode"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
