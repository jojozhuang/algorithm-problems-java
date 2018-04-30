package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution153;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution153Test {
    
    public Solution153Test() {
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
     * Test of findMin method, of class Solution153.
     */
    @Test
    public void testFindMin() {
        System.out.println("findMin");
        Solution153 instance = new Solution153();

        assertEquals(-1, instance.findMin(null));
        assertEquals(1, instance.findMin(new int[] {1}));
        assertEquals(1, instance.findMin(new int[] {1, 2}));
        assertEquals(1, instance.findMin(new int[] {1, 2, 3}));
        assertEquals(1, instance.findMin(new int[] {3, 1, 2}));
        assertEquals(1, instance.findMin(new int[] {4, 3, 1, 2}));
        assertEquals(0, instance.findMin(new int[] {4, 5, 6, 7, 0, 1, 2}));
    }
}
