package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution283;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution283Test {
    
    public Solution283Test() {
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
     * Test of moveZeroes method, of class Solution283.
     */
    @Test
    public void testMoveZeroes() {
        System.out.println("moveZeroes");
        int[] nums = null;
        Solution283 instance = new Solution283();
        instance.moveZeroes(nums);
        
        int[] nums2 = new int[]{0, 1, 0, 3, 12};
        instance.moveZeroes(nums2);
        int[] expect2 = new int[]{1, 3, 12, 0, 0};
        assertArrayEquals(expect2, nums2);
    }
}
