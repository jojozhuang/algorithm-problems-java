package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution325;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution325Test {
    
    public Solution325Test() {
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
     * Test of maxSubArrayLen method, of class Solution325.
     */
    @Test
    public void testMaxSubArrayLen() {
        System.out.println("maxSubArrayLen");
        Solution325 instance = new Solution325();

        assertEquals(0, instance.maxSubArrayLen(null, 0));
        assertEquals(4, instance.maxSubArrayLen(new int[]{1, -1, 5, -2, 3}, 3));
        assertEquals(2, instance.maxSubArrayLen(new int[]{-2, -1, 2, 1}, 1));
    }
}
