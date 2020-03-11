package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution395Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("longestSubstring");
        Solution395 instance = new Solution395();

        assertEquals(1, instance.longestSubstring("a", 1));
        assertEquals(3, instance.longestSubstring("aaabb", 3));
        assertEquals(5, instance.longestSubstring("ababbc", 2));
        assertEquals(6, instance.longestSubstring("abcccddd", 3));
        assertEquals(9, instance.longestSubstring("abcccababf", 3));
        assertEquals(9, instance.longestSubstring("abcccabab", 3));
        assertEquals(3, instance.longestSubstring("aaabccc", 3));

    }
}
