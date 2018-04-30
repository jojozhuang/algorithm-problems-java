package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution231;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution231Test {
    
    public Solution231Test() {
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
     * Test of isPowerOfTwo method, of class Solution231.
     */
    @Test
    public void testIsPowerOfTwo() {
        System.out.println("isPowerOfTwo");
        Solution231 instance = new Solution231();

        assertEquals(false, instance.isPowerOfTwo(0));
        assertEquals(true, instance.isPowerOfTwo(1));
        assertEquals(true, instance.isPowerOfTwo(2));
        assertEquals(false, instance.isPowerOfTwo(3));
        assertEquals(true, instance.isPowerOfTwo(4));
        assertEquals(false, instance.isPowerOfTwo(5));
        assertEquals(true, instance.isPowerOfTwo(8));
        assertEquals(true, instance.isPowerOfTwo(16));
        assertEquals(false, instance.isPowerOfTwo(17));
    }
}
