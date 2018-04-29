package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution223;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution223Test {
    
    public Solution223Test() {
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
     * Test of computeArea method, of class Solution223.
     */
    @Test
    public void testComputeArea() {
        System.out.println("computeArea");
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int E = 0;
        int F = 0;
        int G = 0;
        int H = 0;
        Solution223 instance = new Solution223();
        int expResult = 0;
        int result = instance.computeArea(A, B, C, D, E, F, G, H);
        assertEquals(expResult, result);
        
        assertEquals(45, instance.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
        assertEquals(24, instance.computeArea(-3, 0, 3, 4, -3, 0, 3, 2));
    }
}
