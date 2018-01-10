package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution152;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution152Test {
    
    public Solution152Test() {
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
     * Test of maxProduct method, of class Solution152.
     */
    @Test
    public void testMaxProduct() {
        System.out.println("maxProduct");
        int[] nums = null;
        Solution152 instance = new Solution152();
        int expResult = 0;
        int result = instance.maxProduct(nums);
        assertEquals(expResult, result);
        
        assertEquals(6, instance.maxProduct(new int[] {2,3,-2,4}));
        assertEquals(288, instance.maxProduct(new int[] {2,3,-2,4,-3,2,-1}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
