package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution084;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution084Test {
    
    public Solution084Test() {
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
     * Test of largestRectangleArea method, of class Solution084.
     */
    @Test
    public void testLargestRectangleArea() {
        System.out.println("largestRectangleArea");
        Solution084 instance = new Solution084();

        assertEquals(0, instance.largestRectangleArea(null));
        assertEquals(6, instance.largestRectangleArea(new int[]{4,3}));
        assertEquals(10, instance.largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }
}
