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
 * @author i857285
 */
public class Solution605Test {
    
    public Solution605Test() {
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
     * Test of canPlaceFlowers method, of class Solution605.
     */
    @Test
    public void testCanPlaceFlowers() {
        System.out.println("canPlaceFlowers");
        int[] flowerbed = null;
        int n = 0;
        Solution605 instance = new Solution605();
        boolean expResult = false;
        boolean result = instance.canPlaceFlowers(flowerbed, n);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.canPlaceFlowers(new int[]{0}, 1));
        assertEquals(false, instance.canPlaceFlowers(new int[]{0}, 2));
        assertEquals(false, instance.canPlaceFlowers(new int[]{1}, 1));
        assertEquals(false, instance.canPlaceFlowers(new int[]{0,1}, 1));
        assertEquals(true, instance.canPlaceFlowers(new int[]{0,0}, 1));
        assertEquals(false, instance.canPlaceFlowers(new int[]{0,0}, 2));
        assertEquals(true, instance.canPlaceFlowers(new int[]{1,0,0}, 1));
        assertEquals(true, instance.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        assertEquals(false, instance.canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
        assertEquals(true, instance.canPlaceFlowers(new int[]{1,0,0,0,0,0,1}, 2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
