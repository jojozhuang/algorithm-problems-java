package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution080;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution080Test {
    
    public Solution080Test() {
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
     * Test of removeDuplicates method, of class Solution080.
     */
    @Test
    public void testRemoveDuplicates() {
        System.out.println("removeDuplicates");
        int[] nums = null;
        Solution080 instance = new Solution080();
        int expResult = 0;
        int result = instance.removeDuplicates(nums);
        assertEquals(expResult, result);
        
        assertEquals(2, instance.removeDuplicates(new int[] {1,2}));
        assertEquals(3, instance.removeDuplicates(new int[] {1,2,2}));
        assertEquals(3, instance.removeDuplicates(new int[] {1,2, 3}));
        assertEquals(5, instance.removeDuplicates(new int[] {1,1,1,2,2,3}));
    }
}
