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

import johnny.algorithm.leetcode.Solution340;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution340Test {
    
    public Solution340Test() {
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
     * Test of lengthOfLongestSubstringKDistinct method, of class Solution340.
     */
    @Test
    public void testLengthOfLongestSubstringKDistinct() {
        System.out.println("lengthOfLongestSubstringKDistinct");
        String s = "";
        int k = 0;
        Solution340 instance = new Solution340();
        int expResult = 0;
        int result = instance.lengthOfLongestSubstringKDistinct(s, k);
        assertEquals(expResult, result);
        
        assertEquals(3, instance.lengthOfLongestSubstringKDistinct("eceba", 2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
