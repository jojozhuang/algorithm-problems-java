package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution342;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution342Test {
    
    public Solution342Test() {
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
     * Test of isPowerOfFour method, of class Solution342.
     */
    @Test
    public void testIsPowerOfFour() {
        System.out.println("isPowerOfFour");
        int num = 0;
        Solution342 instance = new Solution342();
        boolean expResult = false;
        boolean result = instance.isPowerOfFour(num);
        assertEquals(expResult, result);
        
        assertEquals(false, instance.isPowerOfFour(2));
        assertEquals(true, instance.isPowerOfFour(4));
        assertEquals(false, instance.isPowerOfFour(5));
        assertEquals(false, instance.isPowerOfFour(8));
        assertEquals(true, instance.isPowerOfFour(16));
        assertEquals(true, instance.isPowerOfFour(64));
    }
}
