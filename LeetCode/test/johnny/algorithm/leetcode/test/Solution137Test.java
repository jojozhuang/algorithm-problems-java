package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution137;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution137Test {
    
    public Solution137Test() {
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
     * Test of singleNumber method, of class Solution137.
     */
    @Test
    public void testSingleNumber() {
        System.out.println("singleNumber");
        Solution137 instance = new Solution137();

        assertEquals(0, instance.singleNumber(null));
        assertEquals(1, instance.singleNumber(new int[]{1}));
        assertEquals(2, instance.singleNumber(new int[]{1,2,1,1}));
        assertEquals(3, instance.singleNumber(new int[]{2,2,1,2,1,1,3}));
        assertEquals(4, instance.singleNumber(new int[]{1,1,2,3,3,3,2,2,4,1}));
    }
}
