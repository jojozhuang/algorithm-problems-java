package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution005;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution005Test {
    
    public Solution005Test() {
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
     * Test of longestPalindrome method, of class Solution005.
     */
    @Test
    public void testLongestPalindrome() {
        System.out.println("longestPalindrome");
        String s = "";
        Solution005 instance = new Solution005();
        String expResult = "";
        String result = instance.longestPalindrome(s);
        assertEquals(expResult, result);
        
        //assertEquals("", instance.longestPalindrome("ab"));
        assertEquals("cac", instance.longestPalindrome("abcac"));
        assertEquals("aba", instance.longestPalindrome("aba"));
        assertEquals("abcddcba", instance.longestPalindrome("abcddcba"));
        assertEquals("cdzdc", instance.longestPalindrome("abcdzdcab"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}