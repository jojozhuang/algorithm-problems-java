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
public class Solution136Test {
    
    public Solution136Test() {
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
     * Test of singleNumber method, of class Solution136.
     */
    @Test
    public void testSingleNumber() {
        System.out.println("singleNumber");
        int[] nums = null;
        Solution136 instance = new Solution136();
        int expResult = 0;
        int result = instance.singleNumber(nums);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.singleNumber(new int[] {1}));
        assertEquals(0, instance.singleNumber(new int[] {1,0,1}));
        assertEquals(2, instance.singleNumber(new int[] {1,3,1,2,3}));
        assertEquals(4, instance.singleNumber(new int[] {1,2,2,1,3,4,3}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
