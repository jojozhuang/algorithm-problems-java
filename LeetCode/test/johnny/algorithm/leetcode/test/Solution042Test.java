package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution042;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution042Test {
    
    public Solution042Test() {
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
     * Test of trap method, of class Solution042.
     */
    @Test
    public void testTrap() {
        System.out.println("trap");
        int[] height = null;
        Solution042 instance = new Solution042();
        int expResult = 0;
        int result = instance.trap(height);
        assertEquals(expResult, result);
        
        assertEquals(6, instance.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
    
}
