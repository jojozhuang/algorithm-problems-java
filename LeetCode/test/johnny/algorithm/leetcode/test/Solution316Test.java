package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution316;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution316Test {
    
    public Solution316Test() {
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
     * Test of removeDuplicateLetters method, of class Solution316.
     */
    @Test
    public void testRemoveDuplicateLetters() {
        System.out.println("removeDuplicateLetters");
        Solution316 instance = new Solution316();

        assertEquals("", instance.removeDuplicateLetters(""));
        assertEquals("abc", instance.removeDuplicateLetters("bcabc"));
        assertEquals("acdb", instance.removeDuplicateLetters("cbacdcbc"));
    }
}
