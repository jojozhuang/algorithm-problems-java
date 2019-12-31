package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution409;

public class Solution409Test extends JunitBase {

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
