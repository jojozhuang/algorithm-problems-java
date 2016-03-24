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
 * @author RZHUANG
 */
public class Solution276Test {
    
    public Solution276Test() {
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
     * Test of numWays method, of class Solution276.
     */
    @Test
    public void testNumWays() {
        System.out.println("numWays");
        int n = 0;
        int k = 0;
        Solution276 instance = new Solution276();
        int expResult = 0;
        int result = instance.numWays(n, k);
        assertEquals(expResult, result);
        
        assertEquals(2, instance.numWays(1, 2));
        assertEquals(9, instance.numWays(2, 3));
        assertEquals(24, instance.numWays(3, 3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
