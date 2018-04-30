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
        Solution296 instance = new Solution296();

        assertEquals(0, instance.minTotalDistance(null));
        
        int[][] grid2 = new int[][] {
            {1,0,0,0,1},
            {0,0,0,0,0},
            {0,0,1,0,0}
        };
        assertEquals(6, instance.minTotalDistance(grid2));
    }
}
