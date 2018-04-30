package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution204;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution204Test {
    
    public Solution204Test() {
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
     * Test of countPrimes method, of class Solution204.
     */
    @Test
    public void testCountPrimes() {
        System.out.println("countPrimes");
        Solution204 instance = new Solution204();

        assertEquals(0, instance.countPrimes(0));
        assertEquals(0, instance.countPrimes(1));
        assertEquals(0, instance.countPrimes(2));
        assertEquals(1, instance.countPrimes(3));
        assertEquals(2, instance.countPrimes(4));
        assertEquals(2, instance.countPrimes(5));
        assertEquals(3, instance.countPrimes(6));
        assertEquals(3, instance.countPrimes(7));
        assertEquals(4, instance.countPrimes(8));
        assertEquals(4, instance.countPrimes(9));
        assertEquals(4, instance.countPrimes(10));
        assertEquals(4, instance.countPrimes(11));
        assertEquals(5, instance.countPrimes(12));
        assertEquals(41537, instance.countPrimes(499979));
    }
}
