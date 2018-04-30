package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution330;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution330Test {
    
    public Solution330Test() {
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
     * Test of minPatches method, of class Solution330.
     */
    @Test
    public void testMinPatches() {
        System.out.println("minPatches");
        Solution330 instance = new Solution330();
        
        assertEquals(0, instance.minPatches(null, 0));
        assertEquals(3, instance.minPatches(new int[]{}, 7));
        assertEquals(1, instance.minPatches(new int[]{1, 3}, 6));
        assertEquals(2, instance.minPatches(new int[]{1, 5, 10}, 20));
        assertEquals(0, instance.minPatches(new int[]{1, 2, 2}, 5));
        assertEquals(28, instance.minPatches(new int[]{1,2,31,33},2147483647));
    }
}
