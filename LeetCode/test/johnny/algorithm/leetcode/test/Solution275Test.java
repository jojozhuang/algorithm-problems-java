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

import johnny.algorithm.leetcode.Solution275;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution275Test {
    
    public Solution275Test() {
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
     * Test of hIndex method, of class Solution275.
     */
    @Test
    public void testHIndex() {
        System.out.println("hIndex");
        int[] citations = null;
        Solution275 instance = new Solution275();
        int expResult = 0;
        int result = instance.hIndex(citations);
        assertEquals(expResult, result);
        
        assertEquals(0, instance.hIndex(new int[]{0}));
        assertEquals(1, instance.hIndex(new int[]{1,1,1,1,1}));
        assertEquals(2, instance.hIndex(new int[]{2,2,2,2,2}));
        assertEquals(3, instance.hIndex(new int[]{0, 1, 3, 5, 6}));
        assertEquals(4, instance.hIndex(new int[]{3, 4, 5, 8, 10}));
        assertEquals(3, instance.hIndex(new int[]{3, 3, 5, 8, 25}));
        assertEquals(5, instance.hIndex(new int[]{10, 10, 10, 10, 10}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
