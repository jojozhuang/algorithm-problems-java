package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution321;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution321Test {
    
    public Solution321Test() {
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
     * Test of maxNumber method, of class Solution321.
     */
    @Test
    public void testMaxNumber() {
        System.out.println("maxNumber");
        int[] nums1 = null;
        int[] nums2 = null;
        int k = 0;
        Solution321 instance = new Solution321();
        int[] expResult = null;
        int[] result = instance.maxNumber(nums1, nums2, k);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{9, 8, 6, 5, 3}, instance.maxNumber(new int[]{3, 4, 6, 5}, new int[]{9, 1, 2, 5, 8, 3}, 5));
        assertArrayEquals(new int[]{6, 7, 6, 0, 4}, instance.maxNumber(new int[]{6,7}, new int[]{6,0,4}, 5));
        assertArrayEquals(new int[]{9, 8, 9}, instance.maxNumber(new int[]{3, 9}, new int[]{8,9}, 3));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
