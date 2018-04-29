package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution310;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution310Test {
    
    public Solution310Test() {
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
     * Test of findMinHeightTrees method, of class Solution310.
     */
    @Test
    public void testFindMinHeightTrees() {
        System.out.println("findMinHeightTrees");
        int n = 0;
        int[][] edges = null;
        Solution310 instance = new Solution310();
        List<Integer> expResult = new ArrayList<Integer>();
        List<Integer> result = instance.findMinHeightTrees(n, edges);
        assertEquals(expResult, result);
        
        List<Integer> expResult2 = new ArrayList<Integer>();
        expResult2.add(1);
        assertEquals(expResult2, instance.findMinHeightTrees(4, new int[][]{{1, 0}, {1, 2}, {1, 3}}));
        
        List<Integer> expResult3 = new ArrayList<Integer>();
        expResult3.add(3);
        expResult3.add(4);
        assertEquals(expResult3, instance.findMinHeightTrees(6, new int[][]{{0, 3}, {1, 3}, {2, 3}, {4, 3}, {5, 4}}));
    }
}
