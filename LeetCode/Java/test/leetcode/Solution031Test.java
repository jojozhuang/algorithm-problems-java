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
public class Solution031Test {
    
    public Solution031Test() {
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
     * Test of nextPermutation method, of class Solution031.
     */
    @Test
    public void testNextPermutation() {
        System.out.println("nextPermutation");
        int[] nums = null;
        Solution031 instance = new Solution031();
        int[] expResult = null;
        instance.nextPermutation(nums);
        assertArrayEquals(expResult, nums);
        
        int[] nums2 = new int[]{1};
        instance.nextPermutation(nums2);
        assertArrayEquals(new int[]{1}, nums2);
        int[] nums3 = new int[]{1,3};
        instance.nextPermutation(nums3);
        assertArrayEquals(new int[]{3,1}, nums3);
        int[] nums4 = new int[]{3,1};
        instance.nextPermutation(nums4);
        assertArrayEquals(new int[]{1,3}, nums4);
        int[] nums5 = new int[]{2,3,1};
        instance.nextPermutation(nums5);
        assertArrayEquals(new int[]{3,1,2}, nums5);
        int[] nums6 = new int[]{1,2,3};
        instance.nextPermutation(nums6);
        assertArrayEquals(new int[]{1,3,2}, nums6);
        int[] nums7 = new int[]{3,2,1};
        instance.nextPermutation(nums7);
        assertArrayEquals(new int[]{1,2,3}, nums7);
        int[] nums8 = new int[]{1,1,5};
        instance.nextPermutation(nums8);
        assertArrayEquals(new int[]{1,5,1}, nums8);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
