package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution097;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution097Test {
    
    public Solution097Test() {
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
     * Test of isInterleave method, of class Solution097.
     */
    @Test
    public void testIsInterleave() {
        System.out.println("isInterleave");
        Solution097 instance = new Solution097();

        assertEquals(true, instance.isInterleave("", "", ""));
        assertEquals(true, instance.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        assertEquals(false, instance.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }
}
