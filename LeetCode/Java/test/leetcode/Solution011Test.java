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
public class Solution011Test {
    
    public Solution011Test() {
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
     * Test of maxArea method, of class Solution011.
     */
    @Test
    public void testMaxArea() {
        System.out.println("maxArea");
        Solution011 instance = new Solution011();
        assertEquals(0, instance.maxArea(new int[]{}));
        assertEquals(4, instance.maxArea(new int[]{2,3,4}));
        assertEquals(6, instance.maxArea(new int[]{1,2,3,4,5}));
        int[] height2 = new int[15000];
        for(int i=0; i<15000; i++) {
            height2[i] = i+1;
        }
        assertEquals(56250000, instance.maxArea(height2));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
}
