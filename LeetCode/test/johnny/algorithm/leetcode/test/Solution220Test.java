package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution220;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution220Test {
    
    public Solution220Test() {
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
     * Test of containsNearbyAlmostDuplicate method, of class Solution220.
     */
    @Test
    public void testContainsNearbyAlmostDuplicate() {
        System.out.println("containsNearbyAlmostDuplicate");
        int[] nums = null;
        int k = 0;
        int t = 0;
        Solution220 instance = new Solution220();
        boolean expResult = false;
        boolean result = instance.containsNearbyAlmostDuplicate(nums, k, t);
        assertEquals(expResult, result);
        
        assertEquals(false, instance.containsNearbyAlmostDuplicate(new int[]{1,8,4,10}, 2, 1));
        assertEquals(false, instance.containsNearbyAlmostDuplicate(new int[]{1,8,4,10}, 1, 3));
        assertEquals(true, instance.containsNearbyAlmostDuplicate(new int[]{1,8,4,10}, 2, 3));
        assertEquals(true, instance.containsNearbyAlmostDuplicate(new int[]{1,8,4,10}, 1, 4));
        assertEquals(true, instance.containsNearbyAlmostDuplicate(new int[]{1,8,4,10}, 2, 2));
    }
}
