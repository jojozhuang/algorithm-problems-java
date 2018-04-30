package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution402;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution402Test {
    
    public Solution402Test() {
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
     * Test of removeKdigits method, of class Solution402.
     */
    @Test
    public void testRemoveKdigits() {
        System.out.println("removeKdigits");
        Solution402 instance = new Solution402();

        assertEquals("0", instance.removeKdigits("", 0));
        assertEquals("1", instance.removeKdigits("54321", 4));
        assertEquals("4321", instance.removeKdigits("54321", 1));
        assertEquals("0", instance.removeKdigits("54321", 5));
        assertEquals("12345", instance.removeKdigits("12345", 0));
        assertEquals("0", instance.removeKdigits("10", 1));
        assertEquals("1219", instance.removeKdigits("1432219", 3));
        assertEquals("200", instance.removeKdigits("10200", 1));
        assertEquals("0", instance.removeKdigits("10", 2));
    }
}
