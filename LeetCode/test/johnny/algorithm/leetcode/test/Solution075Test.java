package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution075;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution075Test {
    
    public Solution075Test() {
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
     * Test of sortColors method, of class Solution075.
     */
    @Test
    public void testSortColors() {
        System.out.println("sortColors");
        int[] nums = null;
        Solution075 instance = new Solution075();
        int[] expResult = null;
        instance.sortColors(nums);
        assertArrayEquals(expResult, nums);
        
        int[] nums2 = new int[]{};
        instance.sortColors(nums2);
        assertArrayEquals(new int[]{}, nums2);
        
        int[] nums3 = new int[]{0};
        instance.sortColors(nums3);
        assertArrayEquals(new int[]{0}, nums3);
        
        int[] nums4 = new int[]{0,1,2};
        instance.sortColors(nums4);
        assertArrayEquals(new int[]{0,1,2}, nums4);
        
        int[] nums5 = new int[]{2,1,0};
        instance.sortColors(nums5);
        assertArrayEquals(new int[]{0,1,2}, nums5);
        
        int[] nums6 = new int[]{2,1,0,2};
        instance.sortColors(nums6);
        assertArrayEquals(new int[]{0,1,2,2}, nums6);
        
        int[] nums7 = new int[]{2,1,0,2,0};
        instance.sortColors(nums7);
        assertArrayEquals(new int[]{0,0,1,2,2}, nums7);
        
        int[] nums8 = new int[]{2,1,0,2,0,1,2,2,2};
        instance.sortColors(nums8);
        assertArrayEquals(new int[]{0,0,1,1,2,2,2,2,2}, nums8);
        
        int[] nums9 = new int[]{0,0,0,2,1,0,2,0,1,2,2,2};
        instance.sortColors(nums9);
        assertArrayEquals(new int[]{0,0,0,0,0,1,1,2,2,2,2,2}, nums9);
    }
}
