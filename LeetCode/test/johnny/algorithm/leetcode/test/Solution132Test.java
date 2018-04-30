package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution132;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution132Test {
    
    public Solution132Test() {
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
     * Test of minCut method, of class Solution132.
     */
    @Test
    public void testMinCut() {
        System.out.println("minCut");
        Solution132 instance = new Solution132();

        assertEquals(0, instance.minCut(""));
        assertEquals(0,  instance.minCut("a"));
        assertEquals(1,  instance.minCut("ab"));
        assertEquals(0,  instance.minCut("aba"));
        assertEquals(2,  instance.minCut("abc"));
        assertEquals(1,  instance.minCut("aab"));
    }
}
