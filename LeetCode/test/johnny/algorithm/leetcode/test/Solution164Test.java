package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution164;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution164Test {
    
    public Solution164Test() {
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
     * Test of maximumGap method, of class Solution164.
     */
    @Test
    public void testMaximumGap() {
        System.out.println("maximumGap");
        Solution164 instance = new Solution164();

        assertEquals(0, instance.maximumGap(null));
        assertEquals(1, instance.maximumGap(new int[]{3,1,4,2}));
        assertEquals(6, instance.maximumGap(new int[]{5,9,8,3,15}));
        assertEquals(3, instance.maximumGap(new int[]{1,3,4,7}));
    }
}
