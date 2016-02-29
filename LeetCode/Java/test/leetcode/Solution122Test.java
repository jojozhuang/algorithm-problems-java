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
public class Solution122Test {
    
    public Solution122Test() {
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
     * Test of maxProfit method, of class Solution122.
     */
    @Test
    public void testMaxProfit() {
        System.out.println("maxProfit");
        int[] prices = null;
        Solution122 instance = new Solution122();
        int expResult = 0;
        int result = instance.maxProfit(prices);
        assertEquals(expResult, result);
        
        assertEquals(2, instance.maxProfit(new int[]{2,1,2,0,1}));
        assertEquals(2, instance.maxProfit(new int[]{3,2,3,1,2}));
        assertEquals(19, instance.maxProfit(new int[]{8,4,5,1,3,7,9,10,3,12}));
        assertEquals(15, instance.maxProfit(new int[]{8,4,5,12,3,7,9,10,3,1}));
        assertEquals(0, instance.maxProfit(new int[]{8,7,6,5,4,3,2,1}));
        assertEquals(12, instance.maxProfit(new int[]{1,3,5,6,7,8,9,13}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
