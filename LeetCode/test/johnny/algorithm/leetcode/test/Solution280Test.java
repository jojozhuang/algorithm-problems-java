package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution280;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution280Test {
    
    public Solution280Test() {
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
     * Test of wiggleSort method, of class Solution280.
     */
    @Test
    public void testWiggleSort() {
        System.out.println("wiggleSort");
        int[] nums = null;
        Solution280 instance = new Solution280();
        instance.wiggleSort(nums);
        
        int[] nums2 = new int[]{1,2,3,4,5,6};
        instance.wiggleSort(nums2);
        
        assertArrayEquals(new int[]{1,3,2,5,4,6}, nums2);
    }
}
