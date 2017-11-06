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

import johnny.algorithm.leetcode.Solution207;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution207Test {
    
    public Solution207Test() {
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
     * Test of canFinish method, of class Solution207.
     */
    @Test
    public void testCanFinish() {
        System.out.println("canFinish");
        int numCourses = 0;
        int[][] prerequisites = null;
        Solution207 instance = new Solution207();
        boolean expResult = false;
        boolean result = instance.canFinish(numCourses, prerequisites);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.canFinish(2, new int[][]{{1,0}}));
        assertEquals(false, instance.canFinish(2, new int[][]{{1,0},{0,1}}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
