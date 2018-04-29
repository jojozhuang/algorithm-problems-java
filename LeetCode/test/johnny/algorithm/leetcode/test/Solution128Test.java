package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution128;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution128Test {
    
    public Solution128Test() {
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
     * Test of longestConsecutive method, of class Solution128.
     */
    @Test
    public void testLongestConsecutive() {
        System.out.println("longestConsecutive");
        int[] nums = null;
        Solution128 instance = new Solution128();
        int expResult = 0;
        int result = instance.longestConsecutive(nums);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.longestConsecutive(new int[] {0}));
        assertEquals(1, instance.longestConsecutive(new int[] {0,0}));
        assertEquals(4, instance.longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
        assertEquals(4, instance.longestConsecutive(new int[] {1, 9, 3, 10, 4, 20, 2}));
        assertEquals(5, instance.longestConsecutive(new int[] {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}));
    }
}
