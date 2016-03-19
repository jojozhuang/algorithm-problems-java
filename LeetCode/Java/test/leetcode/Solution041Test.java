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
public class Solution041Test {
    
    public Solution041Test() {
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
     * Test of firstMissingPositive method, of class Solution041.
     */
    @Test
    public void testFirstMissingPositive() {
        System.out.println("firstMissingPositive");
        int[] nums = null;
        Solution041 instance = new Solution041();
        int expResult = 1;
        int result = instance.firstMissingPositive(nums);
        assertEquals(expResult, result);
        
        assertEquals(3, instance.firstMissingPositive(new int[] {1,2,0}));
        assertEquals(2, instance.firstMissingPositive(new int[] {3,4,-1,1}));
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
