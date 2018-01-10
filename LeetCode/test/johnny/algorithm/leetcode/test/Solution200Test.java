package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution200;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution200Test {
    
    public Solution200Test() {
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
     * Test of numIslands method, of class Solution200.
     */
    @Test
    public void testNumIslands() {
        System.out.println("numIslands");
        char[][] grid = null;
        Solution200 instance = new Solution200();
        int expResult = 0;
        int result = instance.numIslands(grid);
        assertEquals(expResult, result);
        
        char[][] grid2 = new char[][] {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'},
        };
        assertEquals(1, instance.numIslands(grid2));
        
        char[][] grid3 = new char[][] {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'},
        };
        assertEquals(3, instance.numIslands(grid3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
