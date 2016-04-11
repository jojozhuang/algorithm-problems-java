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
public class Solution323Test {
    
    public Solution323Test() {
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
     * Test of countComponents method, of class Solution323.
     */
    @Test
    public void testCountComponents() {
        System.out.println("countComponents");
        int n = 0;
        int[][] edges = null;
        Solution323 instance = new Solution323();
        int expResult = 0;
        int result = instance.countComponents(n, edges);
        assertEquals(expResult, result);
        
        int[][] edges2 = new int[][] {
            {0, 1}, {1, 2}, {3, 4}
        };
        assertEquals(2, instance.countComponents(5, edges2));
        int[][] edges3 = new int[][] {
            {0, 1}, {1, 2}, {2, 3},{3, 4}
        };
        assertEquals(1, instance.countComponents(5, edges3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
