package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution248;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution248Test {
    
    public Solution248Test() {
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
     * Test of strobogrammaticInRange method, of class Solution248.
     */
    @Test
    public void testStrobogrammaticInRange() {
        System.out.println("strobogrammaticInRange");
        Solution248 instance = new Solution248();

        assertEquals(0,  instance.strobogrammaticInRange("", ""));
        assertEquals(2, instance.strobogrammaticInRange("1", "8"));
        assertEquals(3, instance.strobogrammaticInRange("2", "70"));
        assertEquals(1, instance.strobogrammaticInRange("88", "88"));
        assertEquals(39, instance.strobogrammaticInRange("0", "10000"));
    }
}
