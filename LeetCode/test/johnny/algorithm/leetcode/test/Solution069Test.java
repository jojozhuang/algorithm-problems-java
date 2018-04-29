package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution069;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution069Test {
    
    public Solution069Test() {
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
     * Test of sqrt method, of class Solution069.
     */
    @Test
    public void testSqrt() {
        System.out.println("sqrt");
        int x = 0;
        Solution069 instance = new Solution069();
        int expResult = 0;
        int result = instance.sqrt(x);
        assertEquals(expResult, result);
        
        assertEquals(0, instance.sqrt(-1));
        assertEquals(1, instance.sqrt(1));
        assertEquals(2, instance.sqrt(4));
        assertEquals(1, instance.sqrt(3));
        assertEquals(3, instance.sqrt(9));
        assertEquals(3, instance.sqrt(10));
        assertEquals(3, instance.sqrt(15));
        assertEquals(4, instance.sqrt(16));
        assertEquals(10, instance.sqrt(100));
        assertEquals(15, instance.sqrt(255));
        assertEquals(16, instance.sqrt(256));
        assertEquals(46339, instance.sqrt(2147395599));
    }
}
