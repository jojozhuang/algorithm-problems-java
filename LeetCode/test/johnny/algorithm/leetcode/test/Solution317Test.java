package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution317;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution317Test {
    
    public Solution317Test() {
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
     * Test of shortestDistance method, of class Solution317.
     */
    @Test
    public void testShortestDistance() {
        System.out.println("shortestDistance");
        Solution317 instance = new Solution317();

        assertEquals(-1, instance.shortestDistance(null));
        
        int[][] grid2 = new int[][] {
            {1,0,2,0,1},
            {0,0,0,0,0},
            {0,0,1,0,0}
        };
        assertEquals(7, instance.shortestDistance(grid2));
    }
}
