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

import johnny.algorithm.leetcode.Solution159;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution159Test {
    
    public Solution159Test() {
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
     * Test of lengthOfLongestSubstringTwoDistinct method, of class Solution159.
     */
    @Test
    public void testLengthOfLongestSubstringTwoDistinct() {
        System.out.println("lengthOfLongestSubstringTwoDistinct");
        String s = "";
        Solution159 instance = new Solution159();
        int expResult = 0;
        int result = instance.lengthOfLongestSubstringTwoDistinct(s);
        assertEquals(expResult, result);
        
        assertEquals(3, instance.lengthOfLongestSubstringTwoDistinct("eceba"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
