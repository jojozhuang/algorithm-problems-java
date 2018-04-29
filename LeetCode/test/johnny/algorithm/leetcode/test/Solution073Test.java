package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution073;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution073Test {
    
    public Solution073Test() {
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
     * Test of setZeroes method, of class Solution073.
     */
    @Test
    public void testSetZeroes() {
        System.out.println("setZeroes");
        int[][] matrix = null;
        Solution073 instance = new Solution073();
        int[][] expResult = null;
        instance.setZeroes(matrix);
        assertArrayEquals(expResult, matrix);
        
        int[][] matrix2 = new int[][]{};
        instance.setZeroes(matrix2);
        assertArrayEquals(new int[][]{}, matrix2);
        
        int[][] matrix3 = new int[][]{{1}};
        instance.setZeroes(matrix3);
        assertArrayEquals(new int[][]{{1}}, matrix3);
        
        int[][] matrix4 = new int[][]{{1,0}};
        instance.setZeroes(matrix4);
        assertArrayEquals(new int[][]{{0,0}}, matrix4);
        
        int[][] matrix5 = new int[][]{{0,1}};
        instance.setZeroes(matrix5);
        assertArrayEquals(new int[][]{{0,0}}, matrix5);
        
        int[][] matrix6 = new int[][]{{1,0},{2,3}};
        instance.setZeroes(matrix6);
        assertArrayEquals(new int[][]{{0,0},{2,0}}, matrix6);
        
        int[][] matrix7 = new int[][]{{0,1,2},{3,0,4},{5,6,0}};
        instance.setZeroes(matrix7);
        assertArrayEquals(new int[][]{{0,0,0},{0,0,0},{0,0,0}}, matrix7);
        
        int[][] matrix8 = new int[][]{{1,1,2},{3,6,4},{5,6,0}};
        instance.setZeroes(matrix8);
        assertArrayEquals(new int[][]{{1,1,0},{3,6,0},{0,0,0}}, matrix8);
        
        int[][] matrix9 = new int[][]{{1,2,3,4},{5,6,0,7},{8,9,7,6}};
        instance.setZeroes(matrix9);
        assertArrayEquals(new int[][]{{1,2,0,4},{0,0,0,0},{8,9,0,6}}, matrix9);
    }
}
