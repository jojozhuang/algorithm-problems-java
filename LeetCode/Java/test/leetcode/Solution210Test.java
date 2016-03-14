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
public class Solution210Test {
    
    public Solution210Test() {
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
     * Test of findOrder method, of class Solution210.
     */
    @Test
    public void testFindOrder() {
        System.out.println("findOrder");
        int numCourses = 0;
        int[][] prerequisites = null;
        Solution210 instance = new Solution210();
        int[] expResult = new int[0];
        int[] result = instance.findOrder(numCourses, prerequisites);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{0,1}, instance.findOrder(2, new int[][]{}));        
        assertArrayEquals(new int[]{0,1}, instance.findOrder(2, new int[][]{{1,0}}));
        assertArrayEquals(new int[]{}, instance.findOrder(2, new int[][]{{1,0},{0,1}}));
        assertArrayEquals(new int[]{0,1,2,3}, instance.findOrder(4, new int[][]{{1,0},{2,0},{3,1},{3,2}}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
