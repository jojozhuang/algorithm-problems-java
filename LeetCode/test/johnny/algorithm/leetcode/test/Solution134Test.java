package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution134;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution134Test {
    
    public Solution134Test() {
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
     * Test of canCompleteCircuit method, of class Solution134.
     */
    @Test
    public void testCanCompleteCircuit() {
        System.out.println("canCompleteCircuit");
        Solution134 instance = new Solution134();

        assertEquals(-1, instance.canCompleteCircuit(null, null));
        assertEquals(0, instance.canCompleteCircuit(new int[]{1,2,3}, new int[]{1,1,1}));
        assertEquals(-1, instance.canCompleteCircuit(new int[]{1,2,3}, new int[]{1,5,1}));
        assertEquals(2, instance.canCompleteCircuit(new int[]{1,2,3}, new int[]{1,4,1}));
    }
}
