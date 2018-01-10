package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution218;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution218Test {
    
    public Solution218Test() {
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
     * Test of getSkyline method, of class Solution218.
     */
    @Test
    public void testGetSkyline() {
        System.out.println("getSkyline");
        int[][] buildings = null;
        Solution218 instance = new Solution218();
        List<int[]> expResult = new ArrayList<int[]>();
        List<int[]> result = instance.getSkyline(buildings);
        assertEquals(expResult, result);
        
        int[][] buildings2 = new int[][] {
            {2,9, 10},
            {3, 7, 15}, 
            {5, 12, 12}, 
            {15, 20, 10}, 
            {19, 24, 8}
        };
        List<int[]> expResult2 = new ArrayList<int[]>();
        expResult2.add(new int[]{2, 10});
        expResult2.add(new int[]{3, 15});
        expResult2.add(new int[]{7, 12});
        expResult2.add(new int[]{12, 0});
        expResult2.add(new int[]{15, 10});
        expResult2.add(new int[]{20, 8});
        expResult2.add(new int[]{24, 0});
        List<int[]> result2 = instance.getSkyline(buildings2);
        assertEquals(expResult2.size(), result2.size());
        assertArrayEquals(expResult2.get(0), result2.get(0));
        assertArrayEquals(expResult2.get(1), result2.get(1));
        assertArrayEquals(expResult2.get(2), result2.get(2));
        assertArrayEquals(expResult2.get(3), result2.get(3));
        assertArrayEquals(expResult2.get(4), result2.get(4));
        assertArrayEquals(expResult2.get(5), result2.get(5));
        assertArrayEquals(expResult2.get(6), result2.get(6));
        
        int[][] buildings3 = new int[][] {
            {0,2, 3},
            {2, 5, 3}
        };
        List<int[]> expResult3 = new ArrayList<int[]>();
        expResult3.add(new int[]{0,3});
        expResult3.add(new int[]{5, 0});
        List<int[]> result3 = instance.getSkyline(buildings3);
        assertEquals(expResult3.size(), result3.size());
        assertArrayEquals(expResult3.get(0), result3.get(0));
        assertArrayEquals(expResult3.get(1), result3.get(1));
        
        int[][] buildings4 = new int[][] {
            {1, 2, 1},
            {1, 2, 2},
            {1, 2, 3}
        };
        List<int[]> expResult4 = new ArrayList<int[]>();
        expResult4.add(new int[]{1, 3});
        expResult4.add(new int[]{2, 0});
        List<int[]> result4 = instance.getSkyline(buildings4);
        assertEquals(expResult4.size(), result4.size());
        assertArrayEquals(expResult4.get(0), result4.get(0));
        assertArrayEquals(expResult4.get(1), result4.get(1));
        
    
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
