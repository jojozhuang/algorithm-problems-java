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
public class Solution256Test {
    
    public Solution256Test() {
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
     * Test of minCost method, of class Solution256.
     */
    @Test
    public void testMinCost() {
        System.out.println("minCost");
        int[][] costs = null;
        Solution256 instance = new Solution256();
        int expResult = 0;
        int result = instance.minCost(costs);
        assertEquals(expResult, result);
        
        int[][] costs2 = new int[][]{{1,2,3}};
        assertEquals(1, instance.minCost(costs2));
        int[][] costs3 = new int[][]{{1,2,3},{3,1,2}};        
         assertEquals(2, instance.minCost(costs3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
