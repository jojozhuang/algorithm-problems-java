package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution266Test extends JunitBase {

    @Test
    public void testCanPermutePalindrome() {
        System.out.println("canPermutePalindrome");
        Solution266 instance = new Solution266();

        assertEquals(false, instance.canPermutePalindrome(""));
        assertEquals(true, instance.canPermutePalindrome("d"));
        assertEquals(false, instance.canPermutePalindrome("code"));
        assertEquals(true, instance.canPermutePalindrome("aab"));
        assertEquals(true, instance.canPermutePalindrome("carerac"));
    }
}
