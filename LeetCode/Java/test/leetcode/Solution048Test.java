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
        int[][] result = instance.rotate2(matrix);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[][]{}, instance.rotate2(new int[][]{}));
        assertArrayEquals(new int[][]{{1}}, instance.rotate2(new int[][]{{1}}));
        assertArrayEquals(new int[][]{{1},{2}}, instance.rotate2(new int[][]{{1,2}}));
        assertArrayEquals(new int[][]{{1},{2},{3}}, instance.rotate2(new int[][]{{1,2,3}}));
        assertArrayEquals(new int[][]{{4,1},{5,2},{6,3}}, instance.rotate2(new int[][]{{1,2,3},{4,5,6}}));
        assertArrayEquals(new int[][]{{3,1},{4,2}}, instance.rotate2(new int[][]{{1,2},{3,4}}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
