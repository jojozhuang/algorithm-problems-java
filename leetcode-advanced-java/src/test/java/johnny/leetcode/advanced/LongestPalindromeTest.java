package johnny.leetcode.advanced;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.leetcode.advanced.LongestPalindrome;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class LongestPalindromeTest {
    
    public LongestPalindromeTest() {
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
     * Test of longestPalindrome method, of class LongestPalindrome.
     */
    @Test
    public void testLongestPalindrome() {
        System.out.println("longestPalindrome");
        String s = "";
        LongestPalindrome instance = new LongestPalindrome();
        int expResult = 0;
        int result = instance.longestPalindrome(s);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.longestPalindrome("a"));
        assertEquals(1, instance.longestPalindrome("ab"));
        assertEquals(1, instance.longestPalindrome("abc"));
        assertEquals(3, instance.longestPalindrome("aba"));
        assertEquals(2, instance.longestPalindrome("aa"));
        assertEquals(5, instance.longestPalindrome("abcdefgfeaa"));
        assertEquals(7, instance.longestPalindrome("abbacdefgfedaa"));
        assertEquals(4, instance.longestPalindrome("abba"));
    }
}
