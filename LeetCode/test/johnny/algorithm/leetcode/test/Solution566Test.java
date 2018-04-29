package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution566;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution566Test {
    
    public Solution566Test() {
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
     * Test of matrixReshape method, of class Solution566.
     */
    @Test
    public void testMatrixReshape() {
        System.out.println("matrixReshape");
        Solution566 instance = new Solution566();
        int[][] nums1 = new int[][]{};
        int[][] expResult1 = new int[][]{};
        assertArrayEquals(expResult1, instance.matrixReshape(nums1, 0, 0));

        int[][] nums2 = new int[][]{{1,2}};
        int[][] expResult2 = new int[][]{{1},{2}};
        assertArrayEquals(expResult2, instance.matrixReshape(nums2, 2, 1));

        int[][] nums3 = new int[][]{{1,2},{3,4}};
        int[][] expResult3 = new int[][]{{1,2,3,4}};
        assertArrayEquals(expResult3, instance.matrixReshape(nums3, 1, 4));

        int[][] nums4 = new int[][]{{1,2},{3,4}};
        int[][] expResult4 = new int[][]{{1,2},{3,4}};
        assertArrayEquals(expResult4, instance.matrixReshape(nums4, 2, 4));

        int[][] nums5 = new int[][]{{1,2,3},{4,5,6}};
        int[][] expResult5 = new int[][]{{1,2},{3,4},{5,6}};
        assertArrayEquals(expResult5, instance.matrixReshape(nums5, 3, 2));
    }
}
