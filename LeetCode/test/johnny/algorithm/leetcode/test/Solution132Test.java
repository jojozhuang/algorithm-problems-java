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

import johnny.algorithm.leetcode.Solution132;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution132Test {
    
    public Solution132Test() {
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
     * Test of minCut method, of class Solution132.
     */
    @Test
    public void testMinCut() {
        System.out.println("minCut");
        String s = "";
        Solution132 instance = new Solution132();
        int expResult = 0;
        int result = instance.minCut(s);
        assertEquals(expResult, result);
        
        assertEquals(0,  instance.minCut("a"));
        assertEquals(1,  instance.minCut("ab"));
        assertEquals(0,  instance.minCut("aba"));
        assertEquals(2,  instance.minCut("abc"));
        assertEquals(1,  instance.minCut("aab"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
