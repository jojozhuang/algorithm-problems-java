package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution354;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution354Test {
    
    public Solution354Test() {
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
     * Test of maxEnvelopes method, of class Solution354.
     */
    @Test
    public void testMaxEnvelopes() {
        System.out.println("maxEnvelopes");
        int[][] envelopes = null;
        Solution354 instance = new Solution354();
        int expResult = 0;
        int result = instance.maxEnvelopes(envelopes);
        assertEquals(expResult, result);
        
        int[][] envelopes2 = new int[][] {
            {5,4},{6,4},{6,7},{2,3}
        };
        assertEquals(3, instance.maxEnvelopes(envelopes2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
