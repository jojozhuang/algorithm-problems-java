package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution286;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution286Test {
    
    public Solution286Test() {
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
     * Test of wallsAndGates method, of class Solution286.
     */
    @Test
    public void testWallsAndGates() {
        System.out.println("wallsAndGates");
        int inf = Integer.MAX_VALUE;
        int[][] rooms = new int[][]{
            {inf, -1, 0, inf},
            {inf,inf, inf, -1},
            {inf, -1, inf, -1},
            {0, -1, inf, inf}
        };
        Solution286 instance = new Solution286();
        instance.wallsAndGates(rooms);
        int[][] expected = new int[][]{
            {3, -1, 0, 1},
            {2, 2, 1, -1},
            {1, -1, 2, -1},
            {0, -1, 3, 4}
        };
        assertArrayEquals(expected, rooms);
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
