package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution260;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution260Test {
    
    public Solution260Test() {
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
     * Test of singleNumber method, of class Solution260.
     */
    @Test
    public void testSingleNumber() {
        System.out.println("singleNumber");
        int[] nums = null;
        Solution260 instance = new Solution260();
        int[] expResult = null;
        int[] result = instance.singleNumber(nums);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{2,1}, instance.singleNumber(new int[]{1,2}));
        assertArrayEquals(new int[]{2,3}, instance.singleNumber(new int[]{1,2,1,3}));
        assertArrayEquals(new int[]{2,3}, instance.singleNumber(new int[]{1,3,1,2}));
        assertArrayEquals(new int[]{0,4}, instance.singleNumber(new int[]{1,2,1,2,3,3,4,0}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
