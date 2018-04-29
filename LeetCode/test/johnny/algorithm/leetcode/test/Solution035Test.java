package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution035;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution035Test {
    
    public Solution035Test() {
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
     * Test of searchInsert method, of class Solution035.
     */
    @Test
    public void testSearchInsert() {
        System.out.println("searchInsert");
        Solution035 instance = new Solution035();

        assertEquals(0, instance.searchInsert(null, 0));
        assertEquals(0, instance.searchInsert(new int[]{}, 0));
        assertEquals(0, instance.searchInsert(new int[]{1}, 0));
        assertEquals(0, instance.searchInsert(new int[]{1}, 1));
        assertEquals(2, instance.searchInsert(new int[]{1,2}, 3));
        assertEquals(0, instance.searchInsert(new int[]{1,2}, -1));
        assertEquals(1, instance.searchInsert(new int[]{1,2}, 2));
        assertEquals(0, instance.searchInsert(new int[]{1,2}, 1));
        assertEquals(4, instance.searchInsert(new int[]{1,2,3,4,5,6,7,8,9}, 5));
        assertEquals(9, instance.searchInsert(new int[]{1,2,3,4,5,6,7,8,9}, 10));
        assertEquals(8, instance.searchInsert(new int[]{1,2,3,4,5,6,7,8,9}, 9));
        assertEquals(1, instance.searchInsert(new int[]{1,5}, 4));
        assertEquals(2, instance.searchInsert(new int[]{0,1,4,5}, 2));
        assertEquals(2, instance.searchInsert(new int[]{1,3,5,6}, 5));
        assertEquals(1, instance.searchInsert(new int[]{1,3,5,6}, 2));
        assertEquals(4, instance.searchInsert(new int[]{1,3,5,6}, 7));
    }
}
