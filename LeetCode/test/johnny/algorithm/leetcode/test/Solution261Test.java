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

import johnny.algorithm.leetcode.Solution261;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution261Test {
    
    public Solution261Test() {
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
     * Test of validTree method, of class Solution261.
     */
    @Test
    public void testValidTree() {
        System.out.println("validTree");
        int n = 0;
        int[][] edges = null;
        Solution261 instance = new Solution261();
        boolean expResult = false;
        boolean result = instance.validTree(n, edges);
        assertEquals(expResult, result);
        
        int[][] edges2 = new int[][] {
            {0, 1}, {0, 2}, {0, 3}, {1, 4}
        };
        assertEquals(true, instance.validTree(5, edges2));
        int[][] edges3 = new int[][] {
            {0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}
        };
        assertEquals(false, instance.validTree(5, edges3));

        assertEquals(true, instance.validTree(1, new int[][] {}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
