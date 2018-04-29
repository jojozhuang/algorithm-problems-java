package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution209;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution209Test {
    
    public Solution209Test() {
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
     * Test of minSubArrayLen method, of class Solution209.
     */
    @Test
    public void testMinSubArrayLen() {
        System.out.println("minSubArrayLen");
        int s = 0;
        int[] nums = null;
        Solution209 instance = new Solution209();
        int expResult = 0;
        int result = instance.minSubArrayLen(s, nums);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.minSubArrayLen(1, new int[]{1}));
        assertEquals(0, instance.minSubArrayLen(2, new int[]{1}));
        assertEquals(1, instance.minSubArrayLen(2, new int[]{2,3}));
        assertEquals(2, instance.minSubArrayLen(5, new int[]{2,3}));
        assertEquals(0, instance.minSubArrayLen(6, new int[]{2,3}));
        assertEquals(2, instance.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
        assertEquals(1, instance.minSubArrayLen(3, new int[]{2,3,1,2,4,3}));
        assertEquals(2, instance.minSubArrayLen(5, new int[]{2,3,1,2,4,3}));
        assertEquals(3, instance.minSubArrayLen(9, new int[]{2,3,1,2,4,3}));
        assertEquals(4, instance.minSubArrayLen(10, new int[]{2,3,1,2,4,3}));
        assertEquals(6, instance.minSubArrayLen(15, new int[]{2,3,1,2,4,3}));
        assertEquals(0, instance.minSubArrayLen(16, new int[]{2,3,1,2,4,3}));
    }
}
