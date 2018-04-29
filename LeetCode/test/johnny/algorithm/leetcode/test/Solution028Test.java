package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution028;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution028Test {
    
    public Solution028Test() {
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
     * Test of strStr method, of class Solution028.
     */
    @Test
    public void testStrStr() {
        System.out.println("strStr");
        String haystack = "";
        String needle = "";
        Solution028 instance = new Solution028();
        int expResult = 0;
        int result = instance.strStr(haystack, needle);
        assertEquals(expResult, result);
        
        assertEquals(0, instance.strStr("A", ""));
        assertEquals(-1, instance.strStr("abcdedf", "cf"));
        assertEquals(2, instance.strStr("abcdedf", "cd"));
        assertEquals(5, instance.strStr("1234567890", "67"));
        assertEquals(4, instance.strStr("mississippi", "issip"));
    }
}
