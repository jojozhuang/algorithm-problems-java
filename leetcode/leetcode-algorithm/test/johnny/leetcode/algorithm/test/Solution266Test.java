package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution266;

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
