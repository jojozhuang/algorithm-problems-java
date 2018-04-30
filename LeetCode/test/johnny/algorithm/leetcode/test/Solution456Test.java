package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution456;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution456Test {
    
    public Solution456Test() {
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
     * Test of find132pattern method, of class Solution456.
     */
    @Test
    public void testFind132pattern() {
        System.out.println("find132pattern");
        Solution456 instance = new Solution456();

        assertEquals(false, instance.find132pattern(null));
        assertEquals(true, instance.find132pattern(new int[]{-2,1,2,-2,1,2}));
        assertEquals(true, instance.find132pattern(new int[]{3,5,0,3,4}));
        assertEquals(false, instance.find132pattern(new int[]{1,2,3,4}));
        assertEquals(true, instance.find132pattern(new int[]{3,1,4,2}));
        assertEquals(true, instance.find132pattern(new int[]{-1,3,2,0}));
        assertEquals(false, instance.find132pattern(new int[]{2,2,2,2}));
        assertEquals(false, instance.find132pattern(new int[]{2,3,2,0}));
    }
}
