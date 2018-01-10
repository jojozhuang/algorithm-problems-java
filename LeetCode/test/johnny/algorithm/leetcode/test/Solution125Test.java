package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution125;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution125Test {
    
    public Solution125Test() {
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
     * Test of isPalindrome method, of class Solution125.
     */
    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome");
        String s = "";
        Solution125 instance = new Solution125();
        boolean expResult = true;
        boolean result = instance.isPalindrome(s);
        assertEquals(expResult, result);
        
        assertEquals(false, instance.isPalindrome("he"));
        assertEquals(false, instance.isPalindrome("0P"));
        assertEquals(false, instance.isPalindrome("he!234"));
        assertEquals(true, instance.isPalindrome("he! eh"));
        assertEquals(true, instance.isPalindrome("he! a Eh"));
        assertEquals(false, instance.isPalindrome("race a car"));
        assertEquals(true, instance.isPalindrome("A man, a plan, a canal: Panama"));

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
