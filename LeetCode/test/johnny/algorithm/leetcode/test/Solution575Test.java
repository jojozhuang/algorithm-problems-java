package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution575;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution575Test {
    
    public Solution575Test() {
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
     * Test of distributeCandies method, of class Solution575.
     */
    @Test
    public void testDistributeCandies() {
        System.out.println("distributeCandies");
        Solution575 instance = new Solution575();

        assertEquals(0, instance.distributeCandies(new int[]{}));
        assertEquals(0, instance.distributeCandies(new int[]{1}));
        assertEquals(1, instance.distributeCandies(new int[]{1,2}));
        assertEquals(1, instance.distributeCandies(new int[]{1,1}));
        assertEquals(2, instance.distributeCandies(new int[]{1,2,3,4}));
        assertEquals(1, instance.distributeCandies(new int[]{1,1,1,1,1,1}));
        assertEquals(3, instance.distributeCandies(new int[]{1,1,2,2,3,3}));
        assertEquals(2, instance.distributeCandies(new int[]{1,1,2,3}));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
