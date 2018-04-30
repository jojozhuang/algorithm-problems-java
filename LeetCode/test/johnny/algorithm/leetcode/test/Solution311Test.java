package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution311;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution311Test {
    
    public Solution311Test() {
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
     * Test of multiply method, of class Solution311.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        Solution311 instance = new Solution311();

        assertArrayEquals(new int[][]{}, instance.multiply(null, null));
        
        int[][] A2 = new int[][]{
            {1, 0, 0},
            {-1, 0, 3}
        };
        int[][] B2 = new int[][]{
            {7, 0, 0},
            {0, 0, 0},
            {0, 0, 1}
        };
        int[][] expect2 = new int[][]{
            {7, 0, 0},
            {-7, 0, 3}
        };
        assertArrayEquals(expect2, instance.multiply(A2, B2));
    }
}
