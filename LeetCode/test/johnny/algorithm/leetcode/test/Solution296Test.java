package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution296;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution296Test {
    
    public Solution296Test() {
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
     * Test of minTotalDistance method, of class Solution296.
     */
    @Test
    public void testMinTotalDistance() {
        System.out.println("minTotalDistance");
        int[][] grid = null;
        Solution296 instance = new Solution296();
        int expResult = 0;
        int result = instance.minTotalDistance(grid);
        assertEquals(expResult, result);
        
        int[][] grid2 = new int[][] {
            {1,0,0,0,1},
            {0,0,0,0,0},
            {0,0,1,0,0}            
        };
        assertEquals(6, instance.minTotalDistance(grid2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
