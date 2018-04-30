package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution643;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution643Test {
    
    public Solution643Test() {
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
     * Test of findMaxAverage method, of class Solution643.
     */
    @Test
    public void testFindMaxAverage() {
        System.out.println("findMaxAverage");
        Solution643 instance = new Solution643();

        assertEquals(0.0, instance.findMaxAverage(null, 0), 0.0);
        assertEquals(3, instance.findMaxAverage(new int[]{1,2,3}, 1), 0.0000001);
        assertEquals(2.5, instance.findMaxAverage(new int[]{1,2,3}, 2), 0.0000001);
        assertEquals(12.75, instance.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4), 0.0000001);
    }
}
