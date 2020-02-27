package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class LongestPalindromeTest extends JunitBase {

    /**
     * Test of longestPalindrome method, of class LongestPalindrome.
     */
    @Test
    public void testLongestPalindrome() {
        System.out.println("testLongestPalindrome");
        LongestPalindrome instance = new LongestPalindrome();

        assertEquals(0, instance.longestPalindrome(""));
        assertEquals(1, instance.longestPalindrome("a"));
        assertEquals(2, instance.longestPalindrome("aa"));
        assertEquals(3, instance.longestPalindrome("aab"));
        assertEquals(3, instance.longestPalindrome("abbb"));
        assertEquals(7, instance.longestPalindrome("abccccdd"));
    }
}
