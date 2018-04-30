package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution076;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution076Test {
    
    public Solution076Test() {
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
     * Test of minWindow method, of class Solution076.
     */
    @Test
    public void testMinWindow() {
        System.out.println("minWindow");
        Solution076 instance = new Solution076();

        assertEquals("", instance.minWindow("", ""));
        assertEquals("a", instance.minWindow("a", "a"));
        assertEquals("BANC", instance.minWindow("ADOBECODEBANC", "ABC"));
    }
}
