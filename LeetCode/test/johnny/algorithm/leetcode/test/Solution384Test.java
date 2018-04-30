package johnny.algorithm.leetcode.test;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution384;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution384Test {
    
    public Solution384Test() {
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
     * Test of shuffle method, of class Solution384.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        Solution384 instance = new Solution384(new int[]{1,2,3});
        
        int[] result1 = instance.shuffle();
        Arrays.sort(result1);
        assertArrayEquals(new int[]{1,2,3}, result1);
        assertArrayEquals(new int[]{1,2,3}, instance.reset());
    }
}
