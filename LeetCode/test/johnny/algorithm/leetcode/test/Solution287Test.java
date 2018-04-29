package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution287;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution287Test {
    
    public Solution287Test() {
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
     * Test of findDuplicate method, of class Solution287.
     */
    @Test
    public void testFindDuplicate() {
        System.out.println("findDuplicate");
        int[] nums = null;
        Solution287 instance = new Solution287();
        int expResult = 0;
        int result = instance.findDuplicate(nums);
        assertEquals(expResult, result);
        
        assertEquals(5, instance.findDuplicate(new int[]{2,3,4,6,7,1,5,5}));
        assertEquals(1, instance.findDuplicate(new int[]{1,1,2}));
        assertEquals(1, instance.findDuplicate(new int[]{2,3,4,6,7,1,5,1}));
        assertEquals(3, instance.findDuplicate(new int[]{2,3,4,6,7,1,5,9,8,3}));
        assertEquals(3, instance.findDuplicate(new int[]{2,3,4,6,7,1,5,9,8,3,3}));
    }
}
