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
public class Solution266Test {
    
    public Solution266Test() {
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
     * Test of canPermutePalindrome method, of class Solution266.
     */
    @Test
    public void testCanPermutePalindrome() {
        System.out.println("canPermutePalindrome");
        String s = "";
        Solution266 instance = new Solution266();
        boolean expResult = false;
        boolean result = instance.canPermutePalindrome(s);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.canPermutePalindrome("d"));
        assertEquals(false, instance.canPermutePalindrome("code"));
        assertEquals(true, instance.canPermutePalindrome("aab"));
        assertEquals(true, instance.canPermutePalindrome("carerac"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
