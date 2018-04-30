package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution291;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution291Test {
    
    public Solution291Test() {
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
     * Test of wordPatternMatch method, of class Solution291.
     */
    @Test
    public void testWordPatternMatch() {
        System.out.println("wordPatternMatch");
        Solution291 instance = new Solution291();

        assertEquals(true, instance.wordPatternMatch("", ""));
        assertEquals(true, instance.wordPatternMatch("abab", "redblueredblue"));
        assertEquals(true, instance.wordPatternMatch("aaaa", "asdasdasdasd"));
        assertEquals(false, instance.wordPatternMatch("aabb", "xyzabcxzyabc"));
    }
}
