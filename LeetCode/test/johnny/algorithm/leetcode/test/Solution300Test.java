package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution300;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution300Test {
    
    public Solution300Test() {
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
     * Test of lengthOfLIS method, of class Solution300.
     */
    @Test
    public void testLengthOfLIS() {
        System.out.println("lengthOfLIS");
        int[] nums = null;
        Solution300 instance = new Solution300();
        int expResult = 0;
        int result = instance.lengthOfLIS(nums);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.lengthOfLIS(new int[]{1}));
        assertEquals(3, instance.lengthOfLIS(new int[]{1,2,3}));
        assertEquals(3, instance.lengthOfLIS(new int[]{1,4,2,3}));
        assertEquals(2, instance.lengthOfLIS(new int[]{5,2,1,3}));
        assertEquals(4, instance.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        assertEquals(3, instance.lengthOfLIS(new int[]{5, 4, 1, 2, 3}));
        assertEquals(4, instance.lengthOfLIS(new int[]{4, 2, 4, 5, 3, 7}));
    }
}
