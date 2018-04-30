package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution343;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution343Test {
    
    public Solution343Test() {
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
     * Test of integerBreak method, of class Solution343.
     */
    @Test
    public void testIntegerBreak() {
        System.out.println("integerBreak");
        Solution343 instance = new Solution343();

        assertEquals(0, instance.integerBreak(0));
        assertEquals(1, instance.integerBreak(2));
        assertEquals(2, instance.integerBreak(3));
        assertEquals(4, instance.integerBreak(4));
        assertEquals(6, instance.integerBreak(5));
        assertEquals(9, instance.integerBreak(6));
        assertEquals(12, instance.integerBreak(7));
        assertEquals(18, instance.integerBreak(8));
        assertEquals(27, instance.integerBreak(9));
        assertEquals(36, instance.integerBreak(10));
    }
}
