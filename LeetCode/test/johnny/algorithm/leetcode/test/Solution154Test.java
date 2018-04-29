package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution154;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution154Test {
    
    public Solution154Test() {
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
     * Test of findMin method, of class Solution154.
     */
    @Test
    public void testFindMin() {
        System.out.println("findMin");
        int[] nums = null;
        Solution154 instance = new Solution154();
        int expResult = -1;
        int result = instance.findMin(nums);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.findMin(new int[] {1}));
        assertEquals(1, instance.findMin(new int[] {1, 2}));
        assertEquals(2, instance.findMin(new int[] {5,2,3}));
        assertEquals(2, instance.findMin(new int[] {3, 2, 3, 3, 3, 3}));
    }
}
