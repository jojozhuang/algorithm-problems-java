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
public class Solution059Test {
    
    public Solution059Test() {
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
     * Test of generateMatrix method, of class Solution059.
     */
    @Test
    public void testGenerateMatrix() {
        System.out.println("generateMatrix");
        int n = 0;
        Solution059 instance = new Solution059();
        int[][] expResult = new int[][]{};
        int[][] result = instance.generateMatrix(n);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(expResult, instance.generateMatrix(-1));
        assertArrayEquals(new int[][]{{1}}, instance.generateMatrix(1));
        assertArrayEquals(new int[][]{{1,2},{4,3}}, instance.generateMatrix(2));
        assertArrayEquals(new int[][]{{1,2,3},{8,9,4},{7,6,5}}, instance.generateMatrix(3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
