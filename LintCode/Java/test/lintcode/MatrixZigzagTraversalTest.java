/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class MatrixZigzagTraversalTest {
    
    public MatrixZigzagTraversalTest() {
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
     * Test of printZMatrix method, of class MatrixZigzagTraversal.
     */
    @Test
    public void testPrintZMatrix() {
        System.out.println("printZMatrix");
        int[][] matrix = null;
        MatrixZigzagTraversal instance = new MatrixZigzagTraversal();
        int[] expResult = new int[]{};
        int[] result = instance.printZMatrix(matrix);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{1,2}, instance.printZMatrix(new int[][]{{1,2}}));
        assertArrayEquals(new int[]{1,2,3,4,5,6}, instance.printZMatrix(new int[][]{{1,2,3,4,5,6}}));
        assertArrayEquals(new int[]{1,2,3,4,5}, instance.printZMatrix(new int[][]{{1},{2},{3},{4},{5}}));
        
        int[][] matrix2 = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
        };
        assertArrayEquals(new int[]{1, 2, 5, 9, 6, 3, 4, 7, 10, 11, 8, 12}, instance.printZMatrix(matrix2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
