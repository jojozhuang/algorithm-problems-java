package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution395Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("longestSubstring");
        Solution395 instance = new Solution395();

        assertEquals(3, instance.longestSubstring("aaabb", 3));
        assertEquals(5, instance.longestSubstring("ababbc", 2));
    }
}
