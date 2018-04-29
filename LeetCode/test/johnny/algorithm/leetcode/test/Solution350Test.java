package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution350;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution350Test {
    
    public Solution350Test() {
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
     * Test of intersect method, of class Solution350.
     */
    @Test
    public void testIntersect() {
        System.out.println("intersect");
        int[] nums1 = null;
        int[] nums2 = null;
        Solution350 instance = new Solution350();
        int[] expResult = new int[]{};
        int[] result = instance.intersect(nums1, nums2);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{2,2}, instance.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        assertArrayEquals(new int[]{3}, instance.intersect(new int[]{1, 2, 3}, new int[]{3, 4}));
        assertArrayEquals(new int[]{4,6}, instance.intersect(new int[]{1, 2, 3,4,5,6}, new int[]{4, 6}));
        assertArrayEquals(new int[]{}, instance.intersect(new int[]{1, 2}, new int[]{4, 6}));
        assertArrayEquals(new int[]{1,2}, instance.intersect(new int[]{1, 2}, new int[]{1, 2,3,4,5,6}));
        assertArrayEquals(new int[]{1,1,2}, instance.intersect(new int[]{1, 1,2}, new int[]{1, 1,2,4,5,6}));
    }
}
