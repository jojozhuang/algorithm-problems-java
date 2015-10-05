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
        int[][] result = instance.setZeroes2(matrix);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[][]{}, instance.setZeroes2(new int[][]{}));
        assertArrayEquals(new int[][]{{}}, instance.setZeroes2(new int[][]{{}}));
        assertArrayEquals(new int[][]{{1}}, instance.setZeroes2(new int[][]{{1}}));
        assertArrayEquals(new int[][]{{0,0}}, instance.setZeroes2(new int[][]{{1,0}}));
        assertArrayEquals(new int[][]{{0,0}}, instance.setZeroes2(new int[][]{{0,1}}));
        assertArrayEquals(new int[][]{{0,0},{2,0}}, instance.setZeroes2(new int[][]{{1,0},{2,3}}));
        assertArrayEquals(new int[][]{{0,0,0},{0,0,0},{0,0,0}}, instance.setZeroes2(new int[][]{{0,1,2},{3,0,4},{5,6,0}}));
        assertArrayEquals(new int[][]{{1,1,0},{3,6,0},{0,0,0}}, instance.setZeroes2(new int[][]{{1,1,2},{3,6,4},{5,6,0}}));
        assertArrayEquals(new int[][]{{1,2,0,4},{0,0,0,0},{8,9,0,6}}, instance.setZeroes2(new int[][]{{1,2,3,4},{5,6,0,7},{8,9,7,6}}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
