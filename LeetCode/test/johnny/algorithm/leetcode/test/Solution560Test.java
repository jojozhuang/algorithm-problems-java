package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution560;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution560Test {
    
    public Solution560Test() {
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
     * Test of subarraySum method, of class Solution560.
     */
    @Test
    public void testSubarraySum() {
        System.out.println("subarraySum");
        int[] nums = null;
        int k = 0;
        Solution560 instance = new Solution560();
        int expResult = 0;
        int result = instance.subarraySum(nums, k);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.subarraySum(new int[]{1,2}, 3));
        assertEquals(1, instance.subarraySum(new int[]{1,2}, 2));
        assertEquals(0, instance.subarraySum(new int[]{1,2}, 4));
        assertEquals(3, instance.subarraySum(new int[]{1,1,1}, 1));
        assertEquals(2, instance.subarraySum(new int[]{1,1,1}, 2));
        assertEquals(1, instance.subarraySum(new int[]{1,1,1}, 3));
        assertEquals(4, instance.subarraySum(new int[]{1,2,1,2,1}, 3));
    }
}
