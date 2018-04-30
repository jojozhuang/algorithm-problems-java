package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution215;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution215Test {
    
    public Solution215Test() {
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
     * Test of findKthLargest method, of class Solution215.
     */
    @Test
    public void testFindKthLargest() {
        System.out.println("findKthLargest");
        Solution215 instance = new Solution215();
        
        assertEquals(0, instance.findKthLargest(null, 0));
        assertEquals(6, instance.findKthLargest(new int[]{3,2,1,5,6,4}, 1));
        assertEquals(5, instance.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
        assertEquals(4, instance.findKthLargest(new int[]{3,2,1,5,6,4}, 3));
        assertEquals(3, instance.findKthLargest(new int[]{3,2,1,5,6,4}, 4));
        assertEquals(2, instance.findKthLargest(new int[]{3,2,1,5,6,4}, 5));
        assertEquals(1, instance.findKthLargest(new int[]{3,2,1,5,6,4}, 6));
    }
}
