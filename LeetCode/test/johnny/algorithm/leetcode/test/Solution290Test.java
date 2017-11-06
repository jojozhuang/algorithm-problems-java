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

import johnny.algorithm.leetcode.Solution290;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution290Test {
    
    public Solution290Test() {
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
     * Test of wordPattern method, of class Solution290.
     */
    @Test
    public void testWordPattern() {
        System.out.println("wordPattern");
        String pattern = "";
        String str = "";
        Solution290 instance = new Solution290();
        boolean expResult = false;
        boolean result = instance.wordPattern(pattern, str);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.wordPattern("abba", "dog cat cat dog"));
        assertEquals(false, instance.wordPattern("abba", "dog cat cat fish"));
        assertEquals(false, instance.wordPattern("aaaa", "dog cat cat dog"));
        assertEquals(false, instance.wordPattern("abba", "dog dog dog dog"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
