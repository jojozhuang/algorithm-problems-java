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
public class Solution324Test {
    
    public Solution324Test() {
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
     * Test of wiggleSort method, of class Solution324.
     */
    @Test
    public void testWiggleSort() {
        System.out.println("wiggleSort");
        int[] nums = null;
        Solution324 instance = new Solution324();
        instance.wiggleSort(nums);
        
        int[] nums2 = new int[]{1, 5, 1, 1, 6, 4};
        instance.wiggleSort(nums2);
        assertArrayEquals(new int[]{1, 6, 1, 5, 1, 4}, nums2);
        
        int[] nums3 = new int[]{1, 3, 2, 2, 3, 1};
        instance.wiggleSort(nums3);
        assertArrayEquals(new int[]{2, 3, 1, 3, 1, 2}, nums3);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
