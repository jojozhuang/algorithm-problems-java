package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution125;

public class Solution125Test extends JunitBase {

    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome");
        Solution125 instance = new Solution125();

        assertEquals(true, instance.isPalindrome(""));
        assertEquals(false, instance.isPalindrome("he"));
        assertEquals(false, instance.isPalindrome("0P"));
        assertEquals(false, instance.isPalindrome("he!234"));
        assertEquals(true, instance.isPalindrome("he! eh"));
        assertEquals(true, instance.isPalindrome("he! a Eh"));
        assertEquals(false, instance.isPalindrome("race a car"));
        assertEquals(true, instance.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
