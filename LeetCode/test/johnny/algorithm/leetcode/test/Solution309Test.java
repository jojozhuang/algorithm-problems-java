package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution309;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution309Test {
    
    public Solution309Test() {
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
     * Test of maxProfit method, of class Solution309.
     */
    @Test
    public void testMaxProfit() {
        System.out.println("maxProfit");
        Solution309 instance = new Solution309();

        assertEquals(0, instance.maxProfit(null));
        assertEquals(3, instance.maxProfit(new int[]{1, 2, 3, 0, 2}));
        assertEquals(4, instance.maxProfit(new int[]{1, 2, 5, 0, 2}));
    }
}
