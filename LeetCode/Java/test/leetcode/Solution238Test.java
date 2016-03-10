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
public class Solution238Test {
    
    public Solution238Test() {
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
     * Test of productExceptSelf method, of class Solution238.
     */
    @Test
    public void testProductExceptSelf() {
        System.out.println("productExceptSelf");
        int[] nums = new int[]{1,2};
        Solution238 instance = new Solution238();
        int[] expResult = new int[]{2,1};
        int[] result = instance.productExceptSelf(nums);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{12,4,3}, instance.productExceptSelf(new int[]{1,3,4}));
        assertArrayEquals(new int[]{0,0}, instance.productExceptSelf(new int[]{0,0}));
        assertArrayEquals(new int[]{0,1}, instance.productExceptSelf(new int[]{1,0}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
