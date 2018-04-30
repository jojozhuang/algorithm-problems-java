package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution334;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution334Test {
    
    public Solution334Test() {
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
     * Test of increasingTriplet method, of class Solution334.
     */
    @Test
    public void testIncreasingTriplet() {
        System.out.println("increasingTriplet");
        Solution334 instance = new Solution334();

        assertEquals(false, instance.increasingTriplet(null));
        assertEquals(true, instance.increasingTriplet(new int[]{1,2,3}));
        assertEquals(true, instance.increasingTriplet(new int[]{1,2,3,4,5}));
        assertEquals(false, instance.increasingTriplet(new int[]{5,4,3,2,1}));
        assertEquals(true, instance.increasingTriplet(new int[]{1,2,1,4,3,2,1}));
        assertEquals(true, instance.increasingTriplet(new int[]{1,2,0,4,5,6,7}));
        assertEquals(true, instance.increasingTriplet(new int[]{5,1,5,5,2,5,4}));
        assertEquals(false, instance.increasingTriplet(new int[]{4,2,1,3}));
        assertEquals(false, instance.increasingTriplet(new int[]{1,1,1,1,2}));
    }
}
