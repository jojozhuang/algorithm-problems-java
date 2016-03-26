/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

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
public class Solution311Test {
    
    public Solution311Test() {
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
     * Test of multiply method, of class Solution311.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int[][] A = null;
        int[][] B = null;
        Solution311 instance = new Solution311();
        int[][] expResult = new int[][]{};
        int[][] result = instance.multiply(A, B);
        assertArrayEquals(expResult, result);
        
        int[][] A2 = new int[][]{
            {1, 0, 0},
            {-1, 0, 3}
        };
        int[][] B2 = new int[][]{
            {7, 0, 0},
            {0, 0, 0},
            {0, 0, 1}
        };
        int[][] expResult2 = new int[][]{
            {7, 0, 0},
            {-7, 0, 3}
        };
        assertArrayEquals(expResult2, instance.multiply(A2, B2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
