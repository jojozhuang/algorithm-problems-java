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
public class Solution316Test {
    
    public Solution316Test() {
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
     * Test of removeDuplicateLetters method, of class Solution316.
     */
    @Test
    public void testRemoveDuplicateLetters() {
        System.out.println("removeDuplicateLetters");
        String s = "";
        Solution316 instance = new Solution316();
        String expResult = "";
        String result = instance.removeDuplicateLetters(s);
        assertEquals(expResult, result);
        
        assertEquals("abc", instance.removeDuplicateLetters("bcabc"));
        assertEquals("acdb", instance.removeDuplicateLetters("cbacdcbc"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
