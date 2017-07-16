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
public class Solution441Test {
    
    public Solution441Test() {
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
     * Test of arrangeCoins method, of class Solution441.
     */
    @Test
    public void testArrangeCoins() {
        System.out.println("arrangeCoins");
        Solution441 instance = new Solution441();
        assertEquals(0, instance.arrangeCoins(0));
        assertEquals(1, instance.arrangeCoins(1));
        assertEquals(1, instance.arrangeCoins(2));
        assertEquals(2, instance.arrangeCoins(3));
        assertEquals(2, instance.arrangeCoins(4));
        assertEquals(2, instance.arrangeCoins(5));
        assertEquals(3, instance.arrangeCoins(6));
        assertEquals(3, instance.arrangeCoins(7));
        assertEquals(3, instance.arrangeCoins(8));
        assertEquals(60070, instance.arrangeCoins(1804289383));
        assertEquals(65535, instance.arrangeCoins(2147483647));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
