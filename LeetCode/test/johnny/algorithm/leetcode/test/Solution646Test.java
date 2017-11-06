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

import johnny.algorithm.leetcode.Solution646;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution646Test {
    
    public Solution646Test() {
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
     * Test of findLongestChain method, of class Solution646.
     */
    @Test
    public void testFindLongestChain() {
        System.out.println("findLongestChain");
        int[][] pairs = null;
        Solution646 instance = new Solution646();
        int expResult = 0;
        int result = instance.findLongestChain(pairs);
        assertEquals(expResult, result);
        
        assertEquals(2, instance.findLongestChain(new int[][]{{1,2},{2,3},{3,4}}));
        assertEquals(3, instance.findLongestChain(new int[][]{{1,2},{2,3},{3,4},{7,8}}));
        assertEquals(2, instance.findLongestChain(new int[][]{{1,2},{2,3},{3,4},{4,5}}));
        assertEquals(2, instance.findLongestChain(new int[][]{{1,2},{2,3},{3,4},{1,4}}));
        assertEquals(2, instance.findLongestChain(new int[][]{{3,4},{2,3},{1,2}}));
        assertEquals(3, instance.findLongestChain(new int[][]{{-6,9},{1,6},{8,10},{-1,4},{-6,-2},{-9,8},{-5,3},{0,3}}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
