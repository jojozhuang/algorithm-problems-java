package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution239;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution239Test {
    
    public Solution239Test() {
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
     * Test of maxSlidingWindow method, of class Solution239.
     */
    @Test
    public void testMaxSlidingWindow() {
        System.out.println("maxSlidingWindow");
        int[] nums = null;
        int k = 0;
        Solution239 instance = new Solution239();
        int[] expResult = new int[]{};
        int[] result = instance.maxSlidingWindow(nums, k);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{1}, instance.maxSlidingWindow(new int[]{1}, 1));   
        assertArrayEquals(new int[]{3,3,5,5,6,7}, instance.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3));        
        assertArrayEquals(new int[]{7,7,8}, instance.maxSlidingWindow(new int[]{1, 2, 7, 7, 8}, 3));
        assertArrayEquals(new int[]{3,3,2,5}, instance.maxSlidingWindow(new int[]{1, 3, 1, 2, 0, 5}, 3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
