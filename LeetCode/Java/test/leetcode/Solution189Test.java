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
public class Solution189Test {
    
    public Solution189Test() {
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
     * Test of rotate method, of class Solution189.
     */
    @Test
    public void testRotate() {
        System.out.println("rotate");
        int[] nums = null;
        int k = 0;
        Solution189 instance = new Solution189();
        int[] expResult = null;
        int[] result = instance.rotate(nums, k);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[0], instance.rotate(new int[0], 2));
        assertArrayEquals(new int[]{1}, instance.rotate(new int[]{1}, -1));
        assertArrayEquals(new int[]{2}, instance.rotate(new int[]{2}, 2));
        assertArrayEquals(new int[]{3}, instance.rotate(new int[]{3}, 0));
        assertArrayEquals(new int[]{4}, instance.rotate(new int[]{4}, 1));
        assertArrayEquals(new int[]{6,5}, instance.rotate(new int[]{5,6}, 1));
        assertArrayEquals(new int[]{4,1,2,3}, instance.rotate(new int[]{1,2,3,4}, 1));
        assertArrayEquals(new int[]{1,2,3}, instance.rotate(new int[]{1,2,3}, 3));
        assertArrayEquals(new int[]{3,4,5,1,2}, instance.rotate(new int[]{1,2,3,4,5}, 3));
        assertArrayEquals(new int[]{2,3,4,5,1}, instance.rotate(new int[]{1,2,3,4,5}, 4));
        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, instance.rotate(new int[]{1,2,3,4,5,6,7}, 3));
        
        assertArrayEquals(new int[]{2,1}, instance.rotate(new int[]{1,2}, 1));
        //assertArrayEquals(new int[0], instance.rotate(new int[1], 2));
        //assertArrayEquals(new int[0], instance.rotate(new int[1], 2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
