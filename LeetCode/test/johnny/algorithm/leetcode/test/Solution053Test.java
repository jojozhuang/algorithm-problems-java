package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution053;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution053Test {
    
    public Solution053Test() {
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
     * Test of maxSubArray method, of class Solution053.
     */
    @Test
    public void testMaxSubArray() {
        System.out.println("maxSubArray");
        int[] nums = null;
        Solution053 instance = new Solution053();
        int expResult = 0;
        int result = instance.maxSubArray(nums);
        assertEquals(expResult, result);
        
        assertEquals(7, instance.maxSubArray(new int[]{1,-2,3,4,-2}));
        assertEquals(4, instance.maxSubArray(new int[]{1,-2,1,3,-2}));
        assertEquals(11, instance.maxSubArray(new int[]{1,-2,5,1,-2,3,4}));
        assertEquals(6, instance.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
