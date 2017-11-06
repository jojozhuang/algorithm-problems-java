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

import johnny.algorithm.leetcode.Solution598;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution598Test {
    
    public Solution598Test() {
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
     * Test of maxCount method, of class Solution598.
     */
    @Test
    public void testMaxCount() {
        System.out.println("maxCount");
        Solution598 instance = new Solution598();
        
        int[][] ops = null;
        assertEquals(12, instance.maxCount(3, 4, ops));
        
        int[][] ops2 = new int[][]{{1,2}};
        assertEquals(2, instance.maxCount(3, 4, ops2));
        
        int[][] ops3 = new int[][]{{1,2},{3,2}};
        assertEquals(2, instance.maxCount(3, 3, ops3));
        
        int[][] ops4 = new int[][]{{2,2},{3,3}};
        assertEquals(4, instance.maxCount(3, 3, ops4));
        
        int[][] ops5 = new int[][]{{}};
        assertEquals(9, instance.maxCount(3, 3, ops5));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
