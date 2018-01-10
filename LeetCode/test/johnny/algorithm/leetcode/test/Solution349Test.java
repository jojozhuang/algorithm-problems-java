package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution349;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution349Test {
    
    public Solution349Test() {
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
     * Test of intersection method, of class Solution349.
     */
    @Test
    public void testIntersection() {
        System.out.println("intersection");
        int[] nums1 = null;
        int[] nums2 = null;
        Solution349 instance = new Solution349();
        int[] expResult = new int[]{};
        int[] result = instance.intersection(nums1, nums2);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{2}, instance.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        assertArrayEquals(new int[]{3}, instance.intersection(new int[]{1, 2, 3}, new int[]{3, 4}));
        assertArrayEquals(new int[]{4,6}, instance.intersection(new int[]{1, 2, 3,4,5,6}, new int[]{4, 6}));
        assertArrayEquals(new int[]{}, instance.intersection(new int[]{1, 2}, new int[]{4, 6}));
        assertArrayEquals(new int[]{1,2}, instance.intersection(new int[]{1, 2}, new int[]{1, 2,3,4,5,6}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
}
