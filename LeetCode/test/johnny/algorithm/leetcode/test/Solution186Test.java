package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution186;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution186Test {
    
    public Solution186Test() {
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
     * Test of reverseWords method, of class Solution186.
     */
    @Test
    public void testReverseWords() {
        System.out.println("reverseWords");
        char[] s = null;
        Solution186 instance = new Solution186();
        instance.reverseWords(s);
        
        char[] s2 = "vc".toCharArray();
        instance.reverseWords(s2);
        assertArrayEquals("vc".toCharArray(), s2);
        
        char[] s3 = "blue the".toCharArray();
        instance.reverseWords(s3);
        assertArrayEquals("the blue".toCharArray(), s3);
        
        char[] s4 = "blue is sky the".toCharArray();
        instance.reverseWords(s4);
        assertArrayEquals("the sky is blue".toCharArray(), s4);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
