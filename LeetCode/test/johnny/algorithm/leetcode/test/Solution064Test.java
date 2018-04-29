package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution064;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution064Test {
    
    public Solution064Test() {
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
     * Test of minPathSum method, of class Solution064.
     */
    @Test
    public void testMinPathSum() {
        System.out.println("minPathSum");
        int[][] grid = null;
        Solution064 instance = new Solution064();
        int expResult = 0;
        int result = instance.minPathSum(grid);
        assertEquals(expResult, result);
        
        assertEquals(0, instance.minPathSum(new int[][]{}));
        assertEquals(0, instance.minPathSum(new int[][]{{}}));
        assertEquals(1, instance.minPathSum(new int[][]{{1}}));
        assertEquals(6, instance.minPathSum(new int[][]{{1,2,3}}));
        assertEquals(9, instance.minPathSum(new int[][]{{2},{3},{4}}));
        assertEquals(12, instance.minPathSum(new int[][]{{1,2,3},{4,5,6}}));
    }
}
