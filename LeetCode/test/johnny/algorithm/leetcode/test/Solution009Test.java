package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution009;

public class Solution009Test extends JunitBase {

    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome");
        Solution009 instance = new Solution009();

        assertEquals(true, instance.isPalindrome(0));
        assertEquals(true, instance.isPalindrome(1));
        assertEquals(true, instance.isPalindrome(99));
        assertEquals(false, instance.isPalindrome(34));
        assertEquals(false, instance.isPalindrome(-1));
        assertEquals(false, instance.isPalindrome(-13));
        assertEquals(false, instance.isPalindrome(-44));
        assertEquals(true, instance.isPalindrome(10001));
        assertEquals(false, instance.isPalindrome(10021));
        assertEquals(false, instance.isPalindrome(100441));
        assertEquals(true, instance.isPalindrome(10044001));
        assertEquals(true, instance.isPalindrome(234565432));
        assertEquals(false, instance.isPalindrome(1000));
        assertEquals(true, instance.isPalindrome(1001));
        assertEquals(false, instance.isPalindrome(-2147483648));
        assertEquals(false, instance.isPalindrome(2147483647));
        assertEquals(false, instance.isPalindrome(2147383412));
        assertEquals(true, instance.isPalindrome(2143883412));
        assertEquals(false, instance.isPalindrome(-2147447412));
    }
}
