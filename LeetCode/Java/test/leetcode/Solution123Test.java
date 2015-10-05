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
public class Solution123Test {
    
    public Solution123Test() {
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
     * Test of maxProfit method, of class Solution123.
     */
    @Test
    public void testMaxProfit() {
        System.out.println("maxProfit");
        int[] prices = null;
        Solution123 instance = new Solution123();
        int expResult = 0;
        int result = instance.maxProfit(prices);
        assertEquals(expResult, result);
        
        assertEquals(18, instance.maxProfit(new int[]{8,4,5,1,3,7,9,10,3,12}));
        assertEquals(15, instance.maxProfit(new int[]{8,4,5,12,3,7,9,10,3,1}));
        assertEquals(0, instance.maxProfit(new int[]{8,7,6,5,4,3,2,1}));
        assertEquals(12, instance.maxProfit(new int[]{1,3,5,6,7,8,9,13}));
        assertEquals(13, instance.maxProfit(new int[]{1,2,4,2,5,7,2,4,9,0}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
