package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution063;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution063Test {
    
    public Solution063Test() {
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
     * Test of uniquePathsWithObstacles method, of class Solution063.
     */
    @Test
    public void testUniquePathsWithObstacles() {
        System.out.println("uniquePathsWithObstacles");
        Solution063 instance = new Solution063();

        assertEquals(0, instance.uniquePathsWithObstacles(null));
        assertEquals(2, instance.uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));
        assertEquals(0, instance.uniquePathsWithObstacles(new int[][]{{1,0,0},{0,1,0},{0,0,0}}));
    }
}
