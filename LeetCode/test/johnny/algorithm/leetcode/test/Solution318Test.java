package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution318;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution318Test {
    
    public Solution318Test() {
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
     * Test of maxProduct method, of class Solution318.
     */
    @Test
    public void testMaxProduct() {
        System.out.println("maxProduct");
        String[] words = null;
        Solution318 instance = new Solution318();
        int expResult = 0;
        int result = instance.maxProduct(words);
        assertEquals(expResult, result);
        
        assertEquals(16, instance.maxProduct(new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"}));
        assertEquals(4, instance.maxProduct(new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"}));
        assertEquals(0, instance.maxProduct(new String[]{"a", "aa", "aaa", "aaaa"}));
    }
}
