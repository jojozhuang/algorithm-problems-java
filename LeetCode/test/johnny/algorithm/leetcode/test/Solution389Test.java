package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution389;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution389Test {
    
    public Solution389Test() {
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
     * Test of findTheDifference method, of class Solution389.
     */
    @Test
    public void testFindTheDifference() {
        System.out.println("findTheDifference");
        Solution389 instance = new Solution389();
        assertEquals(' ', instance.findTheDifference("", ""));
        assertEquals(' ', instance.findTheDifference("a", ""));
        assertEquals('y', instance.findTheDifference("", "y"));
        assertEquals(' ', instance.findTheDifference("a", "ccc"));
        assertEquals('d', instance.findTheDifference("abc", "abdc"));
        assertEquals('e', instance.findTheDifference("abcd", "abcde"));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
