package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution201;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution201Test {
    
    public Solution201Test() {
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
     * Test of rangeBitwiseAnd method, of class Solution201.
     */
    @Test
    public void testRangeBitwiseAnd() {
        System.out.println("rangeBitwiseAnd");
        Solution201 instance = new Solution201();

        assertEquals(0, instance.rangeBitwiseAnd(0, 0));
        assertEquals(4, instance.rangeBitwiseAnd(5, 7));
        assertEquals(2, instance.rangeBitwiseAnd(2, 3));
        assertEquals(0, instance.rangeBitwiseAnd(0, Integer.MAX_VALUE));
    }
}
