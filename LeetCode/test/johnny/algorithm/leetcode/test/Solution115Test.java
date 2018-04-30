package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution115;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution115Test {
    
    public Solution115Test() {
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
     * Test of numDistinct method, of class Solution115.
     */
    @Test
    public void testNumDistinct() {
        System.out.println("numDistinct");
        Solution115 instance = new Solution115();

        assertEquals(0, instance.numDistinct("", null));
        assertEquals(1, instance.numDistinct("a", ""));
        assertEquals(1, instance.numDistinct("ab", "a"));
        assertEquals(2, instance.numDistinct("aa", "a"));
        assertEquals(1, instance.numDistinct("abc", "ab"));
        assertEquals(2, instance.numDistinct("abad", "ad"));
        assertEquals(3, instance.numDistinct("rabbbit", "rabbit"));
    }
}
