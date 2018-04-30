package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution151;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution151Test {
    
    public Solution151Test() {
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
     * Test of reverseWords method, of class Solution151.
     */
    @Test
    public void testReverseWords() {
        System.out.println("reverseWords");
        Solution151 instance = new Solution151();

        assertEquals("", instance.reverseWords(""));
        assertEquals("vc", instance.reverseWords(" vc "));
        assertEquals("aa", instance.reverseWords(" aa "));
        assertEquals("the blue", instance.reverseWords("   blue   the  "));
        assertEquals("the sky is blue", instance.reverseWords("blue is sky the"));
    }
}
