package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution318Test extends JunitBase {

    @Test
    public void testMaxProduct() {
        System.out.println("maxProduct");
        Solution318 instance = new Solution318();

        assertEquals(0, instance.maxProduct(null));
        assertEquals(16, instance.maxProduct(new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"}));
        assertEquals(4, instance.maxProduct(new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"}));
        assertEquals(0, instance.maxProduct(new String[]{"a", "aa", "aaa", "aaaa"}));
    }
}
