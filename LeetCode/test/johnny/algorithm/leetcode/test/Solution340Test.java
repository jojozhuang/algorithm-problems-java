package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution340;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution340Test {
    
    public Solution340Test() {
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
     * Test of lengthOfLongestSubstringKDistinct method, of class Solution340.
     */
    @Test
    public void testLengthOfLongestSubstringKDistinct() {
        System.out.println("lengthOfLongestSubstringKDistinct");
        Solution340 instance = new Solution340();

        assertEquals(0, instance.lengthOfLongestSubstringKDistinct("", 0));
        assertEquals(3, instance.lengthOfLongestSubstringKDistinct("eceba", 2));
    }
}
