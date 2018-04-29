package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution016;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution016Test {
    
    public Solution016Test() {
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
     * Test of threeSumClosest method, of class Solution016.
     */
    @Test
    public void testThreeSumClosest() {
        System.out.println("threeSumClosest");
        Solution016 instance = new Solution016();

        assertEquals(0, instance.threeSumClosest(null, 0));
        assertEquals(2, instance.threeSumClosest(new int[]{-1,2,1,-4}, 1));
        assertEquals(2, instance.threeSumClosest(new int[]{-1,2,1,-4}, 2));
        assertEquals(-3, instance.threeSumClosest(new int[]{-1,2,1,-4}, -3));
        assertEquals(3, instance.threeSumClosest(new int[]{0,1,2}, 3));
    }
}
