package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution496;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution496Test {
    
    public Solution496Test() {
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
     * Test of nextGreaterElement method, of class Solution496.
     */
    @Test
    public void testNextGreaterElement() {
        System.out.println("nextGreaterElement");
        Solution496 instance = new Solution496();
        assertArrayEquals(new int[]{}, instance.nextGreaterElement(new int[]{}, new int[]{}));
        assertArrayEquals(new int[]{-1}, instance.nextGreaterElement(new int[]{1}, new int[]{1}));
        assertArrayEquals(new int[]{-1}, instance.nextGreaterElement(new int[]{2}, new int[]{1,2}));
        assertArrayEquals(new int[]{2,3}, instance.nextGreaterElement(new int[]{1,2}, new int[]{1,2,3}));
        assertArrayEquals(new int[]{2,3,4}, instance.nextGreaterElement(new int[]{1,2,3}, new int[]{1,2,3,4}));
        assertArrayEquals(new int[]{-1,-1,-1}, instance.nextGreaterElement(new int[]{3,2,1}, new int[]{4,3,2,1}));
        assertArrayEquals(new int[]{-1,3,-1}, instance.nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2}));
        assertArrayEquals(new int[]{3,-1}, instance.nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}