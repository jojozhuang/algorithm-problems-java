package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution313;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution313Test {
    
    public Solution313Test() {
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
     * Test of nthSuperUglyNumber method, of class Solution313.
     */
    @Test
    public void testNthSuperUglyNumber() {
        System.out.println("nthSuperUglyNumber");
        Solution313 instance = new Solution313();

        assertEquals(0, instance.nthSuperUglyNumber(0, null));
        assertEquals(32, instance.nthSuperUglyNumber(12, new int[]{2, 7, 13, 19}));
    }
}
