package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution259;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution259Test {
    
    public Solution259Test() {
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
     * Test of threeSumSmaller method, of class Solution259.
     */
    @Test
    public void testThreeSumSmaller() {
        System.out.println("threeSumSmaller");
        Solution259 instance = new Solution259();

        assertEquals(0, instance.threeSumSmaller(null, 0));
        assertEquals(1, instance.threeSumSmaller(new int[]{-1, 1, -1, -1}, -1));
        assertEquals(2, instance.threeSumSmaller(new int[]{-2, 0, 1, 3}, 2));
        assertEquals(4, instance.threeSumSmaller(new int[]{-2, 0, 1, 2}, 4));
    }
    
}
