package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution276;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution276Test {
    
    public Solution276Test() {
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
     * Test of numWays method, of class Solution276.
     */
    @Test
    public void testNumWays() {
        System.out.println("numWays");
        Solution276 instance = new Solution276();

        assertEquals(0, instance.numWays(0, 0));
        assertEquals(2, instance.numWays(1, 2));
        assertEquals(9, instance.numWays(2, 3));
        assertEquals(24, instance.numWays(3, 3));
    }
}
