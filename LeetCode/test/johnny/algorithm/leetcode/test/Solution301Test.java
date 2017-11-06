/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution301;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution301Test {
    
    public Solution301Test() {
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
     * Test of removeInvalidParentheses method, of class Solution301.
     */
    @Test
    public void testRemoveInvalidParentheses() {
        System.out.println("removeInvalidParentheses");
        String s = "";
        Solution301 instance = new Solution301();
        List<String> expResult = new ArrayList<String>();
        expResult.add("");
        List<String> result = instance.removeInvalidParentheses(s);
        assertEquals(expResult, result);
        
        List<String> result2 = instance.removeInvalidParentheses("()())()");
        assertEquals(2, result2.size());
        assertEquals("()()()", result2.get(0));
        assertEquals("(())()", result2.get(1));
        
        List<String> result3 = instance.removeInvalidParentheses("(a)())()");
        assertEquals(2, result3.size());
        assertEquals("(a)()()", result3.get(0));
        assertEquals("(a())()", result3.get(1));
        
        List<String> result4 = instance.removeInvalidParentheses(")(");
        assertEquals(1, result4.size());
        assertEquals("", result4.get(0));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
}
