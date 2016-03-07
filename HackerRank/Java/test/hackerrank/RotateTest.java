/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RZHUANG
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
        
        int[][] matrix3 = new int[3][3];
        matrix3[0] = new int[] {1,2,3};
        matrix3[1] = new int[] {4,5,6};
        matrix3[2] = new int[] {1,2,3};
         instance.rotate(3, matrix3);
        
        int[][] matrix2 = new int[2][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 3;
        matrix2[1][1] = 4;
        instance.rotate(2, matrix2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
