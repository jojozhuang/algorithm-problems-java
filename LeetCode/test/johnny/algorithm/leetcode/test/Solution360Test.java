package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution360;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution360Test {
    
    public Solution360Test() {
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
     * Test of sortTransformedArray method, of class Solution360.
     */
    @Test
    public void testSortTransformedArray() {
        System.out.println("sortTransformedArray");
        Solution360 instance = new Solution360();

        assertArrayEquals(new int[]{}, instance.sortTransformedArray(null, 0, 0, 0));
        assertArrayEquals(new int[]{3, 9, 15, 33}, instance.sortTransformedArray(new int[]{-4, -2, 2, 4}, 1, 3, 5));
        assertArrayEquals(new int[]{-23, -5, 1, 7}, instance.sortTransformedArray(new int[]{-4, -2, 2, 4}, -1, 3, 5));
    }
}
