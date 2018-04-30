package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution188;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution188Test {
    
    public Solution188Test() {
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
     * Test of maxProfit method, of class Solution188.
     */
    @Test
    public void testMaxProfit() {
        System.out.println("maxProfit");
        Solution188 instance = new Solution188();

        assertEquals(0, instance.maxProfit(0, null));
        assertEquals(1, instance.maxProfit(1, new int[]{2,1,2,0,1}));
        assertEquals(2, instance.maxProfit(2, new int[]{2,1,2,0,1}));
        assertEquals(2, instance.maxProfit(3, new int[]{2,1,2,0,1}));
        assertEquals(1, instance.maxProfit(1, new int[]{3,2,3,1,2}));
        assertEquals(18, instance.maxProfit(2, new int[]{8,4,5,1,3,7,9,10,3,12}));
        assertEquals(15, instance.maxProfit(2, new int[]{8,4,5,12,3,7,9,10,3,1}));
        assertEquals(0, instance.maxProfit(2, new int[]{8,7,6,5,4,3,2,1}));
        assertEquals(12, instance.maxProfit(2, new int[]{1,3,5,6,7,8,9,13}));
        assertEquals(13, instance.maxProfit(2, new int[]{1,2,4,2,5,7,2,4,9,0}));
    }
}
