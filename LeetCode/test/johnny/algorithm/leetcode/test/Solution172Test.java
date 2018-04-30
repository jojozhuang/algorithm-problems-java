package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution172;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution172Test {
    
    public Solution172Test() {
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
     * Test of trailingZeroes method, of class Solution172.
     */
    @Test
    public void testTrailingZeroes() {
        System.out.println("trailingZeroes");
        Solution172 instance = new Solution172();

        assertEquals(0, instance.trailingZeroes(0));
        assertEquals(0, instance.trailingZeroes(1));
        assertEquals(0, instance.trailingZeroes(2));
        assertEquals(0, instance.trailingZeroes(3));
        assertEquals(0, instance.trailingZeroes(4));
        assertEquals(1, instance.trailingZeroes(5));
        assertEquals(1, instance.trailingZeroes(6));
        assertEquals(1, instance.trailingZeroes(7));
        assertEquals(1, instance.trailingZeroes(8));
        assertEquals(1, instance.trailingZeroes(9));
        assertEquals(2, instance.trailingZeroes(10));
        assertEquals(3, instance.trailingZeroes(15));
        assertEquals(4, instance.trailingZeroes(20));
        assertEquals(4, instance.trailingZeroes(24));
        assertEquals(6, instance.trailingZeroes(25));
        assertEquals(7, instance.trailingZeroes(30));
        assertEquals(24, instance.trailingZeroes(101));
        assertEquals(249, instance.trailingZeroes(1000));
        assertEquals(1151, instance.trailingZeroes(4617));
        assertEquals(452137076, instance.trailingZeroes(1808548329));
        assertEquals(536870902, instance.trailingZeroes(2147483647));
    }
}
