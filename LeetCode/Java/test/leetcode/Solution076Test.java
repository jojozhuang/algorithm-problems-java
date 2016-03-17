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
public class Solution076Test {
    
    public Solution076Test() {
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
     * Test of minWindow method, of class Solution076.
     */
    @Test
    public void testMinWindow() {
        System.out.println("minWindow");
        String s = "";
        String t = "";
        Solution076 instance = new Solution076();
        String expResult = "";
        String result = instance.minWindow(s, t);
        assertEquals(expResult, result);
        
        assertEquals("a", instance.minWindow("a", "a"));
        assertEquals("BANC", instance.minWindow("ADOBECODEBANC", "ABC"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
