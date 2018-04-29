package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution214;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution214Test {
    
    public Solution214Test() {
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
     * Test of shortestPalindrome method, of class Solution214.
     */
    @Test
    public void testShortestPalindrome() {
        System.out.println("shortestPalindrome");
        String s = "";
        Solution214 instance = new Solution214();
        String expResult = "";
        String result = instance.shortestPalindrome(s);
        assertEquals(expResult, result);
        
        assertEquals("aaacecaaa", instance.shortestPalindrome("aacecaaa"));
        assertEquals("dcbabcd", instance.shortestPalindrome("abcd"));
        assertEquals("cabbac", instance.shortestPalindrome("abbac"));
        assertEquals("aba", instance.shortestPalindrome("ba"));
        assertEquals("bbabb", instance.shortestPalindrome("abb"));
        assertEquals("abbaabba", instance.shortestPalindrome("aabba"));
    }
}
