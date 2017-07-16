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
public class Solution329Test {
    
    public Solution329Test() {
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
     * Test of longestIncreasingPath method, of class Solution329.
     */
    @Test
    public void testLongestIncreasingPath() {
        System.out.println("longestIncreasingPath");
        int[][] matrix = null;
        Solution329 instance = new Solution329();
        int expResult = 0;
        int result = instance.longestIncreasingPath(matrix);
        assertEquals(expResult, result);
        
        int[][] matrix2 = new int[][] {
            {9,9,4},
            {6,6,8},
            {2,1,1}
        };
        assertEquals(4, instance.longestIncreasingPath(matrix2));
        
        int[][] matrix3 = new int[][] {
            {3,4,5},
            {3,2,6},
            {2,2,1}
        };
        assertEquals(4, instance.longestIncreasingPath(matrix3));
        
        int[][] matrix4 = new int[][] {
            {7,8,9},
            {9,7,6},
            {7,2,3}
        };
        assertEquals(6, instance.longestIncreasingPath(matrix4));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
