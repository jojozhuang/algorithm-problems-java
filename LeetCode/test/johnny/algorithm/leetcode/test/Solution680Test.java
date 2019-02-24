package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution680;

public class Solution680Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("validPalindrome");
        Solution680 instance = new Solution680();

        assertEquals(true, instance.validPalindrome("aba"));
        assertEquals(true, instance.validPalindrome("abca"));
        assertEquals(true, instance.validPalindrome("deeeee"));
        assertEquals(false, instance.validPalindrome("abc"));
    }
}
