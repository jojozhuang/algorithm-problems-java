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
 * @author i857285
 */
public class Solution394Test {
    
    public Solution394Test() {
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
     * Test of decodeString method, of class Solution394.
     */
    @Test
    public void testDecodeString() {
        System.out.println("decodeString");
        String s = "";
        Solution394 instance = new Solution394();
        String expResult = "";
        String result = instance.decodeString(s);
        assertEquals(expResult, result);
        
        assertEquals("aaabcbc", instance.decodeString("3[a]2[bc]"));
        assertEquals("accaccacc", instance.decodeString("3[a2[c]]"));
        assertEquals("abcabccdcdcdef", instance.decodeString("2[abc]3[cd]ef"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
