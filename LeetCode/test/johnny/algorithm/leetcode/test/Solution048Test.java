/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution048;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution048Test {
    
    public Solution048Test() {
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
     * Test of rotate method, of class Solution048.
     */
    @Test
    public void testRotate() {
        System.out.println("rotate");
        int[][] matrix = null;
        Solution048 instance = new Solution048();
        int[][] expResult = null;
        instance.rotate(matrix);
        assertArrayEquals(expResult, matrix);
        
        int[][] matrix2 = new int[][]{};
        instance.rotate(matrix2);
        assertArrayEquals(new int[][]{},matrix2);
        
        int[][] matrix3 = new int[][]{{1}};
        instance.rotate(matrix3);
        assertArrayEquals(new int[][]{{1}},matrix3);
        
        int[][] matrix4 = new int[][]{{1,2},{3,4}};
        instance.rotate(matrix4);
        assertArrayEquals(new int[][]{{3,1},{4,2}},matrix4);
        
        int[][] matrix5 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        instance.rotate(matrix5);
        assertArrayEquals(new int[][]{{7,4,1},{8,5,2},{9,6,3}},matrix5);
        
        int[][] matrix6 = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        instance.rotate(matrix6);
        assertArrayEquals(new int[][]{{13,9,5,1},{14,10,6,2},{15,11,7,3},{16,12,8,4}},matrix6);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
