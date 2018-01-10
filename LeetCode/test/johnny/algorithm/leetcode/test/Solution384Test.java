package johnny.algorithm.leetcode.test;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution384;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution384Test {
    
    public Solution384Test() {
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
     * Test of shuffle method, of class Solution384.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        
        int[] nums1 = new int[]{1,2,3};
        Solution384 instance = new Solution384(nums1);
        int[] result1 = instance.shuffle();
        Arrays.sort(result1);
        assertArrayEquals(nums1, result1);
        assertArrayEquals(nums1, instance.reset());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
