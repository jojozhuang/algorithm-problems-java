package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution121;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution121Test {
    
    public Solution121Test() {
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
     * Test of maxProfit method, of class Solution121.
     */
    @Test
    public void testMaxProfit() {
        System.out.println("maxProfit");
        Solution121 instance = new Solution121();
        
        assertEquals(0, instance.maxProfit(null));
        assertEquals(1, instance.maxProfit(new int[]{3,2,3,1,2}));
        assertEquals(11, instance.maxProfit(new int[]{8,4,5,1,3,7,9,10,3,12}));
        assertEquals(8, instance.maxProfit(new int[]{8,4,5,12,3,7,9,10,3,1}));
        assertEquals(0, instance.maxProfit(new int[]{8,7,6,5,4,3,2,1}));
        assertEquals(12, instance.maxProfit(new int[]{1,3,5,6,7,8,9,13}));
    }
}
