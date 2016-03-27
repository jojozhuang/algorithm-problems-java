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
public class Solution330Test {
    
    public Solution330Test() {
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
     * Test of minPatches method, of class Solution330.
     */
    @Test
    public void testMinPatches() {
        System.out.println("minPatches");
        int[] nums = null;
        int n = 0;
        Solution330 instance = new Solution330();
        int expResult = 0;
        int result = instance.minPatches(nums, n);
        assertEquals(expResult, result);
        
        assertEquals(3, instance.minPatches(new int[]{}, 7));
        assertEquals(1, instance.minPatches(new int[]{1, 3}, 6));
        assertEquals(2, instance.minPatches(new int[]{1, 5, 10}, 20));        
        assertEquals(0, instance.minPatches(new int[]{1, 2, 2}, 5));
        assertEquals(28, instance.minPatches(new int[]{1,2,31,33},2147483647));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
