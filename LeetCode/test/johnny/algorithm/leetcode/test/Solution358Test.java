package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution358;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution358Test {
    
    public Solution358Test() {
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
     * Test of rearrangeString method, of class Solution358.
     */
    @Test
    public void testRearrangeString() {
        System.out.println("rearrangeString");
        Solution358 instance = new Solution358();

        assertEquals("", instance.rearrangeString("", 0));
        
        assertTrue(instance.rearrangeString("aabbcc", 3).equals("abcabc")||instance.rearrangeString("aabbcc", 3).equals("acbacb"));
        //assertEquals("abcabc", instance.rearrangeString("aabbcc", 3));
        assertEquals("", instance.rearrangeString("aaabc", 3));
        assertTrue(instance.rearrangeString("aaadbbcc", 2).equals("abacabcd")||instance.rearrangeString("aaadbbcc", 2).equals("abcabcad"));
        //assertEquals("abacabcd", instance.rearrangeString("aaadbbcc", 2));
    }
}
