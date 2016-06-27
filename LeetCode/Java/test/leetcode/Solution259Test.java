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
public class Solution259Test {
    
    public Solution259Test() {
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
     * Test of threeSumSmaller method, of class Solution259.
     */
    @Test
    public void testThreeSumSmaller() {
        System.out.println("threeSumSmaller");
        int[] nums = null;
        int target = 0;
        Solution259 instance = new Solution259();
        int expResult = 0;
        int result = instance.threeSumSmaller(nums, target);
        assertEquals(expResult, result);
        
        assertEquals(2, instance.threeSumSmaller(new int[]{-2, 0, 1, 3}, 2));
        assertEquals(4, instance.threeSumSmaller(new int[]{-2, 0, 1, 2}, 4));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
