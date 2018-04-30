package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution274;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution274Test {
    
    public Solution274Test() {
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
     * Test of hIndex method, of class Solution274.
     */
    @Test
    public void testHIndex() {
        System.out.println("hIndex");
        Solution274 instance = new Solution274();

        assertEquals(0, instance.hIndex(null));
        assertEquals(1, instance.hIndex(new int[]{1,1,1,1,1}));
        assertEquals(3, instance.hIndex(new int[]{3, 0, 6, 1, 5}));
        assertEquals(4, instance.hIndex(new int[]{10, 8, 5, 4, 3}));
        assertEquals(3, instance.hIndex(new int[]{25, 8, 5, 3, 3}));
        assertEquals(5, instance.hIndex(new int[]{10, 10, 10, 10, 10}));
    }
}
