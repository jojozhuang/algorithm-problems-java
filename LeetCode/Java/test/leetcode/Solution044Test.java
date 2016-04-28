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
public class Solution044Test {
    
    public Solution044Test() {
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
     * Test of isMatch method, of class Solution044.
     */
    @Test
    public void testIsMatch() {
        System.out.println("isMatch");
        String s = "";
        String p = "";
        Solution044 instance = new Solution044();
        boolean expResult = false;
        boolean result = instance.isMatch(s, p);
        assertEquals(expResult, result);
        
        assertEquals(false, instance.isMatch("aa","a"));
        assertEquals(true, instance.isMatch("aa","aa"));
        assertEquals(false, instance.isMatch("aaa","a"));
        assertEquals(true, instance.isMatch("aa","*"));
        assertEquals(true, instance.isMatch("aa","a*"));
        assertEquals(true, instance.isMatch("ab","?*"));
        assertEquals(false, instance.isMatch("aab","c*a*b"));
        //assertEquals(true, instance.isMatch("abbabaaabbabbaababbabbbbbabbbabbbabaaaaababababbbabababaabbababaabbbbbbaaaabababbbaabbbbaabbbbababababbaabbaababaabbbababababbbbaaabbbbbabaaaabbababbbbaababaabbababbbbbababbbabaaaaaaaabbbbbaabaaababaaaabb","**aa*****ba*a*bb**aa*ab****a*aaaaaa***a*aaaa**bbabb*b*b**aaaaaaaaa*a********ba*bbb***a*ba*bb*bb**a*b*bb"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
