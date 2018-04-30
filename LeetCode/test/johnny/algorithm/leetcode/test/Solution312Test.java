package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution312;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution312Test {
    
    public Solution312Test() {
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
     * Test of maxCoins method, of class Solution312.
     */
    @Test
    public void testMaxCoins() {
        System.out.println("maxCoins");
        Solution312 instance = new Solution312();

        assertEquals(0, instance.maxCoins(null));
        assertEquals(167, instance.maxCoins(new int[]{3, 1, 5, 8}));
    }
}
