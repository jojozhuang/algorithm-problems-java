package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution136;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution136Test {
    
    public Solution136Test() {
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
     * Test of singleNumber method, of class Solution136.
     */
    @Test
    public void testSingleNumber() {
        System.out.println("singleNumber");
        Solution136 instance = new Solution136();

        assertEquals(0, instance.singleNumber(null));
        assertEquals(1, instance.singleNumber(new int[] {1}));
        assertEquals(0, instance.singleNumber(new int[] {1,0,1}));
        assertEquals(2, instance.singleNumber(new int[] {1,3,1,2,3}));
        assertEquals(4, instance.singleNumber(new int[] {1,2,2,1,3,4,3}));
    }
}
