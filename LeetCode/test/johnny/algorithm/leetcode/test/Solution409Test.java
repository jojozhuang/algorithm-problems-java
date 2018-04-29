package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution409;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution409Test {
    
    public Solution409Test() {
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
     * Test of longestPalindrome method, of class Solution409.
     */
    @Test
    public void testLongestPalindrome() {
        System.out.println("longestPalindrome");
        Solution409 instance = new Solution409();
        
        assertEquals(0, instance.longestPalindrome(""));
        assertEquals(1, instance.longestPalindrome("a"));
        assertEquals(1, instance.longestPalindrome("ab"));
        assertEquals(2, instance.longestPalindrome("aa"));
        assertEquals(3, instance.longestPalindrome("aab"));
        assertEquals(3, instance.longestPalindrome("abbb"));
        assertEquals(5, instance.longestPalindrome("abbccc"));
        assertEquals(7, instance.longestPalindrome("abccccdd"));
        assertEquals(5, instance.longestPalindrome("aaabbb"));
        assertEquals(6, instance.longestPalindrome("AAAAAA"));
        assertEquals(55, instance.longestPalindrome("zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez"));
        assertEquals(983, instance.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
    }
}
