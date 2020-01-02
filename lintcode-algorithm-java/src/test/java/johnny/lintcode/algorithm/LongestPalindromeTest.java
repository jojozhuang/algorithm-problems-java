package johnny.lintcode.algorithm;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

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
