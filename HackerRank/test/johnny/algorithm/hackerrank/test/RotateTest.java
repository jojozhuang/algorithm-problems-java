/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.hackerrank.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.hackerrank.Rotate;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class RotateTest {
    
    public RotateTest() {
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
     * Test of rotate method, of class Rotate.
     */
    @Test
    public void testRotate() {
        System.out.println("rotate");
        int n = 0;
        int[][] matrix = null;
        Rotate instance = new Rotate();
        instance.rotate(n, matrix);
        
        int[][] matrix2 = new int[2][2];
        matrix2[0] = new int[]{1, 2};
        matrix2[1] = new int[]{3, 4};
        instance.rotate(2, matrix2);
        int[][] matrix2Res = new int[2][2];
        matrix2Res[0] = new int[]{3, 1};
        matrix2Res[1] = new int[]{4, 2};        
        assertArrayEquals(matrix2Res, matrix2);
        
        int[][] matrix3 = new int[3][3];
        matrix3[0] = new int[] {1,2,3};
        matrix3[1] = new int[] {4,5,6};
        matrix3[2] = new int[] {7,8,9};
        instance.rotate(3, matrix3);
        int[][] matrix3Res = new int[3][3];
        matrix3Res[0] = new int[] {4,1,2};
        matrix3Res[1] = new int[] {7,5,3};
        matrix3Res[2] = new int[] {8,9,6};
        assertArrayEquals(matrix3Res, matrix3);
        
        int[][] matrix4 = new int[4][4];
        matrix4[0] = new int[] { 1, 2, 3, 4};
        matrix4[1] = new int[] { 5, 6, 7, 8};
        matrix4[2] = new int[] { 9,10,11,12};
        matrix4[3] = new int[] {13,14,15,16};
        instance.rotate(4, matrix4);
        int[][] matrix4Res = new int[4][4];
        matrix4Res[0] = new int[] { 5, 1, 2, 3};
        matrix4Res[1] = new int[] { 9,10, 6, 4};
        matrix4Res[2] = new int[] {13,11, 7, 8};
        matrix4Res[3] = new int[] {14,15,16,12};
        assertArrayEquals(matrix4Res, matrix4);
    }
}
