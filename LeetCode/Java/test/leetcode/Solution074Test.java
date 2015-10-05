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
public class Solution074Test {
    
    public Solution074Test() {
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
     * Test of searchMatrix method, of class Solution074.
     */
    @Test
    public void testSearchMatrix() {
        System.out.println("searchMatrix");
        int[][] matrix = null;
        int target = 0;
        Solution074 instance = new Solution074();
        boolean expResult = false;
        boolean result = instance.searchMatrix(matrix, target);
        assertEquals(expResult, result);
        
        assertEquals(false, instance.searchMatrix(new int[][]{}, 0));
        assertEquals(false, instance.searchMatrix(new int[][]{{}}, 0));
        assertEquals(true, instance.searchMatrix(new int[][]{{1}}, 1));
        assertEquals(true, instance.searchMatrix(new int[][]{{1,2}}, 2));
        assertEquals(false, instance.searchMatrix(new int[][]{{1,2,3}}, 4));
        assertEquals(false, instance.searchMatrix(new int[][]{{1,2,3},{5,6,7}}, 4));
        assertEquals(true, instance.searchMatrix(new int[][]{{1,2,3},{5,6,7}}, 6));
        assertEquals(true, instance.searchMatrix(new int[][]{{1,3,5,7},{10, 11, 16, 20},{23, 30, 34, 50}}, 3));
        assertEquals(true, instance.searchMatrix(new int[][]{{1,3,5,7},{10, 11, 16, 20},{23, 30, 34, 50}}, 30));
        assertEquals(false, instance.searchMatrix(new int[][]{{1,3,5,7},{10, 11, 16, 20},{23, 30, 34, 50}}, 40));
        assertEquals(false, instance.searchMatrix(new int[][]{{1,3,5,7},{10, 11, 16, 20},{23, 30, 34, 50}}, 100));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
