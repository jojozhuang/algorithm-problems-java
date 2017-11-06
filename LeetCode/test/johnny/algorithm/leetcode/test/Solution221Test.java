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

import johnny.algorithm.leetcode.Solution221;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution221Test {
    
    public Solution221Test() {
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
     * Test of maximalSquare method, of class Solution221.
     */
    @Test
    public void testMaximalSquare() {
        System.out.println("maximalSquare");
        char[][] matrix = null;
        Solution221 instance = new Solution221();
        int expResult = 0;
        int result = instance.maximalSquare(matrix);
        assertEquals(expResult, result);
        
        char[][] matrix2 = new char[][] {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'},
        };
        assertEquals(4, instance.maximalSquare(matrix2));
        
         char[][] matrix3 = new char[][] {
            {'1', '1', '1', '1'},
            {'1', '1', '1', '1'},
            {'1', '1', '1', '1'}
        };
        assertEquals(9, instance.maximalSquare(matrix3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
