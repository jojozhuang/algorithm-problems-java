package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution327;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution327Test {
    
    public Solution327Test() {
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
     * Test of countRangeSum method, of class Solution327.
     */
    @Test
    public void testCountRangeSum() {
        System.out.println("countRangeSum");
        Solution327 instance = new Solution327();

        assertEquals(0, instance.countRangeSum(null, 0, 0));
        assertEquals(3, instance.countRangeSum(new int[]{-2, 5, -1}, -2, 2));
    }
}
