package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution371;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution371Test {
    
    public Solution371Test() {
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
     * Test of getSum method, of class Solution371.
     */
    @Test
    public void testGetSum() {
        System.out.println("getSum");
        Solution371 instance = new Solution371();

        assertEquals(0, instance.getSum(0, 0));
        assertEquals(3, instance.getSum(1, 2));
    }
}
