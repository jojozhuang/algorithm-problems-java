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
public class Solution322Test {
    
    public Solution322Test() {
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
     * Test of coinChange method, of class Solution322.
     */
    @Test
    public void testCoinChange() {
        System.out.println("coinChange");
        int[] coins = null;
        int amount = 0;
        Solution322 instance = new Solution322();
        int expResult = 0;
        int result = instance.coinChange(coins, amount);
        assertEquals(expResult, result);
        
        assertEquals(0, instance.coinChange(new int[]{1}, 0));
        assertEquals(-1, instance.coinChange(new int[]{2}, 3));
        assertEquals(-1, instance.coinChange(new int[]{2}, 1));
        assertEquals(1, instance.coinChange(new int[]{2}, 2));
        assertEquals(3, instance.coinChange(new int[]{1, 2, 5}, 11));
        assertEquals(3, instance.coinChange(new int[]{1, 2, 5}, 12));
        assertEquals(4, instance.coinChange(new int[]{1, 2, 5}, 14));
        assertEquals(20, instance.coinChange(new int[]{186,419,83,408}, 6249));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
