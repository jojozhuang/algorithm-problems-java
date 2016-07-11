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
public class Solution358Test {
    
    public Solution358Test() {
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
     * Test of rearrangeString method, of class Solution358.
     */
    @Test
    public void testRearrangeString() {
        System.out.println("rearrangeString");
        String str = "";
        int k = 0;
        Solution358 instance = new Solution358();
        String expResult = "";
        String result = instance.rearrangeString(str, k);
        assertEquals(expResult, result);
        
        assertTrue(instance.rearrangeString("aabbcc", 3).equals("abcabc")||instance.rearrangeString("aabbcc", 3).equals("acbacb"));
        //assertEquals("abcabc", instance.rearrangeString("aabbcc", 3));
        assertEquals("", instance.rearrangeString("aaabc", 3));
        assertTrue(instance.rearrangeString("aaadbbcc", 2).equals("abacabcd")||instance.rearrangeString("aaadbbcc", 2).equals("abcabcad"));
        //assertEquals("abacabcd", instance.rearrangeString("aaadbbcc", 2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
