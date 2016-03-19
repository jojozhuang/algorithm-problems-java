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
public class Solution084Test {
    
    public Solution084Test() {
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
     * Test of largestRectangleArea method, of class Solution084.
     */
    @Test
    public void testLargestRectangleArea() {
        System.out.println("largestRectangleArea");
        int[] heights = null;
        Solution084 instance = new Solution084();
        int expResult = 0;
        int result = instance.largestRectangleArea(heights);
        assertEquals(expResult, result);
        
        assertEquals(10, instance.largestRectangleArea(new int[]{2,1,5,6,2,3}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
