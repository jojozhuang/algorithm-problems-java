package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution081;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution081Test {
    
    public Solution081Test() {
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
     * Test of search method, of class Solution081.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        Solution081 instance = new Solution081();

        assertEquals(false, instance.search(null, 0));
        assertEquals(true, instance.search(new int[] { 1 }, 1));
        assertEquals(false, instance.search(new int[] { 1 }, 0));
        assertEquals(true, instance.search(new int[] { 2, 1 }, 1));
        assertEquals(true, instance.search(new int[] { 2, 1 }, 2));
        assertEquals(false, instance.search(new int[] { 2, 1 }, 3));
        assertEquals(true, instance.search(new int[] { 2, 1, 1 }, 1));
        assertEquals(true, instance.search(new int[] { 1, 1, 2, 1 }, 2));
        assertEquals(false, instance.search(new int[] { 1, 1, 2, 1 }, 0));
    }
}
